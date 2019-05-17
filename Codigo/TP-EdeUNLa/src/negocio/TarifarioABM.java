package negocio;

import dao.TarifarioDao;
import datos.Tarifario;

public class TarifarioABM {
	private static TarifarioABM instancia = null;

	protected TarifarioABM() {
	}

	public static TarifarioABM getInstancia() {
		if (instancia == null) {
			instancia = new TarifarioABM();
		}
		return instancia;
	}

	TarifarioDao tarifarioDao = new TarifarioDao();

	public int agregar(Tarifario objeto) {
		return tarifarioDao.agregar(objeto);
	}

	public void actualizar(Tarifario objeto) {
		tarifarioDao.actualizar(objeto);
	}

	public void eliminar(Tarifario objeto) {
		tarifarioDao.eliminar(objeto);
	}

	public Tarifario traerTarifario(long idTarifario) {
		return tarifarioDao.traerTarifario(idTarifario);
	}

}
