package dao;

import datos.Cliente;
import datos.Factura;

import java.time.LocalDate;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FacturaDao {
	private static Session session;
	private Transaction tx;
	private static FacturaDao instancia=null;
	
	protected FacturaDao() {}
	
	public static FacturaDao getInstancia() {
		if (instancia == null) {
			instancia = new FacturaDao();
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

	public int agregar(Factura objeto) {
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

	public void actualizar(Factura objeto) {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} finally {
			session.close();
		}
	}

	public void eliminar(Factura objeto) throws HibernateException {
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

	public Factura traerFactura(long idFactura) {
		Factura objeto = null;
		try {
			iniciaOperacion();
			objeto = (Factura) session.get(Factura.class, idFactura);

		} finally {
			session.close();
		}

		return objeto;
	}
	
	
	public Factura traerFacturaPeriodoAnterior(LocalDate fecha) {
		Factura objeto = null;
		fecha = fecha.minusMonths(2);
		try {
			iniciaOperacion();
			String hQL="from Factura as f where f.fecha="+fecha;
			objeto = (Factura) session.createQuery(hQL).uniqueResult();
		}finally {
			session.close();
			}
		return objeto;
		
	}
	

}