<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="datos.Cliente"%>
<%@page import="datos.PersonaJuridica"%>

<% PersonaJuridica persona = (PersonaJuridica)request.getAttribute("cliente");
%>

Cliente Juridico Actualizado Correctamente!<BR>
Nuevos datos del Cliente:
<BR>
Razon Social :
<%=persona.getRazonSocial()%><BR>
CUIT :
<%=persona.getCuit()%><BR>
Numero de Cliente :
<%=persona.getNroCliente()%><BR>