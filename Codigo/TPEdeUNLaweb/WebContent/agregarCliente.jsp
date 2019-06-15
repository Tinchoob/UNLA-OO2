<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript" src='js/main.js'></script>

<title>Agregar Cliente</title>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/main.css">

<!-- AGREGAR FISICO!! -->
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

<!-- AGREGAR JURIDICO -->
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
				$("#addclienteJuridico").html(data);
			})
		});
	});
</script>


</head>
<body>

<header class="backgroundContainer">

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




<!-- ALTA CLIENTE TEST -->
<div class="altaCliente">
<div class="titleContainer">
<div class="d-flex justify-content-center">
<h1>Alta de Clientes</h1>
</div>
</div>

 <div class="container">
  <form>
   <div class="row">
    <div class="col-lg-4 col-md-4 col-sm-12">
      <h1>Agregar Cliente Físico</h1> 
    </div>
    <div class="col-lg-8 col-md-8 col-sm-12 right">
       <div class="form-group">
         <input type="text" class="form-control form-control-lg" placeholder="Numero de Cliente" id="nroCliente">
         <input type="text" class="form-control form-control-lg" placeholder="Apellido" id="apellido">
         <input type="text" class="form-control form-control-lg" placeholder="Nombre" id="nombre">
         <input type="text" class="form-control form-control-lg" placeholder="DNI" id="dni">
       <INPUT id="agregarFisico" type="button" class="btn btn-secondary btn-block"
					value="Agregar" />
    </div>
   </div>
   </div>
  </form>
 </div>
</div>


<div class="d-flex justify-content-center">
<div id="addclientefisico"></div>
</div>


<!-- ALTA CLIENTE TEST -->
<div class="altaCliente">
 <div class="container">
  <form>
   <div class="row">
    <div class="col-lg-4 col-md-4 col-sm-12">
      <h1>Agregar Cliente Jurídico</h1> 
    </div>
    <div class="col-lg-8 col-md-8 col-sm-12 right">
       <div class="form-group">
         <input type="text" class="form-control form-control-lg" placeholder="Numero de Cliente" id="nroClienteJ">
         <input type="text" class="form-control form-control-lg" placeholder="Razon Social" id="razonSocial">
         <input type="text" class="form-control form-control-lg" placeholder="CUIT" id="cuit">
       <INPUT id="agregarJuridico" type="button" class="btn btn-secondary btn-block"
					value="Agregar" />
    </div>
   </div>
   </div>
  </form>
 </div>
</div>


<div class="d-flex justify-content-center">
<div id="addclienteJuridico"></div>
</div>

</header>


</body>
</html>