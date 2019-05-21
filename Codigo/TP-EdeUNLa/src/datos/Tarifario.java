package datos;

import java.time.LocalDate;
import java.util.Set;

public class Tarifario {
	protected long idTarifario;
	protected double montoFijo;
	protected LocalDate fechaActualizacion;
	protected boolean estaActivo;
	protected Set<Factura> facturas;		
	
	
	public Tarifario() {}


	public Tarifario(double montoFijo, LocalDate fechaActualizacion, boolean estaActivo) {
		this.montoFijo = montoFijo;
		this.fechaActualizacion = fechaActualizacion;
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



	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}


	public void setFechaActualizacion(LocalDate fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}


	public boolean isEstaActivo() {
		return estaActivo;
	}


	public void setEstaActivo(boolean estaActivo) {
		this.estaActivo = estaActivo;
	}
	


	public Set<Factura> getFacturas() {
		return facturas;
	}


	public void setFacturas(Set<Factura> facturas) {
		this.facturas = facturas;
	}


	@Override
	public String toString() {
		return "Tarifario [idTarifario=" + idTarifario + ", montoFijo=" + montoFijo + ", fechaActualizacion=" + fechaActualizacion + ", estaActivo=" + estaActivo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
