package datos;

import java.time.LocalDate;
import java.util.Set;

public class Tarifa {
	protected long idTarifa;
	protected String servicio;
	protected Set<Factura> facturas;
	protected LocalDate fechaActualizacion;

	public Tarifa() {
	}

	public Tarifa(String servicio,LocalDate fechaActualizacion) {
		this.servicio = servicio;
		this.fechaActualizacion = fechaActualizacion;
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

	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(LocalDate fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	@Override
	public String toString() {
		return "Tarifa [idTarifa=" + idTarifa + ", servicio=" + servicio + "]";
	}

}