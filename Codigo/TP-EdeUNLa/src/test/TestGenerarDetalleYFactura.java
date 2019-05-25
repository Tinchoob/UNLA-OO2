package test;

import java.time.LocalDate;

import datos.Cliente;
import datos.DetalleBaja;
import datos.Factura;
import datos.Inspector;
import datos.Lectura;
import datos.LecturaBajaDemanda;
import datos.Zona;
import negocio.ClienteABM;
import negocio.FacturaABM;
import negocio.InspectorABM;
import negocio.LecturaABM;
import negocio.MedidorABM;
import negocio.TarifaABM;
import negocio.ZonaABM;
import datos.Medidor;
import datos.PersonaFisica;
import datos.Tarifa;
import datos.TarifaBaja;

public class TestGenerarDetalleYFactura {
	public static void main(String[]args ) {
		
		
		Inspector inspector = InspectorABM.getInstancia().traerInspector(1);
		
		
		Zona zona= ZonaABM.getInstancia().traerZona(1);
		
		LocalDate fecha = LocalDate.now();
		
		
		PersonaFisica cliente = (PersonaFisica) ClienteABM.getInstancia().traerCliente(1);

		
		Medidor medidor = MedidorABM.getInstancia().traer(1);
		
		Lectura lectura =  (LecturaBajaDemanda) LecturaABM.getInstancia().traerLectura(1);
		
		System.out.println(lectura);
		
		
	//	TarifaBaja tarifa1YDetalles = (TarifaBaja) TarifaABM.getInstancia().traerDetallesBajaDemanda(1);
		
	//	Factura facturaTest = new Factura(cliente.getNombre()+" "+cliente.getApellido(), lectura, fecha, medidor.getNroSerie(), "no se que va aca", tarifa1YDetalles);
		
		//		FacturaABM.getInstancia().agregar(facturaTest);
		
		
//		for (DetalleBaja detalle : tarifa1YDetalles.getDetalles()) {
//			System.out.println(detalle);
//		}
		
		
		
		
		
		
		
		
	}
	

}
