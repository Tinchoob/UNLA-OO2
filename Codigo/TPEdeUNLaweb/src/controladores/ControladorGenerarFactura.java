package controladores;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Factura;
import datos.Lectura;
import datos.PersonaFisica;
import datos.Tarifa;
import negocio.ClienteABM;
import negocio.FacturaABM;
import negocio.LecturaABM;
import negocio.TarifaABM;

public class ControladorGenerarFactura extends HttpServlet {
	
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
			String cliente = request.getParameter("cliente");
			Lectura lectura = LecturaABM.getInstancia().traerLecturaPorMesYAnio(Integer.parseInt(request.getParameter("mes")), 
					Integer.parseInt(request.getParameter("anio")));
			
			Tarifa tarifa = TarifaABM.getInstancia().traerDetallesBajaDemanda(1);
			LocalDate fecha = LocalDate.now();
			int nroMedidor = Integer.parseInt(request.getParameter("nroMedidor"));
			Factura factura = new Factura(cliente, lectura, fecha, nroMedidor, "", tarifa);
		int idFactura= FacturaABM.getInstancia().agregar(factura);
			
			request.setAttribute("factura", factura);
			request.setAttribute("idFactura", idFactura);
			
			request.getRequestDispatcher("/ajaxmostrarfactura.jsp").forward(request, response);
			
			
		
		
		} catch (Exception e) {
			response.sendError(500, "El DNI Ingresado no existe en la base de datos.");
			response.sendRedirect("error500.html");
		}
	
	}
	

}
