<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%@page import="datos.Factura"%>
<%@page import="datos.ItemFactura"%>
<%@page import="java.util.List"%>


<% Factura factura = (Factura) request.getAttribute("factura");
%>
Cliente:
<%=factura.getCliente() %><BR>

Medidor:
<%=factura.getNroMedidor() %><BR>

Fecha:
<%=factura.getFecha() %>

<%for(ItemFactura item : factura.getLstItem()) {%>

<%=item.toString()%>

<%} %>
