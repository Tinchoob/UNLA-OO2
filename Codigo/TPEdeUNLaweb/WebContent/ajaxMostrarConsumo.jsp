<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%@page import="datos.Lectura"%>
<%@page import="datos.Cliente"%>
<%@page import="datos.PersonaFisica"%>
<%@page import="datos.PersonaJuridica"%>
<%@page import="datos.LecturaAltaDemanda"%>
<%@page import="datos.LecturaBajaDemanda"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>


<% List<Lectura> lecturas = (List<Lectura>) request.getAttribute("lecturas");
	Cliente cliente = lecturas.get(1).getMedidor().getCliente();
	List<LecturaBajaDemanda> lecturasBaja = new ArrayList<LecturaBajaDemanda>();
	List<LecturaAltaDemanda> lecturasAlta = new ArrayList<LecturaAltaDemanda>();
	PersonaFisica persona = null;
	PersonaJuridica empresa = null;
%>



<table class="table">
  <thead>
    <tr>
      <th scope="col">Numero de Cliente</th>
      	<th scope="col">Identificación</th>
       <th scope="col">N° de Medidor</th>

    </tr>
  </thead>
  <tbody>
    <tr>
      <td scope="row"><%=cliente.getNroCliente()%></td>
      <%if (cliente instanceof PersonaFisica) {
      	persona = (PersonaFisica) cliente;%>
      	<td scope="row"><%=persona.getNombre() %> <%=persona.getApellido()%></td><%}%>
      <%if (cliente instanceof PersonaJuridica) {
      	empresa = (PersonaJuridica) cliente;%>
      	<td scope="row"><%=empresa.getRazonSocial()%> </td><%}%>	
      <td scope="row"><%=lecturas.get(1).getMedidor().getNroSerie()%></td>
      

    </tr>
  </tbody>
</table>



<%if (lecturas.get(1) instanceof LecturaBajaDemanda){%>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Fecha y Hora de la Lectura</th>
      <th scope="col">Consumo Hasta la Fecha</th>
      
    </tr>
  </thead>
<%for (Lectura lec : lecturas){
	lecturasBaja.add((LecturaBajaDemanda) lec);
	
}%>
<%for(LecturaBajaDemanda lec : lecturasBaja) {%>
	
	<tbody>
    <tr>
      <td scope="row"><%=lec.getFechaHoraLectura()%></td>
      <td><%=lec.getConsumo()%> KwH</td>
    </tr>
  

<%} %>
<%} %>
  </tbody>


<%if (lecturas.get(1) instanceof LecturaAltaDemanda){%>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Fecha y Hora de la Lectura</th>
      <th scope="col">Consumo Horas Pico</th>
      <th scope="col">Consumo Horas Valle</th>
      <th scope="col">Consumo Horas Resto</th>
      
    </tr>
  </thead>

<%for (Lectura lec : lecturas){
	lecturasAlta.add((LecturaAltaDemanda) lec);
	
}%>
<%for(LecturaAltaDemanda lec : lecturasAlta) {%>
	
	<tbody>
    <tr>
      <td scope="row"><%=lec.getFechaHoraLectura()%></td>
      <td><%=lec.getConsumoHorasPico()%> KwH</td>
      <td><%=lec.getConsumoHorasValle()%> KwH</td>
      <td><%=lec.getConsumoHorasResto()%> KwH</td>
    </tr>
  

<%} %>
<%} %>
  </tbody>
</table>
  El ultimo valor de la tabla representa el consumo total del medidor hasta la ultima Lectura realizada.
  Para obtener un valor a día actual, revise su medidor.



