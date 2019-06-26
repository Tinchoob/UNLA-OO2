package test;

import java.time.LocalDate;
import java.util.List;

import datos.Factura;
import negocio.FacturaABM;

public class TestReporteOcho {

	public static void main(String[] args) {
		
		
		LocalDate fechaDesde = LocalDate.of(2019, 1, 1);
		LocalDate fechaHasta = LocalDate.of(2019, 6, 1);
		
		
		List<Factura> facturas = FacturaABM.getInstancia().traerFacturasEntreFechas(fechaDesde, fechaHasta);
		
		for(Factura fac : facturas) {
			System.out.println(fac);
		}
		
		
		
		

	}
	
	
	

}
