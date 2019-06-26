package controladores;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Factura;
import datos.Lectura;
import funciones.Funciones;
import negocio.FacturaABM;
import negocio.LecturaABM;

public class ControladorBuscarFacturas extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			LocalDate fechaDesde = Funciones.traerFechaGuion(request.getParameter("fechaDesde"));
			LocalDate fechaHasta = Funciones.traerFechaGuion(request.getParameter("fechaHasta"));
		
			List<Factura> facturas = FacturaABM.getInstancia().traerFacturasEntreFechas(fechaDesde, fechaHasta);
			
			request.setAttribute("facturas", facturas);
			
			request.getRequestDispatcher("/ajaxMostrarFacturas.jsp").forward(request, response);
			
			
			
			
		} catch (Exception e) {
			response.sendRedirect("/error500.html");
		}
	
	
	
	}

}
