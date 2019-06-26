package datos;

import java.util.Set;

public class Inspector {
	private long idInspector;
	private String nombre;
	private String apellido;
	private int dni;
	private Set<Zona> zonas;
	private Set<Lectura> lecturas;

	public Inspector() {
	}

	public Inspector(String nombre, String apellido, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public long getIdInspector() {
		return idInspector;
	}

	protected void setIdInspector(long idInspector) {
		this.idInspector = idInspector;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Set<Zona> getZonas() {
		return zonas;
	}

	public Set<Lectura> getLecturas() {
		return lecturas;
	}

	public void setLecturas(Set<Lectura> lecturas) {
		this.lecturas = lecturas;
	}

	public void setZonas(Set<Zona> zonas) {
		this.zonas = zonas;
	}

	@Override
	public String toString() {
		return "Inspector [idInspector=" + idInspector + ", nombre=" + nombre + ", apellido=" + apellido + ", dni="
				+ dni + "]";
	}

}
