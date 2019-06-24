package test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import datos.Factura;
import datos.Inspector;
import datos.ItemFactura;
import datos.Lectura;
import datos.LecturaAltaDemanda;
import datos.LecturaBajaDemanda;
import datos.Medidor;
import datos.Tarifa;
import datos.TarifaBaja;
import negocio.FacturaABM;
import negocio.InspectorABM;
import negocio.LecturaABM;
import negocio.MedidorABM;
import negocio.TarifaABM;

public class TestFacturaBaja {

	public static void main(String[] args) {
		LocalDate fechaFactura = LocalDate.of(2019, 10, 27);
		LocalDateTime fechaLectura = LocalDateTime.of(2019, 3, 11, 13, 30);
		Inspector i1 = InspectorABM.getInstancia().traerInspector(1);

		// long id1= LecturaABM.getInstancia().agregar(l3);
		Tarifa t1 = TarifaABM.getInstancia().traerDetallesTarifaBajaDemanda(1);
		// Factura f1= new Factura();
		// Factura f2= new Factura("Contento Guido",l3,fechaFactura,421,"asd",t1);
		// System.out.println(((TarifaBaja)t1).toString());
		/*
		 * Lectura l1=LecturaABM.getInstancia().traerLecturaPorMesYAnio(2019, 3);
		 * 
		 * System.out.println(l1.toString());
		 */
		// Factura f1= FacturaABM.getInstancia().traerFacturaYLstItem(7);

		// FacturaABM.getInstancia().eliminar(f1);
		// AGREGAR LECTURA

		// INSPECTORES
		Inspector is1 = InspectorABM.getInstancia().traerInspector(2);
		Inspector is2 = InspectorABM.getInstancia().traerInspector(3);

		// MEDIDORES
		Medidor m1 = MedidorABM.getInstancia().traer(1);
		Medidor m2 = MedidorABM.getInstancia().traer(2);
		// ALTA
		Medidor m3 = MedidorABM.getInstancia().traer(3);
		Medidor m4 = MedidorABM.getInstancia().traer(4);

		System.out.println(m1.toString());
		System.out.println(m2.toString());
		// ALTA
		System.out.println(m3.toString());
		System.out.println(m4.toString());

		// LECTURA
		LocalDateTime fechaLectura1 = LocalDateTime.of(2019, 3, 1, 12, 00);
		LocalDateTime fechaLectura2 = LocalDateTime.of(2019, 5, 1, 12, 00);
		LocalDateTime fechaLectura3 = LocalDateTime.of(2019, 7, 1, 12, 00);

		Lectura l1 = new LecturaBajaDemanda(fechaLectura1, is1, m1, 200);
		Lectura l2 = new LecturaBajaDemanda(fechaLectura2, is2, m1, 500);
		Lectura l3 = new LecturaBajaDemanda(fechaLectura3, is2, m1, 1000);

//		LocalDateTime fechaLectura4= LocalDateTime.of(2019, 9, 2,12,00);
//		LocalDateTime fechaLectura5= LocalDateTime.of(2019, 11, 2,12,00);
//		LocalDateTime fechaLectura6= LocalDateTime.of(2020, 1, 2,12,00);
//		
		Lectura l4 = (LecturaBajaDemanda) LecturaABM.getInstancia().traerLectura(3);
		System.out.println(l4.toString());
		
//		Lectura l5= new LecturaAltaDemanda(fechaLectura5,is2,m3,250,"BT",200,300,400);
//		Lectura l6= new LecturaAltaDemanda(fechaLectura6,is2,m3,350,"BT",300,400,500);
//		

//		long id= LecturaABM.getInstancia().agregar(l3);

		// Factura f1= new Factura("Ignacio Montania",)

		// Lectura l4= LecturaABM.getInstancia().traerLectura(3);

		// AGREGAR FACTURA

		// long id=FacturaABM.getInstancia().agregar(f2);

		// TAFIRA ALTA DEMANDA

		//LocalDate fechaFactura1 = LocalDate.of(2019, 5, 19);
		//Tarifa tt1 = TarifaABM.getInstancia().traerDetallesTarifaAltaDemanda(3);
		LocalDateTime fl5= LocalDateTime.of(2019, 9, 1,13,00,00);
		Lectura l5= new LecturaBajaDemanda(fl5,is1,m1,1900);
		//long id= LecturaABM.getInstancia().agregar(l5);
		//long id=LecturaABM.getInstancia().agregar(l5);
		Lectura l6= LecturaABM.getInstancia().traerLectura(7);
		LocalDate fechaFactura1= LocalDate.of(2019, 9, 1);
		Factura f1 = new Factura("Ignacio Montania", l6, fechaFactura1, 222, "", t1);
		long id= FacturaABM.getInstancia().agregar(f1);
		Factura f2 = FacturaABM.getInstancia().traerFacturaYLstItem(9);
		//System.out.println(t1.toString());
		//FacturaABM.getInstancia().eliminar(f2);
		// TRAER FACTURA
		
		//System.out.println(f1.toString());
		for (ItemFactura i : f2.getLstItem()) {
			System.out.println(i.toString());
		}

	}
}