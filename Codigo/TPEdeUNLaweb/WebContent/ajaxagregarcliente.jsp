<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="datos.Cliente"%>
<%@page import="datos.PersonaFisica"%>

<% PersonaFisica persona = (PersonaFisica)request.getAttribute("personaAgregada");
	int idAgregado = Integer.parseInt(request.getAttribute("idAgregado").toString());
%>

Persona Agregada correctamente!<BR>
Datos del Cliente agregado:
<BR>
Apellido:
<%=persona.getApellido()%><BR>
Nombre :
<%=persona.getNombre()%><BR>
DNI :
<%=persona.getDni()%><BR>
Numero de Cliente :
<%=persona.getNroCliente()%><BR>
ID :
<%=persona.getIdCliente()%><BR>