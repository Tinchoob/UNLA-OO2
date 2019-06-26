package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.PersonaFisica;
import datos.PersonaJuridica;
import negocio.ClienteABM;

public class ControladorActualizarJuridico extends HttpServlet {
	
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
			PersonaJuridica personaAModificar = (PersonaJuridica) ClienteABM.getInstancia().traerClientePorNro(request.getParameter("nroCliente"));
			personaAModificar.setRazonSocial(request.getParameter("razonSocial"));
			personaAModificar.setCuit(request.getParameter("cuit"));
			ClienteABM.getInstancia().actualizar(personaAModificar);
			
			request.setAttribute("cliente",personaAModificar);
			
			request.getRequestDispatcher("/ajaxactualizarclienteJ.jsp").forward(request, response);
			
		
		
		} catch (Exception e) {
			response.sendError(500, "El DNI Ingresado no existe en la base de datos.");
			response.sendRedirect("error500.html");
		}
	
	}

}
