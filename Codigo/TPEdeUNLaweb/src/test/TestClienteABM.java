package test;

import dao.ClienteDao;
import dao.ContactoDao;
import datos.Cliente;
import datos.Contacto;
import datos.PersonaFisica;
import datos.PersonaJuridica;
import negocio.ClienteABM;

public class TestClienteABM {

	public static void main(String[] args) {
		
	//agrego 2 clientes: uno fisico, otro juridico
	//	PersonaFisica hector = new PersonaFisica("1221","Hector","Carballo",4355613);
	//	ClienteDao.getInstancia().agregar(hector);
		
	//	PersonaJuridica facultadDeLomas = new PersonaJuridica("1345","UNLZ","21-22123");
	//	ClienteDao.getInstancia().agregar(facultadDeLomas);
		
		
		//traigo uno para ver que ande
	//	Cliente hector = ClienteABM.getInstancia().traerClienteYMedidores(1);
	//	System.out.println(hector.toString());
		
		
		//elimino a la personajuridica
		//	Cliente Unlz = ClienteABM.getInstancia().traerCliente(3);
	//	ClienteABM.getInstancia().eliminar(Unlz);
		
		
		//modificacion
	//	Cliente hector = ClienteABM.getInstancia().traerCliente(4355613);
	//	hector.setNroCliente("889977");
	//	ClienteABM.getInstancia().actualizar(hector);
		
		//todos los metodos funcionan correctamente
		

		
		//traigo una personaJuridica y le asigno contacto
		long id=4;
		Cliente colch = ClienteABM.getInstancia().traerCliente(id);			
		//ContactoDao.getInstancia().agregar(new Contacto("ggg","1234","1234",colch));
		//Contacto con4 = ContactoDao.getInstancia().traer(4);
		//colch.setContacto(con4);
		//ClienteDao.getInstancia().actualizar(colch);
		System.out.println("Cliente: "+colch.toString());

		
		
		
		

	}

}
