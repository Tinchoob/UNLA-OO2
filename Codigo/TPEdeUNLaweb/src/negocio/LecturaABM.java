package negocio;

import dao.ClienteDao;
import dao.LecturaDao;
import datos.Cliente;
import datos.Lectura;

public class LecturaABM {
	private static LecturaABM instancia = null;

	protected LecturaABM() {
	}

	public static LecturaABM getInstancia() {
		if (instancia == null) {
			instancia = new LecturaABM();
		}
		return instancia;
	}

	public int agregar(Lectura objeto) {
		return LecturaDao.getInstancia().agregar(objeto);
	}

	public void eliminar(Lectura objeto) {
		LecturaDao.getInstancia().eliminar(objeto);
	}

	public void actualizar(Lectura objeto) {
		LecturaDao.getInstancia().actualizar(objeto);
	}

	public Lectura traerLectura(long idLectura) {
		return LecturaDao.getInstancia().traerLectura(idLectura);
	}

	public Lectura traerLecturaEInspector(long idLectura) {
		return LecturaDao.getInstancia().traerLecturaEInspector(idLectura);
	}
}
