package dao;

import datos.Cliente;
import datos.Inspector;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InspectorDao {
		private static Session session;
		private Transaction tx;
		
		protected void iniciaOperacion() throws HibernateException {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
		}

		protected void manejaExcepcion(HibernateException he) throws HibernateException {
			tx.rollback();
			throw new HibernateException("ERROR en la capa de acceso a datos", he);
		}
		
		public int agregar(Inspector objeto) {
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
		
		public void actualizar(Inspector objeto) {
			try {
				iniciaOperacion();
				session.update(objeto);
				tx.commit();
			}finally {
				session.close();
			}
		}
		
		public void eliminar(Inspector objeto) throws HibernateException {
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
		
		
		
		public Inspector traerInspector(long idInspector) {
			Inspector objeto = null;
			try {
				iniciaOperacion();
				objeto= (Inspector) session.get(Inspector.class, idInspector);
				//String hql = "from Inspector as c where c.idCliente="+idInspector;
				//objeto = (Inspector) session.createQuery(hql).uniqueResult();
		//		Hibernate.initialize(objeto.getMedidores());					//poner esto en caso de que se pida traerClienteYMedidores
			}finally {
				session.close();
			}
			
			return objeto;
		}
		
		public Inspector traerInspector(int dni) {
			Inspector objeto = null;
			try {
				iniciaOperacion();
				String hql = "from Inspector as c where c.dni="+dni;
				objeto = (Inspector) session.createQuery(hql).uniqueResult();
			}finally {
				session.close();
			}
			
			return objeto;
			
		}
}
