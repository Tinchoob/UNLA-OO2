package datos;

import java.time.LocalDateTime;

import funciones.Funciones;

public class LecturaBajaDemanda extends Lectura {
	private double consumo;

	public LecturaBajaDemanda() {
	}

	public LecturaBajaDemanda(LocalDateTime fechaHoraLectura, Inspector inspector, Medidor medidor, double consummo) {
		super(fechaHoraLectura, inspector, medidor);
		this.consumo = consummo;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "LecturaBajaDemanda [consumo=" + consumo + ", fechaHoraLectura:" + Funciones.traerFechaCortaHora(this.getFechaHoraLectura())
				+ ", Inspector:" + this.getInspector().getIdInspector() + ", Medidor:" + this.getMedidor().getIdMedidor() + "]";
	}

}
