package negocio;


import dao.TarifaDao;
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
	
	public Tarifa traerDetallesTarifaBajaDemanda(long idTarifa){
		return TarifaDao.getInstancia().traerDetallesTarifaBajaDemanda(idTarifa);
	}
	
	public Tarifa traerDetallesTarifaAltaDemanda(long idTarifa){
		return TarifaDao.getInstancia().traerDetallesTarifaAltaDemanda(idTarifa);
	}
	
}
