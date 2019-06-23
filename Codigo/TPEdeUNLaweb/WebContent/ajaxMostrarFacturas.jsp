<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%@page import="datos.Factura"%>
<%@page import="java.util.List"%>


<% List<Factura> facturas = (List<Factura>) request.getAttribute("facturas");
%>

<%int i=0; %>

<% for(Factura factura : facturas){%>
<%i++; %>


<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Cliente</th>
      <th scope="col">Medidor</th>
      <th scope="col">Fecha</th>
      <th scope="col">Observaciones</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <td scope="row"><%=i%></td>
      <td scope="row"><%=factura.getCliente()%></td>
      <td><%=factura.getNroMedidor()%></td>
      <td><%=factura.getFecha()%></td>
      <td><%=factura.getObservaciones()%></td>
    </tr>
  </tbody>
</table>

<%}%>
<%i=0; %>

