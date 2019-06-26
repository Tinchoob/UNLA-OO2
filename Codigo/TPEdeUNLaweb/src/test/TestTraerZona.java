package test;

import datos.Zona;
import negocio.ZonaABM;

public class TestTraerZona {

	public static void main(String[] args) {
		Zona zona = ZonaABM.getInstancia().traerZonaPorNombre("Burzaco");
		
		System.out.println(zona);
		
	
		
		
		

	}

}
