package test;

import java.time.LocalDate;

import datos.Cliente;
import datos.DetalleAlta;
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
import datos.PersonaJuridica;
import datos.Tarifa;
import datos.TarifaAlta;
import datos.TarifaBaja;

public class TestGenerarDetalleYFactura {
	public static void main(String[]args ) {
		
		
	//	Inspector inspector = InspectorABM.getInstancia().traerInspector(1);
		
		
	//	Zona zona= ZonaABM.getInstancia().traerZona(1);
		
		LocalDate fecha = LocalDate.now();
		
		
		PersonaFisica cliente = (PersonaFisica) ClienteABM.getInstancia().traerCliente(1);
		
		
		Medidor medidor = MedidorABM.getInstancia().traer(1);
		
		Lectura lectura =  (LecturaBajaDemanda) LecturaABM.getInstancia().traerLectura(1);
		
		System.out.println(lectura);
		
		
		TarifaBaja tarifa1YDetalles = (TarifaBaja) TarifaABM.getInstancia().traerDetallesBajaDemanda(1);
		
		Factura facturaTest = new Factura(cliente.getNombre()+" "+cliente.getApellido(), lectura, fecha, medidor.getNroSerie(), "no se que va aca", tarifa1YDetalles);
		
		Factura facturaAltaTest = new Factura();
		
	//	FacturaABM.getInstancia().agregar(facturaTest);
		
		PersonaJuridica clienteJuridico = (PersonaJuridica) ClienteABM.getInstancia().traerCliente(3);	//universidad de lanus
		
		Lectura lecturaAlta = LecturaABM.getInstancia().traerLectura(3);
		
		Medidor medidorAlta= lecturaAlta.getMedidor();
		
		TarifaAlta tarifaBTAltaConDetalle = (TarifaAlta) TarifaABM.getInstancia().traerDetallesAltaDemanda(3);
		TarifaAlta tarifaMTAltaConDetalle = (TarifaAlta) TarifaABM.getInstancia().traerDetallesAltaDemanda(4);
		TarifaAlta tarifaATAltaConDetalle = (TarifaAlta) TarifaABM.getInstancia().traerDetallesAltaDemanda(5);
		
		
		System.out.println();
		System.out.println(tarifaBTAltaConDetalle);
		for(DetalleAlta dAlta : tarifaBTAltaConDetalle.getDetalles()) {
			System.out.println(dAlta);
		}
		System.out.println();
		
		System.out.println(tarifaMTAltaConDetalle);
		for(DetalleAlta dAlta : tarifaMTAltaConDetalle.getDetalles()) {
			System.out.println(dAlta);
		}
		System.out.println();
		
		System.out.println(tarifaATAltaConDetalle);
		for(DetalleAlta dAlta : tarifaATAltaConDetalle.getDetalles()) {
			System.out.println(dAlta);
		}
		
		
		
		//foreach que imprime la tarifa DE BAJA Y SU DETALLE
//		for (DetalleBaja detalle : tarifa1YDetalles.getDetalles()) {
//			System.out.println(detalle);
//		}
		
		
		
		
		
		
		
		
	}
	

}
