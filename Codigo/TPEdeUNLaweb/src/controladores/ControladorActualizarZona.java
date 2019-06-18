package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Zona;
import negocio.ZonaABM;

public class ControladorActualizarZona extends HttpServlet {
	
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
			String nombreViejo = request.getParameter("nombreModif");
			Zona zona = ZonaABM.getInstancia().traerZonaPorNombre(request.getParameter("nombreModif"));
			zona.setNombre(request.getParameter("nombreNuevo"));
			ZonaABM.getInstancia().actualizar(zona);
			
			request.setAttribute("zonaActualizada", zona);
			request.setAttribute("nombreViejo", nombreViejo);
			
			request.getRequestDispatcher("/ajaxactualizarzona.jsp").forward(request, response);
			
		
		} catch (Exception e) {
			response.sendError(500, "El DNI Ingresado no existe en la base de datos.");
			response.sendRedirect("error500.html");
		}
	
	}

}
