package controladores;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Factura;
import datos.Lectura;
import datos.LecturaAltaDemanda;
import datos.LecturaBajaDemanda;
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
			Tarifa tarifa = null;
			
			String cliente = request.getParameter("cliente");
			Lectura lectura = LecturaABM.getInstancia().traerLecturaPorMesYAnio(Integer.parseInt(request.getParameter("mes")), 
					Integer.parseInt(request.getParameter("anio")), Integer.parseInt(request.getParameter("nroMedidor")));



			
			if (lectura instanceof LecturaBajaDemanda) {
				tarifa = TarifaABM.getInstancia().traerDetallesTarifaBajaDemanda(1);
				}
			if (lectura instanceof LecturaAltaDemanda) {
				if (((LecturaAltaDemanda) lectura).getTipoTension().equals("BT")) {
				tarifa = TarifaABM.getInstancia().traerDetallesTarifaAltaDemanda(3);}
				if (((LecturaAltaDemanda) lectura).getTipoTension().equals("MT")) {
				tarifa = TarifaABM.getInstancia().traerDetallesTarifaAltaDemanda(4);}
				if (((LecturaAltaDemanda) lectura).getTipoTension().equals("AT")) {
				tarifa = TarifaABM.getInstancia().traerDetallesTarifaAltaDemanda(5);}
				
				}

			
			LocalDate fecha = LocalDate.of(2019,Integer.parseInt(request.getParameter("mes")),1);
			int nroMedidor = Integer.parseInt(request.getParameter("nroMedidor"));
			Factura factura = new Factura(cliente, lectura, fecha, nroMedidor, "", tarifa);
			int idFactura= FacturaABM.getInstancia().agregar(factura);
			
			request.setAttribute("factura", factura);
			request.setAttribute("idFactura", idFactura);
			
			
			request.getRequestDispatcher("/ajaxmostrarfactura.jsp").forward(request, response);
			
			
			
		
		} catch (Exception e) {
			response.sendError(500, "La factura que quiere generar no corresponde al mes correspondiente");
			//response.sendRedirect("error500.html");
		}
	
	}
	

}
