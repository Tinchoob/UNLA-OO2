package datos;

public class Medidor {
	private long idMedidor;
	private int nroSerie;
	private Cliente cliente;
	private String domicilioMedidor;
	private Zona zona;
	private boolean esBaja;

	public Medidor() {
	}

	public Medidor(int nroSerie, Cliente cliente, String domicilioMedidor, Zona zona) {
		this.nroSerie = nroSerie;
		this.cliente = cliente;
		this.domicilioMedidor = domicilioMedidor;
		this.zona = zona;
		this.esBaja = false;
	}

	public long getIdMedidor() {
		return idMedidor;
	}

	public void setIdMedidor(long idMedidor) {
		this.idMedidor = idMedidor;
	}

	public int getNroSerie() {
		return nroSerie;
	}

	public void setNroSerie(int nroSerie) {
		this.nroSerie = nroSerie;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDomicilioMedidor() {
		return domicilioMedidor;
	}

	public void setDomicilioMedidor(String domicilioMedidor) {
		this.domicilioMedidor = domicilioMedidor;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public boolean isEsBaja() {
		return esBaja;
	}

	public void setEsBaja(boolean esBaja) {
		this.esBaja = esBaja;
	}

	@Override
	public String toString() {
		return "Medidor [idMedidor=" + idMedidor + ", nroSerie=" + nroSerie + ", cliente=" + cliente
				+ ", domicilioMedidor=" + domicilioMedidor + ", zona=" + zona + ", esBaja=" + esBaja + "]";
	}

}