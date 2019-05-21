package datos;

import java.time.LocalDate;

public class TarifarioBajaDemanda extends Tarifario{
	private double montoVariable;
	
	public TarifarioBajaDemanda() {}

	public TarifarioBajaDemanda(double montoFijo, LocalDate fechaActualizacion, boolean estaActivo,
			double montoVariable) {
		super(montoFijo, fechaActualizacion, estaActivo);
		this.montoVariable = montoVariable;
	}

	public double getMontoVariable() {
		return montoVariable;
	}

	public void setMontoVariable(double montoVariable) {
		this.montoVariable = montoVariable;
	}

	@Override
	public String toString() {
		return "TarifarioBajaDemanda [montoVariable=" + montoVariable + ", idTarifario=" + idTarifario + ", montoFijo="
				+ montoFijo + ", fechaActualizacion=" + fechaActualizacion + ", estaActivo=" + estaActivo + "]";
	}
	
	
	
	/*public double calcularMontoFijo(double consumo) {
		double montoFijo = 0;
		if (0 < consumo && consumo <= 150) {
			montoFijo = 32.82;
		}
		if (151 <= consumo && consumo <= 325) {
			montoFijo = 56.11;
		}
		if (326 <= consumo && consumo <= 400) {
			montoFijo = 91.73;
		}
		if (401 <= consumo && consumo <= 450) {
			montoFijo = 107.34;
		}
		if (451 <= consumo && consumo <= 500) {
			montoFijo = 161.66;
		}
		if (501 <= consumo && consumo <= 600) {
			montoFijo = 316.00;
		}
		if (601 <= consumo && consumo <= 700) {
			montoFijo = 850.24;
		}
		if (701 <= consumo && consumo <= 1400) {
			montoFijo = 1203.64;
		}
		if (consumo < 1400) {
			montoFijo = 1442.88;
		}
		return montoFijo;

	}*/
	

}
