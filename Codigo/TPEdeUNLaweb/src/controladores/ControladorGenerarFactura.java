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
			boolean esValida=true;
			String cliente = request.getParameter("cliente");
			Lectura lectura = LecturaABM.getInstancia().traerLecturaPorMesYAnio(Integer.parseInt(request.getParameter("mes")), 
					Integer.parseInt(request.getParameter("anio")));
			Factura ultimaFactura = FacturaABM.getInstancia().traerUltimaFactura();
			request.setAttribute("factura", ultimaFactura);
			if ((ultimaFactura.getFecha().getMonthValue() + 2) >= Integer.parseInt(request.getParameter("mes"))) {
				esValida = false;
				request.setAttribute("esValida", esValida);
				request.setAttribute("factura", ultimaFactura);
			}
			else {
				request.setAttribute("esValida", esValida);
			
			if (lectura instanceof LecturaBajaDemanda) {
				tarifa = TarifaABM.getInstancia().traerDetallesTarifaBajaDemanda(1);
				}
			if (lectura instanceof LecturaAltaDemanda) {
				tarifa = TarifaABM.getInstancia().traerDetallesTarifaAltaDemanda(3);
				}

			
			LocalDate fecha = LocalDate.now();
			int nroMedidor = Integer.parseInt(request.getParameter("nroMedidor"));
			Factura factura = new Factura(cliente, lectura, fecha, nroMedidor, "", tarifa);
			int idFactura= FacturaABM.getInstancia().agregar(factura);
			
			request.setAttribute("factura", factura);
			request.setAttribute("idFactura", idFactura);
			
			}
			
			request.getRequestDispatcher("/ajaxmostrarfactura.jsp").forward(request, response);
			
			
			
		
		} catch (Exception e) {
			response.sendError(500, "La factura que quiere generar no corresponde al mes correspondiente");
			//response.sendRedirect("error500.html");
		}
	
	}
	

}
