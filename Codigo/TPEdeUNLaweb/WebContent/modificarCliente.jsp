<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript" src='js/main.js'></script>

<title>Modificar Cliente</title>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/main.css">

<!-- modificar cliente fisico -->
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

<script type="text/javascript">
	$(document).ready(function() {
		$('#actualizarJuridico').click(function() {
			var nroCliente = $('#nroClienteAJ').val();
			var razonSocial = $('#razonSocialNew').val();
			var cuit = $('#cuitNew').val();
			
			$.ajax({
				method : "POST",
				url : "ActualizarJuridico",
				data : {
					nroCliente : nroCliente,
					razonSocial : razonSocial,
					cuit : cuit
				},
				async : false
			}).done(function(data) {
				$("#juridicoActualizado").html(data);
			})
		});
	});
</script>


</head>
<body>



<!-- navbar -->  
 <nav class="navbar navbar-expand-lg fixed-top ">  
 <a class="navbar-brand" href="/TPEdeUNLaweb/index.jsp">Home</a>
<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">  
 <span class="navbar-toggler-icon"></span>
</button>
<div class="collapse navbar-collapse " id="navbarSupportedContent">     <ul class="navbar-nav mr-4">
 <li class="nav-item">
     <a class="nav-link" data-value="servicios" href="/TPEdeUNLaweb/index.jsp">Volver</a></li>  
</ul> 
</div></nav>

<header class="backgroundContainer">


<!-- MODIFICAR CLIENTE-->
<div class="altaCliente">
<div class="d-flex justify-content-center">
<h1>Actualización de Clientes</h1>
</div>
 <div class="container">
  <form>
   <div class="row">
    <div class="col-lg-4 col-md-4 col-sm-12">
      <h1>Actualizar Cliente Físico</h1> 
    </div>
    <div class="col-lg-8 col-md-8 col-sm-12 right">
       <div class="form-group">
         <input type="text" class="form-control form-control-lg" placeholder="Numero de Cliente" id="nroClienteAF">
         <input type="text" class="form-control form-control-lg" placeholder="Apellido" id="apellidoNew">
         <input type="text" class="form-control form-control-lg" placeholder="Nombre" id="nombreNew">
       <INPUT id="actualizarFisico" type="button" class="btn btn-secondary btn-block"
					value="Modificar" />
    </div>
   </div>
   </div>
  </form>
 </div>
</div>

<div class="d-flex justify-content-center">
<div id="fisicoActualizado"></div>
</div>


<!-- MODIFICAR CLIENTE-->
<div class="altaCliente">
 <div class="container">
  <form>
   <div class="row">
    <div class="col-lg-4 col-md-4 col-sm-12">
      <h1>Actualizar Cliente Juridico</h1> 
    </div>
    <div class="col-lg-8 col-md-8 col-sm-12 right">
       <div class="form-group">
         <input type="text" class="form-control form-control-lg" placeholder="Numero de Cliente" id="nroClienteAJ">
         <input type="text" class="form-control form-control-lg" placeholder="Razon Social" id="razonSocialNew">
         <input type="text" class="form-control form-control-lg" placeholder="CUIT" id="cuitNew">
       <INPUT id="actualizarJuridico" type="button" class="btn btn-secondary btn-block"
					value="Modificar" />
    </div>
   </div>
   </div>
  </form>
 </div>
</div>

<div class="d-flex justify-content-center">
<div id="juridicoActualizado"></div>
</div>

</header>

</body>
</html>