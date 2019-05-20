package datos;

import java.time.LocalDateTime;

public class LecturaBajaDemanda extends Lectura {
	private double consumo;

	public LecturaBajaDemanda() {
	}

	public LecturaBajaDemanda(LocalDateTime fechaHoraLectura, Inspector inspector, Medidor medidor,Factura factura, double consummo) {
		super(fechaHoraLectura, inspector, medidor,factura);
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
