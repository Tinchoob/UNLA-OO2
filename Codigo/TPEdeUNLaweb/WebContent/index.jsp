<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<TITLE>TPEdeUNLa - Traer Cliente</TITLE>
<script src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#consultar').click(function() {
			var nroCliente = $('#nroCliente1').val();
			$.ajax({
				method : "POST",
				url : "MostrarClienteJSP",
				data : {
					nroCliente : nroCliente
				},
				async : false
			}).done(function(data) {
				$("#responsecliente").html(data);
			})
		});
	});
</script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#agregar').click(function() {
			var nroCliente = $('#nroCliente').val();
			var apellido = $('#apellido').val();
			var nombre = $('#nombre').val();
			var dni = $('#dni').val();
			$.ajax({
				method : "POST",
				url : "AgregarCliente",
				data : {
					nroCliente : nroCliente,
					apellido : apellido,
					nombre : nombre,
					dni : dni
				},
				async : false
			}).done(function(data) {
				$("#addclientefisico").html(data);
			})
		});
	});
</script>

</HEAD>

<BODY>
	<%@ include file="/cabecera.jsp"%>
	<div class="jumbotron">
		<div class="container">
			<h1>Búsqueda de clientes</h1>
			<form class="navbar-form navbar-right">
				<div class="form-group">
					<label for="nroCliente">Numero de Cliente:</label> <INPUT id="nroCliente1" name="nroCliente1">
				</div>
				<INPUT id="consultar" type="button" class="btn btn-success"
					value="Consultar" />
			</form>
		</div>
		<div id="responsecliente"></div>
		<BR>
		<BR>
	</div>
	
	<div class="jumbotron">
		<div class="container">
			<h1>Agregar Cliente Fisico</h1>
			<form class="navbar-form navbar-right">
				<div class="form-group">
					<label for="nroCliente">Numero de Cliente: </label> <INPUT id="nroCliente" name="nroCliente"><BR><BR>
					<label for="apellido">Apellido: </label> <INPUT id="apellido" name="apellido"><BR><BR>
					<label for="nombre">Nombre: </label> <INPUT id="nombre" name="nombre"><BR><BR>
					<label for="dni">DNI: </label> <INPUT id="dni" name="dni"><BR><BR>
				</div>
				<INPUT id="agregar" type="button" class="btn btn-success"
					value="Agregar" />
			</form>
		</div>
		<div id="addclientefisico"></div>
		<BR>
		<BR>
	</div>
	
	
	
</BODY>



</HTML>