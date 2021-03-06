package datos;

import java.util.Set;

public class Cliente {
	protected long idCliente;
	protected String nroCliente;
	protected Set<Medidor> medidores;
	protected Contacto contacto;
	protected boolean esBaja;
	
	
	public Cliente() {}


	public Cliente(String nroCliente,Contacto contacto) {
		this.nroCliente = nroCliente;
		this.setContacto(contacto);
		this.esBaja=false;
	}


	public long getIdCliente() {
		return idCliente;
	}


	protected void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}


	public String getNroCliente() {
		return nroCliente;
	}


	public void setNroCliente(String nroCliente) {
		this.nroCliente = nroCliente;
	}


	public Set<Medidor> getMedidores() {
		return medidores;
	}


	public void setMedidores(Set<Medidor> medidores) {
		this.medidores = medidores;
	}


	public Contacto getContacto() {
		return contacto;
	}


	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}


	public boolean isEsBaja() {
		return esBaja;
	}


	public void setEsBaja(boolean esBaja) {
		this.esBaja = esBaja;
	}


	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nroCliente=" + nroCliente + ", contacto="+contacto;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
