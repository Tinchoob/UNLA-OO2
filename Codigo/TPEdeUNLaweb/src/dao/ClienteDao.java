package dao;

import datos.Cliente;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClienteDao {

	private static Session session;
	private Transaction tx;
	private static ClienteDao instancia = null; // implementacion singleton

	protected ClienteDao() {
	} // implementacion singleton

	public static ClienteDao getInstancia() { // implementancion singleton
		if (instancia == null) {
			instancia = new ClienteDao();
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

	public int agregar(Cliente objeto) {
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

	public void actualizar(Cliente objeto) {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} finally {
			session.close();
		}
	}

	public void eliminar(Cliente objeto) throws HibernateException {
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

	public Cliente traerCliente(long idCliente) {
		Cliente objeto = null;
		try {
			iniciaOperacion();
			objeto = (Cliente) session.get(Cliente.class, idCliente);
			Hibernate.initialize(objeto.getMedidores()); // poner esto en caso de que se pida traer medidores

		} finally {
			session.close();
		}

		return objeto;
	}

	public Cliente traerClientePorDni(int dni) {
		Cliente objeto = null;
		try {
			iniciaOperacion();
			String hql = "from Cliente as c where c.dni=" + dni;
			objeto = (Cliente) session.createQuery(hql).uniqueResult();
		} finally {
			session.close();
		}

		return objeto;

	}

	public Cliente traerClienteYContacto(long idCliente) throws HibernateException {
		Cliente objeto = null;
		try {
			iniciaOperacion();
			String hql = "from Cliente as c inner join fetch c.contacto where c.idCliente =" + idCliente;
			objeto = (Cliente) session.createQuery(hql).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> traerClientes() {
		List<Cliente> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Cliente c inner join fetch c.contacto").list();
		} finally {
			session.close();
		}
		return lista;
	}

}
