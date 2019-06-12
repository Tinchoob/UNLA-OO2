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
			Tarifa tarifa) {
		this.cliente = cliente;
		this.lectura = lectura;
		this.fecha = fecha;
		this.nroMedidor = nroMedidor;
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
		return "Factura [idFactura=" + idFactura + ", cliente=" + cliente + ", lectura=" + lectura.getIdLectura()
				+ ", fecha=" + fecha + ", nroMedidor=" + nroMedidor + ", observaciones=" + observaciones + ", tarifa="
				+ tarifa.getIdTarifa() + "]";
	}

	public void generarDetalle() {
		int i = 0, j = 0;
		// datos ItemFactura
		String detalle = "";
		double precioUnitario = 0;
		int cantidad = 0;
		String unidad = "";
		// this para la factura
		lstItem = new HashSet<ItemFactura>();
		for (j = 0; j < 2; j++) {
			
			observaciones="Mes: "+i;
			if (lectura instanceof LecturaBajaDemanda) {
				if (tarifa instanceof TarifaBaja) {

					for (i = 0; i < 2; i++) {
						switch (i) {
						case 0:
							detalle = "Cargo Fijo";
							precioUnitario = asignacionDeCargoFijo(tarifa, this.lectura); // valor placeholder falta
																							// metodo
							cantidad = 1;
							unidad = "$/mes";
							break;

						case 1:
							detalle = "Cargo Variable";
							precioUnitario = asignacionDeCargoVariable(tarifa, this.lectura)/2; // valor placeholder falta
							cantidad = 1;
							unidad = "$/kWh";
							break;
						}
						// aca poner el create item + add del tp de cuotas
						ItemFactura item = new ItemFactura(detalle, precioUnitario, cantidad, unidad, this);
						lstItem.add(item);
					}

				}
			}

			if (lectura instanceof LecturaAltaDemanda) {
				if (tarifa instanceof TarifaAlta) {

					for (i = 0; i < 4; i++) {
						switch (i) {

						case 0:
							detalle = "Cargo Fijo";
							precioUnitario = 0; // valor placeholder falta metodo
							cantidad = 1;
							unidad = "$/mes";
							break;

						case 1:
							detalle = "Cargo Variable Pico";
							precioUnitario = 0; // valor placeholder falta metodo
							cantidad = 1;
							unidad = "$/mes";
							break;

						case 2:
							detalle = "Cargo Variable Resto";
							precioUnitario = 0;
							cantidad = 1;
							unidad = "$/kWh";
							break;

						case 3:
							detalle = "Cargo Variable Valle";
							precioUnitario = 0;
							cantidad = 1;
							unidad = "$/kWh";
							break;
						}

						ItemFactura item = new ItemFactura(detalle, precioUnitario, cantidad, unidad, this);
						lstItem.add(item);
					}
				}
			}
		}
	}




	public double calcularConsumoBajaDemanda() {
		double consumo = 0, consumoPeriodoAnterior = 0;
		if (FacturaABM.getInstancia().traerFacturaPeriodoAnterior(fecha) != null) {
			consumoPeriodoAnterior = FacturaABM.getInstancia().traerConsumoAnteriorBajaDemanda(fecha);
		}
		consumo = ((LecturaBajaDemanda) this.lectura).getConsumo();
		consumo = consumo - consumoPeriodoAnterior;
		return consumo;
	}

	/*
	 * public double calcularConsumoAltaDemanda() { double consumo=0;
	 * consumoPeriodoAnterior=0;
	 * 
	 * }
	 */

	public double asignacionDeCargoFijo(Tarifa tarifa, Lectura lectura) {
		double consumo = calcularConsumoBajaDemanda(), cargoFijo = 0;
		String detalleCargo = "Cargo fijo";
		for (DetalleBaja d : ((TarifaBaja) tarifa).getDetalles()) {
			if (d.getDesde() <= consumo && d.getHasta() >= consumo) {
				if (d.getDetalleConcepto().equals(detalleCargo)) {
					cargoFijo = d.getValor();
				}
			}
		}
		return cargoFijo;
	}

	public double asignacionDeCargoVariable(Tarifa tarifa, Lectura lectura) {
		double consumo = ((LecturaBajaDemanda) this.lectura).getConsumo(), valor = 0, cargoVariable = 0;
		String detalleCargo = "Cargo variable";
		for (DetalleBaja d : ((TarifaBaja) tarifa).getDetalles()) {
			if (d.getDesde() <= consumo && d.getHasta() >= consumo) {
				if (d.getDetalleConcepto().equals(detalleCargo)) {
					valor = d.getValor();
					cargoVariable = consumo * valor;
				}
			}
		}
		return cargoVariable;
	}
}

/*
 * public double calcularTotal(){ List<ItemFactura> detalle = new
 * ArrayList<ItemFactura>(lstItem); double totalFactura = 0; }
 */

// public LocalDate calcularVencimiento() {

// }
