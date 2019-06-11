<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="datos.Cliente"%>
<%@page import="datos.PersonaFisica"%>

<% PersonaFisica persona = (PersonaFisica)request.getAttribute("cliente");
%>

Cliente Fisico Actualizado Correctamente!<BR>
Nuevos datos del Cliente:
<BR>
Apellido:
<%=persona.getApellido()%><BR>
Nombre :
<%=persona.getNombre()%><BR>
DNI :
<%=persona.getDni()%><BR>
Numero de Cliente :
<%=persona.getNroCliente()%><BR>