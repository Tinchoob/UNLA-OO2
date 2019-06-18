package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.PersonaFisica;
import datos.Zona;
import negocio.ClienteABM;
import negocio.ZonaABM;

public class ControladorAgregarZona extends HttpServlet {
	
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
		response.setContentType("text/html;charset=UTF-8");
		
		try {
			
			Zona zonaAgregada = new Zona(request.getParameter("nombre"));
			int idZonaAgregada = ZonaABM.getInstancia().agregar(zonaAgregada);
			request.setAttribute("zona", zonaAgregada);
			
			request.getRequestDispatcher("/ajaxagregarzona.jsp").forward(request, response);
			
		
		
		} catch (Exception e) {
		//	response.sendError(500, "El DNI Ingresado no existe en la base de datos.");
			response.sendRedirect("error500.html");
		}
	
	}

}
