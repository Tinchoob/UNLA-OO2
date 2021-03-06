package datos;


import java.time.LocalDateTime;

import funciones.Funciones;

public class LecturaAltaDemanda extends Lectura {
	private String tipoTension;
	private int potenciaContratada;
	private double consumoHorasPico;
	private double consumoHorasValle;
	private double consumoHorasResto;

	public LecturaAltaDemanda() {
	}

	public LecturaAltaDemanda(LocalDateTime fechaHoraLectura, Inspector inspector, Medidor medidor,int potenciaContratada, String tipoTension,
			double consumoHorasPico, double consumoHorasValle, double consumoHorasResto) {
		super(fechaHoraLectura, inspector, medidor);
		this.tipoTension = tipoTension;
		this.potenciaContratada=potenciaContratada;
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

	public int getPotenciaContratada() {
		return potenciaContratada;
	}

	public void setPotenciaContratada(int potenciaContratada) {
		this.potenciaContratada = potenciaContratada;
	}

	public double getConsumoHorasPico() {
		return consumoHorasPico;
	}

	public void setConsumoHorasPico(double consumoHorasPico) {
		this.consumoHorasPico = consumoHorasPico;
	}

	public double getConsumoHorasValle() {
		return consumoHorasValle;
	}

	public void setConsumoHorasValle(double consumoHorasValle) {
		this.consumoHorasValle = consumoHorasValle;
	}

	public double getConsumoHorasResto() {
		return consumoHorasResto;
	}

	public void setConsumoHorasResto(double consumoHorasResto) {
		this.consumoHorasResto = consumoHorasResto;
	}

	@Override
	public String toString() {
		return "LecturaAltaDemanda [tipoTension=" + tipoTension +" potenciaContratada="+potenciaContratada+ ", consumoHorasPico=" + consumoHorasPico
				+ ", consumoHorasValle=" + consumoHorasValle + ", consumoHorasResto=" + consumoHorasResto
				+ ", fechaHoraLectura: " + Funciones.traerFechaCortaHora(this.getFechaHoraLectura()) + ", Inspector: " + this.getInspector().getIdInspector() + ", Medidor: "
				+ this.getMedidor().getIdMedidor() + "]";
	}

}
