package dao;

import datos.Cliente;
import datos.Zona;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ZonaDao {
	private static Session session;
	private Transaction tx;
	
	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

 public int agregar(Zona objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return id;
	}

	public void actualizar(Zona objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}

	public void eliminar(Zona objeto) throws HibernateException {
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

	public Zona traerZona(long idZona) throws HibernateException {
		Zona objeto = null;
		try {
			iniciaOperacion();
			objeto = (Zona) session.get(Zona.class, idZona);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	public Zona traerZonaPorNombre(String nombre) throws HibernateException{
		Zona objeto = null;
		
		try {
			iniciaOperacion();
			// objeto = (Zona) session.createQuery("from Zona as z  where z.nombre= '"+nombre+"'").uniqueResult();
			objeto = (Zona) session.createQuery(String.format("from Zona as z where z.nombre='%s'", nombre)).uniqueResult();
		}finally {session.close();
		}
		return objeto;
	}
	
}
