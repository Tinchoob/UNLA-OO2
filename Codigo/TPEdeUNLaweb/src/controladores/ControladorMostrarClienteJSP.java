package controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;

import negocio.ClienteABM;
import datos.Cliente;
import datos.PersonaFisica;


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
			int dni = Integer.parseInt(request.getParameter("dni"));
			PersonaFisica cliente = (PersonaFisica) ClienteABM.getInstancia().traerClientePorDni(dni);
		
		//	PrestamoABM prestamoAbm = new PrestamoABM();
		//	List<Prestamo> lstPrestamos = prestamoAbm.traerPrestamo(cliente);
			request.setAttribute("cliente", cliente);
		//	request.setAttribute("lstPrestamos", lstPrestamos);

			
		request.getRequestDispatcher("/ajaxvistacliente.jsp").forward(request, response);
		
		} catch (Exception e) {
			//response.sendError(500, "El DNI Ingresado no existe en la base de datos.");
			response.sendRedirect("error500.html");
		}
	
	}
	
	

}
