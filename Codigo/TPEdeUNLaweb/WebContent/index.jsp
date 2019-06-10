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
			var nroCliente = $('#nroCliente').val();
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

</HEAD>

<BODY>
	<%@ include file="/cabecera.jsp"%>
	<div class="jumbotron">
		<div class="container">
			<h1>Búsqueda de clientes</h1>
			<form class="navbar-form navbar-right">
				<div class="form-group">
					<label for="nroCliente">Numero de Cliente:</label> <INPUT id="nroCliente" name="nroCliente">
				</div>
				<INPUT id="consultar" type="button" class="btn btn-success"
					value="Consultar" />
			</form>
		</div>
		
		<div id="responsecliente"></div>
		<BR>
		<BR>
	</div>
</BODY>



</HTML>