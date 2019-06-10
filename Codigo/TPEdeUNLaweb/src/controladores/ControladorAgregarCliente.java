package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Cliente;
import datos.PersonaFisica;
import negocio.ClienteABM;

public class ControladorAgregarCliente extends HttpServlet {
	
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
			PersonaFisica personaAgregada = new PersonaFisica(request.getParameter("nroCliente"), null,
					request.getParameter("nombre"), request.getParameter("apellido"),
				Integer.parseInt(request.getParameter("dni")));
			int idAgregado = ClienteABM.getInstancia().agregar(personaAgregada);
			request.setAttribute("personaAgregada", personaAgregada);
			request.setAttribute("idAgregado", idAgregado);
			
			request.getRequestDispatcher("/ajaxagregarcliente.jsp").forward(request, response);
			
		
		
		} catch (Exception e) {
			response.sendError(500, "El DNI Ingresado no existe en la base de datos.");
			response.sendRedirect("error500.html");
		}
	
	}

}
