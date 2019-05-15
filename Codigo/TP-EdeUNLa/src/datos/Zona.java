package datos;

import java.util.Set;

public class Zona {
	private long idZona;
	private String nombre;
	private Inspector inspector;
	private Set<Medidor> medidores;
	
	public Zona() {
	}

	public Zona(String nombre,Inspector inspector) {
		this.nombre = nombre;
		this.inspector=inspector;
	}

	public long getIdZona() {
		return idZona;
	}

	public void setIdZona(long idZona) {
		this.idZona = idZona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Inspector getInspector() {
		return inspector;
	}

	public void setInspector(Inspector inspector) {
		this.inspector = inspector;
	}

	@Override
	public String toString() {
		return "Zona [idZona=" + idZona + ", nombre=" + nombre + "]";
	}

	public Set<Medidor> getMedidores() {
		return medidores;
	}

	public void setMedidores(Set<Medidor> medidores) {
		this.medidores = medidores;
	}

}
