package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Medidor;

public class MedidorDao {
	
	private static Session session;
	private Transaction tx;
	private static MedidorDao instancia = null; // implementacion singleton

	protected MedidorDao() {
	} // implementacion singleton

	public static MedidorDao getInstancia() { // implementancion singleton
		if (instancia == null) {
			instancia = new MedidorDao();
		}
		return instancia;
	}

	protected void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	protected void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	public int agregar(Medidor objeto) {
		int id = 0;
		try {

			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		} finally {
			session.close();
		}
		return id;
	}

	public void actualizar(Medidor objeto) {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} finally {
			session.close();
		}
	}

	public void eliminar(Medidor objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}

	public Medidor traerMedidor(long idMedidor) {
		Medidor objeto = null;
		try {
			iniciaOperacion();
			objeto= (Medidor) session.get(Medidor.class, idMedidor);
		} finally {
			session.close();
		}

		return objeto;
	}

}
