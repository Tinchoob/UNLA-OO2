<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<TITLE>Sistema Francés - Cliente</TITLE>
<script src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#consultar').click(function() {
			var dni = $('#dni').val();
			$.ajax({
				method : "POST",
				url : "MostrarClienteJSP",
				data : {
					dni : dni
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
					<label for="dni">DNI:</label> <INPUT id="dni" name="dni">
				</div>
				<INPUT id="consultar" type="button" class="btn btn-success"
					value="Consultar" />
			</form>
		</div>
		<BR>
		<BR>

		<div class="container">
			<div id="responsecliente"></div>
			<div id="cuotasavencer">
				<TABLE border="0">
					<TR>
						<TD><INPUT id="btncuotasavencer" type="button"
							class="btn btn-success" value="Mostrar cuotas a vencer">
						</TD>

					</TR>
				</TABLE>
				<div id="divcuotasavencer"></div>
			</div>
			<TABLE border="0">
				<TR>
					<TD><INPUT id="listarPrestamos" class="btn btn-success"
						type="button" value="Mostrar prestamos"></TD>
				</TR>
			</TABLE>
			<div id="divlistarPrestamos"></div>
		</div>
	</div>
</BODY>



</HTML>