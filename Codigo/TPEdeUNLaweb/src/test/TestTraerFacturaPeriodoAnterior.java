package test;

import datos.Lectura;
import negocio.LecturaABM;

public class TestTraerFacturaPeriodoAnterior {

	public static void main(String[] args) {
		
		Lectura lec = LecturaABM.getInstancia().traerLecturaPorMesYAnio(9, 2019, 222);
		
		System.out.println(lec);
		
		
		
		
		
		

	}

}
