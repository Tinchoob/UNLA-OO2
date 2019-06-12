<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="datos.Cliente"%>
<%@page import="datos.PersonaJuridica"%>

<% PersonaJuridica persona = (PersonaJuridica)request.getAttribute("cliente");
%>

Cliente Juridico Actualizado Correctamente!<BR>
Nuevos datos del Cliente:

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
      <th scope="row"><%=persona.getNroCliente()%></th>
      <td><%=persona.getRazonSocial()%></td>
      <td><%=persona.getCuit()%></td>
    </tr>
  </tbody>
</table>