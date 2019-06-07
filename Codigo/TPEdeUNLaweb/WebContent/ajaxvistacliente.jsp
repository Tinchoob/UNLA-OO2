<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="datos.PersonaFisica"%>
<%@page import="java.util.List"%>



<%
	PersonaFisica cliente = (PersonaFisica) request.getAttribute("cliente");
%>

<%
	// List<Prestamo> prestamos = (List) request.getAttribute("lstPrestamos");
%>

<BR>
Apellido:
<%=cliente.getApellido()%><BR>
Nombre :
<%=cliente.getNombre()%><BR>
DNI :
<%=cliente.getDni()%><BR>
ID :
<%=cliente.getIdCliente()%><BR>
<BR>
<input type="hidden" id="idcliente" name="idcliente"
	value="<%=cliente.getIdCliente()%>" />
	
	