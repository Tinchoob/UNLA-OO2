package datos;

import java.util.Set;

public class Cliente {
	protected long idCliente;
	protected String nroCliente;
	protected Set<Medidor> medidores;
	protected Contacto contacto;
	
	
	public Cliente() {}


	public Cliente(String nroCliente,Contacto contacto) {
		this.nroCliente = nroCliente;
		this.setContacto(contacto);
	}


	public long getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(long idCliente) {
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


	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nroCliente=" + nroCliente + ", Contacto=" + contacto + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
