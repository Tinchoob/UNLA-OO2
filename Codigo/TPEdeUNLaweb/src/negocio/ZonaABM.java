package negocio;

import dao.ZonaDao;
import datos.Tarifa;
import datos.Zona;

public class ZonaABM {

	private static ZonaABM instancia = null;
	
	protected ZonaABM() {}

	public static ZonaABM getInstancia() {
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

	public Zona traerZona(long idZona) {
		return zonaDao.traerZona(idZona);
	}
	
	public Zona traerZonaPorNombre(String nombre) {
		return zonaDao.traerZonaPorNombre(nombre);
	}
	
	public void bajaZonaLogica(Zona objeto) {
		objeto.setEsBaja(true);
		actualizar(objeto);
	}
}
