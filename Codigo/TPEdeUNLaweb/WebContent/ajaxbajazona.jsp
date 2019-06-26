<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="datos.Zona"%>
<%@page import="java.util.List"%>



<%
	Zona zona = (Zona) request.getAttribute("zonaEliminada");
%>

<BR>
La zona fue dada de baja correctmente!<BR>
Datos de la zona: <BR>


<table class="table">
  <thead>
    <tr>
      <th scope="col">ID de la Zona</th>
      <th scope="col">Nombre</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><%=zona.getIdZona()%></td>
      <td><%=zona.getNombre()%></td>
    </tr>
  </tbody>
</table>




