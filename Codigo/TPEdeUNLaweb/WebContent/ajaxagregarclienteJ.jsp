<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="datos.Cliente"%>
<%@page import="datos.PersonaJuridica"%>

<% PersonaJuridica personaJ = (PersonaJuridica)request.getAttribute("personaJ");
	int idAgregadoJ = Integer.parseInt(request.getAttribute("idAgregadoJ").toString());
%>

Persona Agregada correctamente!<BR>
Datos del Cliente agregado:
<BR>
Razon Social :
<%=personaJ.getRazonSocial()%><BR>
CUIT :
<%=personaJ.getCuit()%><BR>
Numero de Cliente :
<%=personaJ.getNroCliente()%><BR>
ID :
<%=personaJ.getIdCliente()%><BR>