package negocio;

import dao.ClienteDao;
import dao.TarifaDao;
import datos.Cliente;
import datos.Tarifa;

public class TarifaABM {
	private static TarifaABM instancia = null;

	protected TarifaABM() {
	}

	public static TarifaABM getInstancia() {
		if (instancia == null) {
			instancia = new TarifaABM();
		}
		return instancia;
	}

	public int agregar(Tarifa objeto) {
		return TarifaDao.getInstancia().agregar(objeto);
	}

	public void eliminar(Tarifa objeto) {
		TarifaDao.getInstancia().eliminar(objeto);
	}

	public void actualizar(Tarifa objeto) {
		TarifaDao.getInstancia().actualizar(objeto);
	}

	public Tarifa traerTarifa(long idTarifa) {
		return TarifaDao.getInstancia().traerTarifa(idTarifa);
	}

	public Tarifa traerUltimaTarifaBajaDemanda() {
		return TarifaDao.getInstancia().traerUltimaTarifaBajaDemanda();

	}

	public Tarifa traerUltimaTarifaAltaDemanda() {
		return TarifaDao.getInstancia().traerUltimaTarifaAltaDemanda();
	}
	
	public Tarifa traerDetallesBajaDemanda(long idTarifa){
		return TarifaDao.getInstancia().traerDetallesBajaDemanda(idTarifa);
	}
	
	public Tarifa traerDetallesAltaDemanda(long idTarifa){
		return TarifaDao.getInstancia().traerDetallesAltaDemanda(idTarifa);
	}
	
}
