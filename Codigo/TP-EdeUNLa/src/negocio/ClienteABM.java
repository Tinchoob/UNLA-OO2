package negocio;

import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
	
	private static ClienteABM instancia=null;
	
	protected ClienteABM() {}
	
	public static ClienteABM getInstancia() {
		if (instancia == null) {
			instancia = new ClienteABM();
		}
		return instancia;
	}
	
	
	public int agregar(Cliente objeto) {
		return ClienteDao.getInstancia().agregar(objeto);
	}
	
	
	public void eliminar(Cliente objeto) {
		ClienteDao.getInstancia().eliminar(objeto);
	}
	
	
	public void actualizar(Cliente objeto) {
		ClienteDao.getInstancia().actualizar(objeto);
	}
	
	public Cliente traerCliente(long idCliente) {
		return ClienteDao.getInstancia().traerCliente(idCliente);
	}
	
	public Cliente traerCliente(int dni) {
		return ClienteDao.getInstancia().traerCliente(dni);
	}
	
	public Cliente traerClienteYContacto(long idCliente) {
		return ClienteDao.getInstancia().traerClienteYContacto(idCliente);
	}
	
	
	

}
