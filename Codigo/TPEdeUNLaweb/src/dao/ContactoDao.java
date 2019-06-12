package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Contacto;

public class ContactoDao {
	
	private static Session session;
	private Transaction tx;
	private static ContactoDao instancia = null;	// implementacion singleton
	
	protected ContactoDao() {}	//implementacion singleton
	
	public static ContactoDao getInstancia() {	//implementancion singleton
		if (instancia == null) {
			instancia = new ContactoDao();
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
	
	public int agregar(Contacto objeto) {
		int id=0;
		try {
			
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		}
		finally {session.close();
		}
		return id;
	}
	
	public Contacto traer(long idContacto) throws HibernateException {
		Contacto objeto = null;
		try {
		iniciaOperacion();
		objeto = (Contacto) session.get(Contacto.class, idContacto);
		} finally {
		session.close();
		}
		return objeto;
		}
	
	public void eliminar(Contacto objeto) {
		
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
		}finally {
			session.close();
		}
	}
	



	

}
