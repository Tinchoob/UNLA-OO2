package negocio;


import dao.ContactoDao;
import datos.Contacto;

public class ContactoABM {
	
	private static ContactoABM instancia = null;
	
	protected ContactoABM() {}
	
	public static ContactoABM getInstancia() {
		if (instancia == null) {
			instancia = new ContactoABM();
		}
		return instancia;
	}
	
	public int agregar(Contacto objeto) {
		return ContactoDao.getInstancia().agregar(objeto);
	}
	
	public Contacto traer(long idContacto) {
		return ContactoDao.getInstancia().traer(idContacto);
	}
	
	
	

}
