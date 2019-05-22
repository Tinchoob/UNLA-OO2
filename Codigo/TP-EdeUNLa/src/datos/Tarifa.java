package datos;

import java.time.LocalDate;
import java.util.Set;

public class Tarifa {
	protected long idTarifa;
	protected String servicio;

	public Tarifa(String servicio) {
		super();
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

	@Override
	public String toString() {
		return "Tarifa [idTarifa=" + idTarifa + ", servicio=" + servicio + "]";
	}

}