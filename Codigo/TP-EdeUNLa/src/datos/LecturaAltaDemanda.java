package datos;

import java.time.LocalDate;

public class LecturaAltaDemanda extends Lectura {
	private String tipoTension;
	private float consumoHorasPico;
	private float consumoHorasValle;
	private float consumoHorasResto;

	public LecturaAltaDemanda() {
	}

	public LecturaAltaDemanda(LocalDate fechaHoraLectura, Inspector inspector, Medidor medidor, String tipoTension,
			float consumoHorasPico, float consumoHorasValle, float consumoHorasResto) {
		super(fechaHoraLectura, inspector, medidor);
		this.tipoTension = tipoTension;
		this.consumoHorasPico = consumoHorasPico;
		this.consumoHorasValle = consumoHorasValle;
		this.consumoHorasResto = consumoHorasResto;
	}

	public String getTipoTension() {
		return tipoTension;
	}

	public void setTipoTension(String tipoTension) {
		this.tipoTension = tipoTension;
	}

	public float getConsumoHorasPico() {
		return consumoHorasPico;
	}

	public void setConsumoHorasPico(float consumoHorasPico) {
		this.consumoHorasPico = consumoHorasPico;
	}

	public float getConsumoHorasValle() {
		return consumoHorasValle;
	}

	public void setConsumoHorasValle(float consumoHorasValle) {
		this.consumoHorasValle = consumoHorasValle;
	}

	public float getConsumoHorasResto() {
		return consumoHorasResto;
	}

	public void setConsumoHorasResto(float consumoHorasResto) {
		this.consumoHorasResto = consumoHorasResto;
	}

	@Override
	public String toString() {
		return "LecturaAltaDemanda [tipoTension=" + tipoTension + ", consumoHorasPico=" + consumoHorasPico
				+ ", consumoHorasValle=" + consumoHorasValle + ", consumoHorasResto=" + consumoHorasResto
				+ "fechaHoraLectura:" + this.getFechaHoraLectura() + "Inspector:" + this.getInspector() + "Medidor:"
				+ this.getMedidor() + "]";
	}

}
