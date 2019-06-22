<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%@page import="datos.Lectura"%>
<%@page import="datos.Cliente"%>
<%@page import="datos.LecturaAltaDemanda"%>
<%@page import="datos.LecturaBajaDemanda"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>


<% List<Lectura> lecturas = (List<Lectura>) request.getAttribute("lecturas");
	Cliente cliente = lecturas.get(1).getMedidor().getCliente();
	List<LecturaBajaDemanda> lecturasBaja = new ArrayList<LecturaBajaDemanda>();
	List<LecturaAltaDemanda> lecturasAlta = new ArrayList<LecturaAltaDemanda>();
%>



<table class="table">
  <thead>
    <tr>
      <th scope="col">Numero de Cliente</th>

    </tr>
  </thead>
  <tbody>
    <tr>
      <td scope="row"><%=cliente.getNroCliente()%></td>

    </tr>
  </tbody>
</table>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Fecha de la Lectura</th>
      <th scope="col">Consumo Hasta la Fecha</th>
      <th scope="col">Medidor N°</th>
      
    </tr>
  </thead>

<%if (lecturas.get(1) instanceof LecturaBajaDemanda){%>
<%for (Lectura lec : lecturas){
	lecturasBaja.add((LecturaBajaDemanda) lec);
	
}%>
<%for(LecturaBajaDemanda lec : lecturasBaja) {%>
	
	<tbody>
    <tr>
      <td scope="row"><%=lec.getFechaHoraLectura()%></td>
      <td><%=lec.getConsumo()%> KwH</td>
      <td><%=lec.getMedidor().getNroSerie()%></td>
    </tr>
  

<%} %>
<%} %>

  </tbody>
</table>
  El ultimo valor de la tabla representa el consumo total del medidor hasta la ultima Lectura realizada.



