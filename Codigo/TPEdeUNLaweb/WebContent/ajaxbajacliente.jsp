<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="datos.Cliente"%>
<%@page import="datos.PersonaFisica"%>
<%@page import="datos.PersonaJuridica"%>
<%@page import="java.util.List"%>



<%
	Cliente cliente = (Cliente) request.getAttribute("clienteEliminado");
%>

<BR>
Cliente eliminado Correctamente!<BR>
Datos del cliente eliminado: <BR>
<% if (cliente instanceof PersonaFisica){%>

<% 
	PersonaFisica persona = (PersonaFisica) cliente;
%>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Numero de Cliente</th>
      <th scope="col">Apellido</th>
      <th scope="col">Nombre</th>
      <th scope="col">Dni</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row"><%=persona.getNroCliente()%></th>
      <td><%=persona.getApellido()%></td>
      <td><%=persona.getNombre()%></td>
      <td><%=persona.getDni()%></td>
    </tr>
  </tbody>
</table>

<%}%>

<% if (cliente instanceof PersonaJuridica){%>
<% 
	PersonaJuridica empresa = (PersonaJuridica) cliente;
%>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Numero de Cliente</th>
      <th scope="col">Razon Social</th>
      <th scope="col">CUIT</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row"><%=empresa.getNroCliente()%></th>
      <td><%=empresa.getRazonSocial()%></td>
      <td><%=empresa.getCuit()%></td>
    </tr>
  </tbody>
</table>
<%}%>













