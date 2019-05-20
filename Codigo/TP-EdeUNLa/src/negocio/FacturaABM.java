package negocio;

import dao.FacturaDao;
import datos.Factura;

public class FacturaABM {
	private static FacturaABM instancia = null;

	protected FacturaABM() {
	}

	public static FacturaABM getInstancia() {
		if (instancia == null) {
			instancia = new FacturaABM();
		}
		return instancia;
	}

	FacturaDao facturaDao = new FacturaDao();

	public int agregar(Factura objeto) {
		return facturaDao.agregar(objeto);
	}

	public void actualizar(Factura objeto) {
		facturaDao.actualizar(objeto);
	}

	public void eliminar(Factura objeto) {
		facturaDao.eliminar(objeto);
	}

	public Factura traerFactura(long idFactura) {
		return facturaDao.traerFactura(idFactura);
	}
}
