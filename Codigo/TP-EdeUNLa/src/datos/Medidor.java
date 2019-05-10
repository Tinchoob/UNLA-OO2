package datos;

public class Medidor {
	private long idMedidor;
	private int nroSerie;
	private Cliente cliente;
	
	public Medidor() {}
	
	
	public Medidor(int nroSerie,Cliente cliente) {
		this.nroSerie=nroSerie;
		this.cliente = cliente;
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




	@Override
	public String toString() {
		return "Medidor [idMedidor=" + idMedidor + ", nroSerie=" + nroSerie + ", cliente=" + cliente + "]";
	}
	
	
	

}
