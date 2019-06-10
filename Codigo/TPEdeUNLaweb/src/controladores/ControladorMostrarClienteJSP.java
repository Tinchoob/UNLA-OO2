package controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.ClienteABM;
import datos.Cliente;


public class ControladorMostrarClienteJSP extends HttpServlet {

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
			String nroCliente = request.getParameter("nroCliente");
			Cliente cliente = ClienteABM.getInstancia().traerClientePorNro(nroCliente);
			request.setAttribute("cliente", cliente);
		//	request.setAttribute("lstPrestamos", lstPrestamos);

			
		request.getRequestDispatcher("/ajaxvistacliente.jsp").forward(request, response);
		
		} catch (Exception e) {
			//response.sendError(500, "El DNI Ingresado no existe en la base de datos.");
			response.sendRedirect("error500.html");
		}
	
	}
	
	

}
