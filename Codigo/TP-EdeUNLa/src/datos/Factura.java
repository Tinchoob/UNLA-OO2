package datos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import negocio.FacturaABM;

public class Factura {
	private long idFactura;
	private String cliente;
	private Lectura lectura;
	private LocalDate fecha;
	private int nroMedidor;
	private String observaciones;
	private Set<ItemFactura> lstItem;
	private Tarifa tarifa;

	public Factura() {
	}

	public Factura(String cliente, Lectura lectura, LocalDate fecha, int nroMedidor, String observaciones,
			Tarifa tarifa) throws Exception {
		this.cliente = cliente;
		this.lectura = lectura;
		this.fecha = fecha;
		this.nroMedidor = nroMedidor;
		// this.getLectura().getMedidor().getNroSerie(); (la forma automatica de tomar
		// el nroMedidor sin tener que agregarlo nosotros)
		this.observaciones = observaciones;
		this.tarifa = tarifa;
		this.generarDetalle();
		

	}

	public long getIdFactura() {
		return idFactura;
	}

	protected void setIdFactura(long idFactura) {
		this.idFactura = idFactura;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Lectura getLectura() {
		return lectura;
	}

	public void setLectura(Lectura lectura) {
		this.lectura = lectura;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getNroMedidor() {
		return nroMedidor;
	}

	public void setNroMedidor(int nroMedidor) {
		this.nroMedidor = nroMedidor;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Set<ItemFactura> getLstItem() {
		return lstItem;
	}

	public void setLstItem(Set<ItemFactura> lstItem) {
		this.lstItem = lstItem;
	}

	public Tarifa getTarifa() {
		return tarifa;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", cliente=" + cliente + ", lectura=" + lectura + ", fecha=" + fecha
				+ ", nroMedidor=" + nroMedidor + ", observaciones=" + observaciones + ", tarifa=" + tarifa + "]";
	}

	public void generarDetalle() {
		double consumo = 0, consumoPeriodoAnterior = 0;
		int i = 0;
		
		//datos ItemFactura
		String detalle="";
		double precioUnitario=0;
		int cantidad=0;
		String unidad="";
		// la factura es this
		
		this.lstItem = new HashSet<ItemFactura>();		
		
		
		

//		if (!tarifa.) {
//			throw new Exception("ERROR: El tarifario esta desactualizado.");
//		}

		if (lectura instanceof LecturaBajaDemanda) {
			if (tarifa instanceof TarifaBaja) {
				for (i = 0; i < 2; i++) {
					switch (i) {
					case 0:
						detalle="Cargo Fijo";
						precioUnitario=0; //valor placeholder falta metodo
						cantidad=1;
						unidad="$/mes";
						break;

					case 1:
						detalle="Cargo Variable";
						precioUnitario=0; //valor placeholder falta metodo
						cantidad=1;
						unidad="$/kWh";
						break;
					}
					//aca poner el create item + add del tp de cuotas
					ItemFactura item = new ItemFactura(detalle,precioUnitario,cantidad,unidad,this);
					lstItem.add(item);
					
					
				}
			}
			
		}
	/*	if (lectura instanceof LecturaAltaDemanda) {
			for (i = 0; i < 4; i++) {
				switch (i) {

				case 0:
					item1.setDetalle("Cargo Fijo:");
					// item1.setPrecioUnitario(tarifa.getMontoFijo());
					item1.setCantidad(1);
					item1.setUnidad("$/mes");

				case 1:
					item2.setDetalle("Cargo Variable Pico:");
					// item2.setPrecioUnitario();
					item2.setCantidad(1);
					item2.setUnidad("$/kWh");

				case 2:
					item2.setDetalle("Cargo Variable Resto:");
					// item2.setPrecioUnitario();
					item2.setCantidad(1);
					item2.setUnidad("$/kWh");

				case 3:
					item2.setDetalle("Cargo Variable Valle:");
					// item2.setPrecioUnitario();
					item2.setCantidad(1);
					item2.setUnidad("$/kWh");
				}
			}
		}*/

	}

/*	public double calcularMontoFijoBajaDemanda() {

		TarifaBaja tarifa = (TarifaBaja) this.tarifa;
		List<DetalleBaja> detallesTarifa = new ArrayList<DetalleBaja>(tarifa.getDetalles());
		double consumo = this.calcularConsumoBajaDemanda();
		double montoFijo = 0;

		for (DetalleBaja detalle : detallesTarifa) {

			if (detalle.getUnidad() == 'Cargo fijo' && consumo >= detalle.getDesde() && consumo <= detalle.getHasta()) {
				montoFijo = detalle.getValor();
				continue;
				//TODO: cambiar foreach
			}
		}
		return montoFijo;
	}*/

 //	public double calcularMontoVariableBajaDemanda() {}

	public double calcularConsumoBajaDemanda() {
		double consumo = 0, consumoPeriodoAnterior = 0;
		consumoPeriodoAnterior = FacturaABM.getInstancia().traerConsumoAnteriorBajaDemanda(fecha);
		consumo = ((LecturaBajaDemanda) lectura).getConsumo();
		consumo = consumo - consumoPeriodoAnterior;
		return consumo;
	}

//	public double calcularConsumoAltaDemanda() {
//
//	}
}

/*
 * public double calcularTotal(){ List<ItemFactura> detalle = new
 * ArrayList<ItemFactura>(lstItem); double totalFactura = 0; }
 */

// public LocalDate calcularVencimiento() {

// }
