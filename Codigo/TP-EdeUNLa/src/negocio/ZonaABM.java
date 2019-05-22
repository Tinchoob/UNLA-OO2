package negocio;

import dao.ZonaDao;
import datos.Tarifa;
import datos.Zona;

public class ZonaABM {

	private static ZonaABM instancia = null;

	protected ZonaABM getInstancia() {
		if (instancia == null) {
			instancia = new ZonaABM();
		}
		return instancia;
	}

	ZonaDao zonaDao = new ZonaDao();

	public int agregar(Zona objeto) {
		return zonaDao.agregar(objeto);
	}

	public void actualizar(Zona objeto) {
		zonaDao.actualizar(objeto);
	}

	public void eliminar(Zona objeto) {
		zonaDao.eliminar(objeto);
	}

	public Zona traerTarifario(long idZona) {
		return zonaDao.traerZona(idZona);
	}
}
