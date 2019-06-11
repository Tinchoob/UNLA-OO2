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

<BR>
Apellido:
<%=persona.getApellido()%><BR>
Nombre :
<%=persona.getNombre()%><BR>
DNI :
<%=persona.getDni()%><BR>
ID :
<%=cliente.getIdCliente()%><BR>
<BR>

<%}%>

<% if (cliente instanceof PersonaJuridica){%>
<% 
	PersonaJuridica empresa = (PersonaJuridica) cliente;
%>

<BR>
Razon Social:
<%=empresa.getRazonSocial()%><BR>
CUIT:
<%=empresa.getCuit()%><BR>
ID:
<%=empresa.getIdCliente()%><BR>
<%}%>