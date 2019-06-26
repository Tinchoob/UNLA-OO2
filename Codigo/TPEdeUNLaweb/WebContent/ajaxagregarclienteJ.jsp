<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="datos.Cliente"%>
<%@page import="datos.PersonaJuridica"%>

<% PersonaJuridica personaJ = (PersonaJuridica)request.getAttribute("personaJ");
	int idAgregadoJ = Integer.parseInt(request.getAttribute("idAgregadoJ").toString());
%>

Persona Agregada correctamente!<BR>
Datos del Cliente agregado:

<table class="table">
  <thead>
    <tr>
      <th scope="col">Numero de Cliente</th>
      <th scope="col">Razon Social</th>
      <th scope="col">Cuit</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row"><%=personaJ.getNroCliente()%></th>
      <td><%=personaJ.getRazonSocial()%></td>
      <td><%=personaJ.getCuit()%></td>
    </tr>
  </tbody>
</table>