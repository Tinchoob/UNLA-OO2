package test;

import datos.Factura;
import negocio.FacturaABM;

public class TestQueryFacturaAnterior {

	public static void main(String[] args) {
		
		Factura fac = FacturaABM.getInstancia().traerUltimaFactura();
		
		System.out.println(fac);
		

	}

}
