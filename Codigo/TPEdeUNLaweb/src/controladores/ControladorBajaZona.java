package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Zona;
import negocio.ZonaABM;

public class ControladorBajaZona extends HttpServlet {
	
	
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
			Zona zona = ZonaABM.getInstancia().traerZonaPorNombre(request.getParameter("nombre"));
			ZonaABM.getInstancia().bajaZonaLogica(zona);
			request.setAttribute("zonaEliminada", zona);
			request.getRequestDispatcher("/ajaxbajazona.jsp").forward(request, response);
			
		
		
		} catch (Exception e) {
			response.sendRedirect("error500.html");
		}
	
	}

}
