package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Cliente;
import datos.Lectura;

public class LecturaDao {
	private static Session session;
	private Transaction tx;
	private static LecturaDao instancia = null; // implementacion singleton

	protected LecturaDao() {
	}

	public static LecturaDao getInstancia() { // implementancion singleton
		if (instancia == null) {
			instancia = new LecturaDao();
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

	public int agregar(Lectura objeto) {
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

	public void actualizar(Lectura objeto) {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} finally {
			session.close();
		}
	}

	public void eliminar(Lectura objeto) throws HibernateException {
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

	public Lectura traerLectura(long idLectura) {
		Lectura objeto = null;
		try {
			iniciaOperacion();
			objeto= (Lectura) session.get(Lectura.class, idLectura);
			
		} finally {
			session.close();
		}

		return objeto;
	}

	public Lectura traerLecturaEInspector(long idLectura) throws HibernateException {
		Lectura objeto = null;
		try {
			iniciaOperacion();
			String hql = "from Lectura as l inner join fetch l.inspector where l.idLectura=" + idLectura;
			objeto = (Lectura) session.createQuery(hql).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}
}
