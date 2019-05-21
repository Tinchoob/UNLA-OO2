package datos;

import java.time.LocalDate;

public class TarifarioAltaDemanda extends Tarifario{
	private double montoVariableValle;
	private double montoVariablePico;
	private double montoVariableResto;
	
	public TarifarioAltaDemanda() {}
	
	
	public TarifarioAltaDemanda(double montoFijo, LocalDate fechaActualizacion, boolean estaActivo,
			double montoVariableValle, double montoVariablePico, double montoVariableResto) {
		super(montoFijo, fechaActualizacion, estaActivo);
		this.montoVariableValle = montoVariableValle;
		this.montoVariablePico = montoVariablePico;
		this.montoVariableResto = montoVariableResto;
	}


	public double getMontoVariableValle() {
		return montoVariableValle;
	}


	public void setMontoVariableValle(double montoVariableValle) {
		this.montoVariableValle = montoVariableValle;
	}


	public double getMontoVariablePico() {
		return montoVariablePico;
	}


	public void setMontoVariablePico(double montoVariablePico) {
		this.montoVariablePico = montoVariablePico;
	}


	public double getMontoVariableResto() {
		return montoVariableResto;
	}


	public void setMontoVariableResto(double montoVariableResto) {
		this.montoVariableResto = montoVariableResto;
	}


	@Override
	public String toString() {
		return "TarifarioAltaDemanda [montoVariableValle=" + montoVariableValle + ", montoVariablePico="
				+ montoVariablePico + ", montoVariableResto=" + montoVariableResto + ", idTarifario=" + idTarifario
				+ ", montoFijo=" + montoFijo + ", fechaActualizacion=" + fechaActualizacion + ", estaActivo="
				+ estaActivo + "]";
	}
	
	
	
	
	
	

	
	

}
