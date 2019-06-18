<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="datos.Zona"%>

<% Zona zona = (Zona)request.getAttribute("zonaActualizada");
	String nombreViejo = request.getAttribute("nombreViejo").toString();
%>

La zona fue actualizada correctamente!<BR>
Datos de la Zona:

<table class="table">
  <thead>
    <tr>
      <th scope="col">ID de la Zona</th>
      <th scope="col">Nombre Nuevo</th>
      <th scope="col">Antiguo Nombre</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><%=zona.getIdZona()%></td>
      <td><%=zona.getNombre()%></td>
      <td><%=nombreViejo%></td>
    </tr>
  </tbody>
</table>
