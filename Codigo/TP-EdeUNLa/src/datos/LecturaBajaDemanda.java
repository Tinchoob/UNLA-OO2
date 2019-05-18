package datos;

import java.time.LocalDate;

public class LecturaBajaDemanda extends Lectura {
	private double consumo;

	public LecturaBajaDemanda() {
	}

	public LecturaBajaDemanda(LocalDate fechaHoraLectura, Inspector inspector, Medidor medidor, double consummo) {
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
		return "LecturaBajaDemanda [consummo=" + consumo + "fechaHoraLectura:" + this.getFechaHoraLectura()
				+ "Inspector:" + this.getInspector() + "Medidor:" + this.getMedidor() + "]";
	}

}
