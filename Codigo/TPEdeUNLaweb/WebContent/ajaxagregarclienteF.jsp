<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="datos.Cliente"%>
<%@page import="datos.PersonaFisica"%>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/main.css">

<% PersonaFisica persona = (PersonaFisica)request.getAttribute("personaAgregada");
	int idAgregado = Integer.parseInt(request.getAttribute("idAgregado").toString());
%>

Persona Fisica Agregada correctamente!<BR>
Datos del Cliente agregado:


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