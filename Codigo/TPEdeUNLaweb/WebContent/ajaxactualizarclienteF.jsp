<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="datos.Cliente"%>
<%@page import="datos.PersonaFisica"%>

<% PersonaFisica persona = (PersonaFisica)request.getAttribute("cliente");
%>

Cliente Fisico Actualizado Correctamente!<BR>
Nuevos datos del Cliente:

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