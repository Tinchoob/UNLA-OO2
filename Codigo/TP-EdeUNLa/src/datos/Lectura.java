package datos;

import java.time.LocalDate;

public class Lectura {
	protected long idLectura;
	protected LocalDate fechaHoraLectura;
	protected Inspector inspector;
	protected Medidor medidor;

	public Lectura() {
	}

	public Lectura(LocalDate fechaHoraLectura, Inspector inspector, Medidor medidor) {
		super();
		this.fechaHoraLectura = fechaHoraLectura;
		this.inspector = inspector;
		this.medidor = medidor;
	}

	public long getIdLectura() {
		return idLectura;
	}

	public void setIdLectura(long idLectura) {
		this.idLectura = idLectura;
	}

	public LocalDate getFechaHoraLectura() {
		return fechaHoraLectura;
	}

	public void setFechaHoraLectura(LocalDate fechaHoraLectura) {
		this.fechaHoraLectura = fechaHoraLectura;
	}

	public Inspector getInspector() {
		return inspector;
	}

	public void setInspector(Inspector inspector) {
		this.inspector = inspector;
	}

	public Medidor getMedidor() {
		return medidor;
	}

	public void setMedidor(Medidor medidor) {
		this.medidor = medidor;
	}

	@Override
	public String toString() {
		return "Lectura [idLectura=" + idLectura + ", fechaHoraLectura=" + fechaHoraLectura + ", inspector=" + inspector
				+ ", medidor=" + medidor + "]";
	}

}
