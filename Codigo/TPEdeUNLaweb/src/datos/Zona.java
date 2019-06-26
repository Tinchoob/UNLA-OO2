package datos;

import java.util.Set;

public class Zona {
	private long idZona;
	private String nombre;
	private boolean esBaja;
	private Set<Inspector> inspectores;
	private Set<Medidor> medidores;
	
	public Zona() {
	}

	public Zona(String nombre) {
		this.nombre = nombre;
		this.esBaja=false;
	}

	public long getIdZona() {
		return idZona;
	}

	protected void setIdZona(long idZona) {
		this.idZona = idZona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Set<Medidor> getMedidores() {
		return medidores;
	}

	public void setMedidores(Set<Medidor> medidores) {
		this.medidores = medidores;
	}

	public Set<Inspector> getInspectores() {
		return inspectores;
	}

	public void setInspectores(Set<Inspector> inspectores) {
		this.inspectores = inspectores;
	}
	
	public boolean isEsBaja() {
		return esBaja;
	}

	public void setEsBaja(boolean esBaja) {
		this.esBaja = esBaja;
	}

	@Override
	public String toString() {
		return "Zona [idZona=" + idZona + ", nombre=" + nombre + ", esBaja=" + esBaja + "]";
	}

	
	

}
