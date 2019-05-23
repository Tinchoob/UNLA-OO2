package dao;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Cliente;
import datos.Tarifa;
import datos.TarifaBaja;
import datos.Zona;

public class TarifaDao {

	private static Session session;
	private Transaction tx;
	private static TarifaDao instancia = null; // implementacion singleton

	protected TarifaDao() {
	} // implementacion singleton

	public static TarifaDao getInstancia() { // implementancion singleton
		if (instancia == null) {
			instancia = new TarifaDao();
		}
		return instancia;
	}

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	public int agregar(Tarifa objeto) {
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

	public void actualizar(Tarifa objeto) throws HibernateException {
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

	public void eliminar(Tarifa objeto) throws HibernateException {
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

	public Tarifa traerTarifa(long idTarifa) throws HibernateException {
		Tarifa objeto = null;
		try {
			iniciaOperacion();
			objeto = (Tarifa) session.get(Tarifa.class, idTarifa);
		} finally {
			session.close();
		}
		return objeto;
	}

	public Tarifa traerUltimaTarifaBajaDemanda() {
		Tarifa objeto = null;
		try {
			iniciaOperacion();
			String hql = "from tarifa INNER JOIN tarifabaja ORDER BY fechaActualizacion DESC";
			objeto = (Tarifa) session.createQuery(hql).setMaxResults(1).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}

	public Tarifa traerUltimaTarifaAltaDemanda() {
		Tarifa objeto = null;
		try {
			iniciaOperacion();
			String hql = "from tarifa INNER JOIN tarifaalta ORDER BY fechaActualizacion DESC";
			objeto = (Tarifa) session.createQuery(hql).setMaxResults(1).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}

	/*public Tarifa traerDetallesBajaDemanda(long idTarifa) {
		Tarifa objeto = null;
		try {
			iniciaOperacion();
			String hql = "from Tarifa t where t.idTarifa=" + idTarifa;
			objeto = (TarifaBaja) session.createQuery(hql).uniqueResult();
			Hibernate.initialize(((TarifaBaja) objeto).getDetalles());
		} finally {
			session.close();
		}
		return objeto;
	}*/
	
}
