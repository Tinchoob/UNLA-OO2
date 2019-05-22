package test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import datos.Cliente;
import datos.Factura;
import datos.Inspector;
import datos.Lectura;
import datos.LecturaBajaDemanda;
import datos.Medidor;
import datos.PersonaFisica;
import datos.Tarifa;
import datos.TarifaBaja;
import datos.Zona;
import negocio.FacturaABM;

public class TestGenerarDetalle {

	public static void main(String[] args) {
		
		Inspector inspectorRandom = new Inspector("Hector","Carballo",332211);
		Zona zonaRandom = new Zona("ZONA22");
		Cliente personaRandom = new PersonaFisica("922",null,"Ignacio","Montana",4105567);
		
		Medidor medidorRandom = new Medidor(123, personaRandom, "33221", zonaRandom);
		
		LocalDateTime date = LocalDateTime.now();
		
		Lectura lecturaRandom = new LecturaBajaDemanda(date,inspectorRandom,medidorRandom,235.5);
		
		LocalDate dateFactura = LocalDate.now();
		
		Tarifa tarifaBaja = new TarifaBaja("Luz",dateFactura);
		
		Factura fac1 = null;
		try {
			fac1 = new Factura("Ignacio Random",lecturaRandom,dateFactura,medidorRandom.getNroSerie(),"Observacion",tarifaBaja);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FacturaABM facturaABM = FacturaABM.getInstancia();
		
		facturaABM.agregar(fac1);


	}

}
