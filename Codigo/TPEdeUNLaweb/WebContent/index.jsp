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
		$('#agregarFisico').click(function() {
			var nroCliente = $('#nroCliente').val();
			var apellido = $('#apellido').val();
			var nombre = $('#nombre').val();
			var dni = $('#dni').val();
			$.ajax({
				method : "POST",
				url : "AgregarClienteFisico",
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

<script type="text/javascript">
	$(document).ready(function() {
		$('#agregarJuridico').click(function() {
			var nroCliente = $('#nroClienteJ').val();
			var razonSocial = $('#razonSocial').val();
			var cuit = $('#cuit').val();
			$.ajax({
				method : "POST",
				url : "AgregarClienteJuridico",
				data : {
					nroCliente : nroCliente,
					razonSocial : razonSocial,
					cuit : cuit
				},
				async : false
			}).done(function(data) {
				$("#addclientejuridico").html(data);
			})
		});
	});
</script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#eliminarCliente').click(function() {
			var nroCliente = $('#nroClienteBaja').val();
			$.ajax({
				method : "POST",
				url : "BajaCliente",
				data : {
					nroCliente : nroCliente
				},
				async : false
			}).done(function(data) {
				$("#bajacliente").html(data);
			})
		});
	});
</script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#actualizarFisico').click(function() {
			var nroCliente = $('#nroClienteAF').val();
			var nombre = $('#nombreNew').val();
			var apellido = $('#apellidoNew').val();
			
			$.ajax({
				method : "POST",
				url : "ActualizarFisico",
				data : {
					nroCliente : nroCliente,
					nombre : nombre,
					apellido : apellido
				},
				async : false
			}).done(function(data) {
				$("#fisicoActualizado").html(data);
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
			<h1>Agregar Cliente Físico</h1>
			<form class="navbar-form navbar-right">
				<div class="form-group">
					<label for="nroCliente">Numero de Cliente: </label> <INPUT id="nroCliente" name="nroCliente"><BR><BR>
					<label for="apellido">Apellido: </label> <INPUT id="apellido" name="apellido"><BR><BR>
					<label for="nombre">Nombre: </label> <INPUT id="nombre" name="nombre"><BR><BR>
					<label for="dni">DNI: </label> <INPUT id="dni" name="dni"><BR><BR>
				</div>
				<INPUT id="agregarFisico" type="button" class="btn btn-success"
					value="Agregar" />
			</form>
		</div>
		<div id="addclientefisico"></div>
		<BR>
		<BR>
	</div>
	
	<div class="jumbotron">
		<div class="container">
			<h1>Actualizar Cliente Físico</h1>
			<form class="navbar-form navbar-right">
				<div class="form-group">
					<label for="nroCliente">Numero de Cliente: </label> <INPUT id="nroClienteAF" name="nroClienteAF"><BR><BR>
					<label for="apellido">Nuevo Apellido: </label> <INPUT id="apellidoNew" name="apellidoNew"><BR><BR>
					<label for="nombre">Nuevo Nombre: </label> <INPUT id="nombreNew" name="nombreNew"><BR><BR>
				</div>
				<INPUT id="actualizarFisico" type="button" class="btn btn-success"
					value="Actualizar" />
			</form>
		</div>
		<div id="fisicoActualizado"></div>
		<BR>
		<BR>
	</div>
	
	
	
	<div class="jumbotron">
		<div class="container">
			<h1>Agregar Cliente Jurídico</h1>
			<form class="navbar-form navbar-right">
				<div class="form-group">
				<label for="nroClienteJ">Numero de Cliente: </label> <INPUT id="nroClienteJ" name="nroClienteJ"><BR><BR>
					<label for="razonSocial">Razón Social: </label> <INPUT id="razonSocial" name="razonSocial"><BR><BR>
					<label for="cuit">CUIT: </label> <INPUT id="cuit" name="cuit"><BR><BR>
				</div>
				<INPUT id="agregarJuridico" type="button" class="btn btn-success"
					value="Agregar" />
			</form>
		</div>
		<div id="addclientejuridico"></div>
		<BR>
		<BR>
	</div>
	
	<div class="jumbotron">
		<div class="container">
			<h1>Baja de Cliente</h1>
			<form class="navbar-form navbar-right">
				<div class="form-group">
					<label for="nroClienteBaja">Numero de Cliente: </label> <INPUT id="nroClienteBaja" name="nroClienteBaja"><BR><BR>
				</div>
				<INPUT id="eliminarCliente" type="button" class="btn btn-success"
					value="Eliminar" />
			</form>
		</div>
		<div id="bajacliente"></div>
		<BR>
		<BR>
	</div>
	
	
	
</BODY>



</HTML>