package datos;

import java.time.LocalDate;

public class Tarifario {
	private long idTarifario;
	private double montoFijo;
	private double montoVariable;
	private LocalDate fechaActualizcion;
	private boolean estaActivo;
	// private Set<Factura> facturas;		Tincho: Agrega esto cuando mapees Factura, ademas del getter y setter correspondiente
	
	
	public Tarifario() {}


	public Tarifario(double montoFijo, double montoVariable, LocalDate fechaActualizcion, boolean estaActivo) {
		this.montoFijo = montoFijo;
		this.montoVariable = montoVariable;
		this.fechaActualizcion = fechaActualizcion;
		this.estaActivo = estaActivo;
	}


	


	public long getIdTarifario() {
		return idTarifario;
	}


	protected void setIdTarifario(long idTarifario) {
		this.idTarifario = idTarifario;
	}


	public double getMontoFijo() {
		return montoFijo;
	}


	public void setMontoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}


	public double getMontoVariable() {
		return montoVariable;
	}


	public void setMontoVariable(double montoVariable) {
		this.montoVariable = montoVariable;
	}


	public LocalDate getFechaActualizcion() {
		return fechaActualizcion;
	}


	public void setFechaActualizcion(LocalDate fechaActualizcion) {
		this.fechaActualizcion = fechaActualizcion;
	}


	public boolean isEstaActivo() {
		return estaActivo;
	}


	public void setEstaActivo(boolean estaActivo) {
		this.estaActivo = estaActivo;
	}


	@Override
	public String toString() {
		return "Tarifario [idTarifario=" + idTarifario + ", montoFijo=" + montoFijo + ", montoVariable=" + montoVariable
				+ ", fechaActualizcion=" + fechaActualizcion + ", estaActivo=" + estaActivo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
