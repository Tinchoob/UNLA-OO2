package test;

import datos.Cliente;
import datos.Inspector;
import datos.Lectura;
import datos.Zona;
import negocio.ClienteABM;
import negocio.InspectorABM;
import negocio.LecturaABM;
import negocio.MedidorABM;
import negocio.ZonaABM;
import datos.Medidor;

public class TestGenerarDetalleYFactura {
	public static void main(String[]args ) {
		
		
		Inspector inspector = InspectorABM.getInstancia().traerInspector(1);
		
		System.out.println(inspector);
		
		Zona zona= ZonaABM.getInstancia().traerZona(1);
		
		System.out.println(zona);
		
		Cliente cliente = ClienteABM.getInstancia().traerCliente(1);
		
		System.out.println(cliente);
		
		Medidor medidor = MedidorABM.getInstancia().traer(1);
		
		System.out.println(medidor);
		
		Lectura lectura = LecturaABM.getInstancia().traerLectura(1);
		
		System.out.println(lectura);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
