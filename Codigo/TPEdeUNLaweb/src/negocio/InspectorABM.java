package negocio;

import dao.InspectorDao;
import datos.Inspector;

public class InspectorABM {
	private static InspectorABM instancia = null;

	protected InspectorABM() {
	}

	public static InspectorABM getInstancia() {
		if (instancia == null) {
			instancia = new InspectorABM();
		}
		return instancia;
	}

	InspectorDao inspectorDao = new InspectorDao();

	public int agregar(Inspector objeto) {
		return inspectorDao.agregar(objeto);
	}

	public void actualizar(Inspector objeto) {
		inspectorDao.actualizar(objeto);
	}

	public void eliminar(Inspector objeto) {
		inspectorDao.eliminar(objeto);
	}

	public Inspector traerInspector(long idInspector) {
		return inspectorDao.traerInspector(idInspector);
	}
}
