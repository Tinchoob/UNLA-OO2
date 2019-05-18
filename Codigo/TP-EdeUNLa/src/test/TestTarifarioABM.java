package test;

import datos.Tarifario;
import negocio.TarifarioABM;

public class TestTarifarioABM {
	
	public static void main(String[] args) {
		
		
		//agregar un tarifario
		Tarifario tarifario1 = new Tarifario(400,500,null,true);
	//	long id = TarifarioABM.getInstancia().agregar(tarifario1);
		
		
		//traerTarifario
		Tarifario t1BD = TarifarioABM.getInstancia().traerTarifario(1);
		
		//actualizar tarifario
	//	t1BD.setMontoFijo(1000);
	//	t1BD.setMontoVariable(4000);
	//	TarifarioABM.getInstancia().actualizar(t1BD);
		
		
		
		//eliminar tarifario
		TarifarioABM.getInstancia().eliminar(t1BD);
	
		
		
		
	}
}
