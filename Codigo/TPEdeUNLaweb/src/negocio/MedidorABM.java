package negocio;

import dao.MedidorDao;
import datos.Medidor;

public class MedidorABM {
	
	private static MedidorABM instancia = null;
	
	protected MedidorABM() {}
	
	public static MedidorABM getInstancia() {
		if (instancia == null) {
			instancia = new MedidorABM();
		}
		return instancia;
	}
	
	MedidorDao medidorDao = MedidorDao.getInstancia();
	
	
	public int agregar(Medidor objeto) {
		return medidorDao.agregar(objeto);
	}
	
	public void actualizar(Medidor objeto) {
		medidorDao.actualizar(objeto);
	}
	
	public void eliminar(Medidor objeto) {
		medidorDao.eliminar(objeto);
	}
	
	public Medidor traer(long idMedidor) {
		return medidorDao.traerMedidor(idMedidor);
	}
	
	
	
	
	

}
