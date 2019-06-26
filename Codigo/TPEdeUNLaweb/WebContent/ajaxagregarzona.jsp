<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="datos.Zona"%>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/main.css">

<%	Zona zona = (Zona) request.getAttribute("zona");%>

Zona agregada correctamente!<BR>
Datos de la Zona agregada:

<table class="table">
  <thead>
    <tr>
      <th scope="col">Nombre de la Zona</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><%=zona.getNombre()%></td>
    </tr>
  </tbody>
</table>