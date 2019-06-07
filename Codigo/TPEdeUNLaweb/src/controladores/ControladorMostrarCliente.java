package controladores;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.HibernateException;
import datos.Cliente;
import negocio.ClienteABM;


public class ControladorMostrarCliente extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			procesarPeticion(request, response);
			}
			protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			procesarPeticion(request, response);
			}

			
			private void procesarPeticion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					response.setContentType("text/html;charset=UTF-8");
					try {
					int dni = Integer.parseInt(request.getParameter("dni"));
					ClienteABM clienteAbm=new ClienteABM();
					Cliente cliente=clienteAbm.traer(dni);
					response.setStatus(200);
					PrintWriter salida = response.getWriter();

					}
					
					catch (Exception e) {	//cambio el catch para que mande el html que cree
					int dni = Integer.parseInt(request.getParameter("dni"));
					//response.sendError(500, "El DNI Ingresado no existe en la base de datos.");
					response.sendRedirect("error500.html");
	
					
					
					
					
					}
		   }



}

			
	
	
