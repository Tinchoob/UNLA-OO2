<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="datos.PersonaFisica"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema Franc�s</title>
</head>
<BODY>
<%@ include file="/cabecera.jsp" %>
<% PersonaFisica cliente = (PersonaFisica)request.getAttribute("cliente"); %>
<BR>
Apellido: <%= cliente.getApellido() %><BR>
Nombre : <%= cliente.getNombre() %><BR>
DNI : <%= cliente.getDni() %><BR>
ID : <%= cliente.getIdCliente() %><BR>
<BR>
<BR>
<A href="/TPEdeUNLaweb/index.jsp">Volver...</A>
</BODY>
</html>