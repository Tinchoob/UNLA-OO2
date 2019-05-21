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
	
	
	
	
	

}
