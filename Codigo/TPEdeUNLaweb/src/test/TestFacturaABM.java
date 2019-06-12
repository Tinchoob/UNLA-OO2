package test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import dao.TarifaDao;
import datos.Factura;
import datos.Inspector;
import datos.ItemFactura;
import datos.Lectura;
import datos.LecturaBajaDemanda;
import datos.Medidor;
import datos.Tarifa;
import datos.TarifaBaja;
import negocio.FacturaABM;
import negocio.InspectorABM;
import negocio.LecturaABM;
import negocio.MedidorABM;
import negocio.TarifaABM;


public class TestFacturaABM {
	
	public static void main(String[] args) {
		LocalDate fechaFactura= LocalDate.of(2019, 10, 27);
		LocalDateTime fechaLectura= LocalDateTime.of(2019, 3, 11, 13, 30);
		Inspector i1= InspectorABM.getInstancia().traerInspector(1);
		
		
		//long id1= LecturaABM.getInstancia().agregar(l3);
		Tarifa t1= TarifaDao.getInstancia().traerDetallesBajaDemanda(1);
		//Factura f1= new Factura();
		//Factura f2= new Factura("Contento Guido",l3,fechaFactura,421,"asd",t1);
		//System.out.println(((TarifaBaja)t1).toString());
		/*Lectura l1=LecturaABM.getInstancia().traerLecturaPorMesYAnio(2019, 3);
		
		System.out.println(l1.toString());*/
		//Factura f1= FacturaABM.getInstancia().traerFacturaYLstItem(7);
		
		//FacturaABM.getInstancia().eliminar(f1);
		//AGREGAR LECTURA
		
		
		//INSPECTORES
		Inspector is1= InspectorABM.getInstancia().traerInspector(2);
		Inspector is2= InspectorABM.getInstancia().traerInspector(3);
		
		//MEDIDORES
		Medidor m1= MedidorABM.getInstancia().traer(1);
		Medidor m2= MedidorABM.getInstancia().traer(2);
		Medidor m3= MedidorABM.getInstancia().traer(3);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		
		//LECTURA
		LocalDateTime fechaLectura1= LocalDateTime.of(2019, 3, 1,13,00);
		LocalDateTime fechaLectura2= LocalDateTime.of(2019, 5, 1,13,00);
		LocalDateTime fechaLectura3= LocalDateTime.of(2019, 7, 1,13,00);
		
		Lectura l1= new LecturaBajaDemanda(fechaLectura1,is1,m1,200);
		Lectura l2= new LecturaBajaDemanda(fechaLectura2,is2,m1,500);
		Lectura l3= new LecturaBajaDemanda(fechaLectura3,is2,m1,1000);
		
		
		
		
		long id= LecturaABM.getInstancia().agregar(l3);
		
		//Factura f1= new Factura("Ignacio Montania",)
		
		//Lectura l4= LecturaABM.getInstancia().traerLectura(3);
		
		//AGREGAR FACTURA
		
		//long id=FacturaABM.getInstancia().agregar(f2);
		
		
		
		
		String cliente = "Ignacio Montagne";
		Lectura lectura = LecturaABM.getInstancia().traerLecturaPorMesYAnio(5,2019);
		
		Tarifa tarifa = TarifaABM.getInstancia().traerDetallesBajaDemanda(1);
		LocalDate fecha = LocalDate.now();
		int nroMedidor = 123;
		Factura factura = new Factura(cliente, lectura, fecha, nroMedidor, "", tarifa);
		long idFactura= FacturaABM.getInstancia().agregar(factura);
		
		
		//TRAER FACTURA
		
		
		/*
		System.out.println(f1.toString());
		for(ItemFactura i: f1.getLstItem()) {
			System.out.println(i.toString());
		}*/
		
		
		
		
		
		
	}
}
