package test;

import java.time.LocalDate;
import java.util.List;

import datos.Lectura;
import negocio.LecturaABM;

public class TestReporteSiete {
	
	public static void main (String[] args) {
		
		//Lecturas entre 2018 y 2019 del cliente 1 (922) tiene un solo medidor de baja demanda.
		LocalDate fechaDesde = LocalDate.of(2018, 2, 15);
		LocalDate fechaHasta = LocalDate.of(2019, 8, 22);
		List<Lectura> lecturas = LecturaABM.getInstancia().traerLecturaPorClienteEntreFechas("922", fechaDesde, fechaHasta);	
		
		for(Lectura lec: lecturas) {
			System.out.println(lec);
		}
		
		System.out.println();
		//lecturas entre 2018 y 2019 del cliente 3 (140) tiene un solo medidor de alta demanda.
		LocalDate fechaDesdeAlta = LocalDate.of(2018, 2, 15);
		LocalDate fechaHastaAlta = LocalDate.of(2019, 8, 22);
		List<Lectura> lecturasTest = LecturaABM.getInstancia().traerLecturaPorClienteEntreFechas("140", fechaDesdeAlta, fechaHastaAlta);	
		System.out.println();
		
		for(Lectura lec: lecturasTest) {
			System.out.println(lec);
		}
		
		
		
		
	}

}
