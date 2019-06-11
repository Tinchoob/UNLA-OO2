package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Cliente;
import datos.PersonaJuridica;
import negocio.ClienteABM;

public class ControladorBajaCliente extends HttpServlet {
	
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
			Cliente cliente = ClienteABM.getInstancia().traerClientePorNroSinContacto(request.getParameter("nroCliente"));
			ClienteABM.getInstancia().eliminar(cliente);
			request.setAttribute("clienteEliminado", cliente);
			
			request.getRequestDispatcher("/ajaxbajacliente.jsp").forward(request, response);
		
		
		} catch (Exception e) {
			response.sendRedirect("error500.html");
		}
	
	}

}