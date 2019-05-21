package datos;

import java.time.LocalDate;
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
	private Tarifario tarifario;

	public Factura() {
	}

	public Factura(String cliente, Lectura lectura, LocalDate fecha, int nroMedidor, String observaciones,
			Tarifario tarifario) throws Exception {
		this.cliente = cliente;
		this.lectura = lectura;
		this.fecha = fecha;
		this.nroMedidor = nroMedidor;
		// this.getLectura().getMedidor().getNroSerie(); (la forma automatica de tomar
		// el nroMedidor sin tener que agregarlo nosotros)
		this.observaciones = observaciones;
		this.generarDetalle();
		this.tarifario = tarifario;

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

	public Tarifario getTarifario() {
		return tarifario;
	}

	public void setTarifario(Tarifario tarifario) {
		this.tarifario = tarifario;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", cliente=" + cliente + ", lectura=" + lectura + ", fecha=" + fecha
				+ ", nroMedidor=" + nroMedidor + ", observaciones=" + observaciones + ", tarifario=" + tarifario + "]";
	}

	public void generarDetalle() throws Exception {
		double consumo = 0, consumoPeriodoAnterior = 0;
		ItemFactura item1 = null;
		ItemFactura item2 = null;
		ItemFactura item3 = null;
		ItemFactura item4 = null;
		int i = 0;
		if (!tarifario.estaActivo) {
			throw new Exception("ERROR: El tarifario esta desactualizado.");
		}

		if (lectura instanceof LecturaBajaDemanda) {
			if (tarifario instanceof TarifarioBajaDemanda) {
				for (i = 0; i < 2; i++) {
					switch (i) {
					case 1:
						item1.setDetalle("Cargo Fijo:");
						item1.setPrecioUnitario(tarifario.getMontoFijo());
						item1.setCantidad(1);
						item1.setUnidad("$/mes");
						break;

					case 2:
						item2.setDetalle("Cargo Variable:");
						item2.setPrecioUnitario(((TarifarioBajaDemanda) tarifario).getMontoVariable());
						item2.setCantidad(1);
						item2.setUnidad("$/kWh");
						break;
					}
				}
			}
		}
		if (lectura instanceof LecturaAltaDemanda) {
			for (i = 0; i < 4; i++) {
				switch (i) {

				case 1:
					item1.setDetalle("Cargo Fijo:");
					item1.setPrecioUnitario(tarifario.getMontoFijo());

				}
			}
		}

	}

	public double calcularConsumoBajaDemanda() {
		double consumo = 0, consumoPeriodoAnterior = 0;
		consumoPeriodoAnterior = FacturaABM.getInstancia().traerConsumoAnteriorBajaDemanda(fecha);
		consumo = ((LecturaBajaDemanda) lectura).getConsumo();
		consumo = consumo - consumoPeriodoAnterior;
		return consumo;
	}

	public double calcularConsumoAltaDemanda() {

	}

	/*
	 * public double calcularTotal(){ List<ItemFactura> detalle = new
	 * ArrayList<ItemFactura>(lstItem); double totalFactura = 0; }
	 */

	// public LocalDate calcularVencimiento() {

	// }

}
