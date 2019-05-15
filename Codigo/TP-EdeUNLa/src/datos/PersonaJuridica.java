package datos;

public class PersonaJuridica extends Cliente{
	private String razonSocial;
	private String cuit;
	
	
	public PersonaJuridica() {}


	public PersonaJuridica(String nroCliente,Contacto contacto,String razonSocial, String cuit) {
		super(nroCliente,contacto);
		this.razonSocial = razonSocial;
		this.cuit = cuit;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getCuit() {
		return cuit;
	}


	public void setCuit(String cuit) {
		this.cuit = cuit;
	}


	@Override
	public String toString() {
		if (contacto == null) {
		return "PersonaJuridica [razonSocial=" + razonSocial + ", cuit=" + cuit + ", idCliente=" + idCliente
				+ ", nroCliente=" + nroCliente +  "]";
		}
		else {
			return "PersonaJuridica [razonSocial=" + razonSocial + ", cuit=" + cuit + ", idCliente=" + idCliente
					+ ", nroCliente=" + nroCliente + "Contacto= "+this.getContacto() +"]";
		}
		
	}


	
	
	
	
	
	
	
	
	
	
	
	

}
