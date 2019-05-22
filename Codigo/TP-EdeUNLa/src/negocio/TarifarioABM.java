package negocio;

import dao.TarifaDao;
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
	
	TarifaDao tarifaDao = new TarifaDao();
	
	
	public int agregar(Tarifa objeto) {
		return tarifaDao.agregar(objeto);
	}
	
	
	public void actualizar(Tarifa objeto) {
		tarifaDao.actualizar(objeto);
	}
	
	public void eliminar(Tarifa objeto) {
		tarifaDao.eliminar(objeto);
	}
	
	
	public Tarifa traerTarifa(long idTarifa) {
		return tarifaDao.traerTarifa(idTarifa);
	}
	
	
	

}
