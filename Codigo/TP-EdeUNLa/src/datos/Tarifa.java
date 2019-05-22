package datos;

import java.util.Set;

public class Tarifa {
	protected long idTarifa;
	protected String servicio;
	protected Set<Factura> facturas;
	
	public Tarifa() {}

	public Tarifa(String servicio) {
		this.servicio = servicio;
	}

	public long getIdTarifa() {
		return idTarifa;
	}

	protected void setIdTarifa(long idTarifa) {
		this.idTarifa = idTarifa;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	

	public Set<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(Set<Factura> facturas) {
		this.facturas = facturas;
	}

	@Override
	public String toString() {
		return "Tarifa [idTarifa=" + idTarifa + ", servicio=" + servicio + "]";
	}

}