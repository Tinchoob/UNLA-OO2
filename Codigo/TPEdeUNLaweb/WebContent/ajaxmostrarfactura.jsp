<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%@page import="datos.Factura"%>
<%@page import="datos.ItemFactura"%>
<%@page import="java.util.List"%>


<% Factura factura = (Factura) request.getAttribute("factura");
%>

<% int i=1;%>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Cliente</th>
      <th scope="col">Medidor</th>
      <th scope="col">Fecha</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td scope="row"><%=factura.getCliente()%></td>
      <td><%=factura.getNroMedidor()%></td>
      <td><%=factura.getFecha()%></td>
    </tr>
  </tbody>
</table>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Concepto</th>
      <th scope="col">Precio</th>
      <th scope="col">Unidad</th>
      
    </tr>
  </thead>


<%for(ItemFactura item : factura.getLstItem()) {%>

  <tbody>
    <tr>
      <td scope="row"><%=item.getDetalle()%></td>
      <td><%=item.getPrecioUnitario()%></td>
      <td><%=item.getUnidad()%></td>
    </tr>

<%} %>


  </tbody>
</table>




