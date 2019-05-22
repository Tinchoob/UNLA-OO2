package negocio;

import dao.TarifarioDao;
import datos.Tarifa;

public class TarifarioABM {
	private static TarifarioABM instancia=null;
	
	
	protected TarifarioABM() {}
	
	
	public static TarifarioABM getInstancia() {
		if (instancia == null){
			instancia = new TarifarioABM();
		}
		return instancia;
	}
	
	TarifarioDao tarifarioDao = new TarifarioDao();
	
	
	public int agregar(Tarifa objeto) {
		return tarifarioDao.agregar(objeto);
	}
	
	
	public void actualizar(Tarifa objeto) {
		tarifarioDao.actualizar(objeto);
	}
	
	public void eliminar(Tarifa objeto) {
		tarifarioDao.eliminar(objeto);
	}
	
	
	public Tarifa traerTarifario(long idTarifario) {
		return tarifarioDao.traerTarifario(idTarifario);
	}
	
	
	

}
