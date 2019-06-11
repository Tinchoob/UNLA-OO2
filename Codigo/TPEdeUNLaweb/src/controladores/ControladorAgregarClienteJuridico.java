package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Cliente;
import datos.PersonaJuridica;
import negocio.ClienteABM;

public class ControladorAgregarClienteJuridico extends HttpServlet {
	
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
			PersonaJuridica personaJ = new PersonaJuridica(request.getParameter("nroCliente"),null,request.getParameter("razonSocial"),request.getParameter("cuit"));
			int idAgregadoJ = ClienteABM.getInstancia().agregar(personaJ);
			request.setAttribute("personaJ", personaJ);
			request.setAttribute("idAgregadoJ", idAgregadoJ);
			
			request.getRequestDispatcher("/ajaxagregarclienteJ.jsp").forward(request, response);

			
		
		
		} catch (Exception e) {
			response.sendRedirect("error500.html");
		}
	
	}

}
