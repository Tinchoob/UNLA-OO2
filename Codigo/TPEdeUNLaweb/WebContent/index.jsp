 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript" src='js/main.js'></script>

<title>Prueba bootstrap</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="css/main.css">


<!-- SCRIPTS JQUERY -->


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


<!-- FIN SCRIPTS JQUERY -->

</head>

<body>





<!-- navbar -->  
 <nav class="navbar navbar-expand-lg fixed-top ">  
 <a class="navbar-brand" href="#">Home</a>
<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">  
 <span class="navbar-toggler-icon"></span>
</button>
<div class="collapse navbar-collapse " id="navbarSupportedContent">     <ul class="navbar-nav mr-4">
 <li class="nav-item">
     <a class="nav-link" data-value="servicios" href="#">Servicios</a></li>  

</ul> 
</div></nav>




<header class="header">
	 <div class="overlay"></div>
	 <div class="container"> 
	 	<div class="description ">
   <h1>    EdeUNLA 
    <p>    Empresa lider en energía de la Universidad Nacional de Lanús. El café y las medialunas del buffet son carisimos igual.
</p></h1>  
</div>

	 </div>

</header>

<!-- SERVICIOS-->
<div class="servicios" id="servicios">
<div class="row">
   <div class="col-lg-4 col-md-4 col-sm-12">
    <img src="images/services.png" class="img-fluid">
   </div>

   <div class="col-lg-8 col-md-8 col-sm-12 desc">  
    <h3>Servicios</h3>
    <p>
       Ofrecemos una amplia variedad de servicios:

       <div class="listaServicios" id="listaServicios">
        <ul>
            <li><a class="itemLista" href="#"> Alta, Baja y Modificación de Clientes</a></li><br>
            <li> <a class="itemLista" href="#"> Generación de Facturas</a></li><br>
            <li> <a class="itemLista" href="#"> Reportes de sistema</a></li>
      </ul>

       </div>
    </p>
   </div>
  </div>
</div>



<!-- ALTA CLIENTE TEST -->

<!-- Contact form -->
<div class="altaCliente">
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
  </form>
 </div>
</div>
 
 <div class="col-lg-4 col-md-4 col-sm-12">
 <div class="col-lg-8 col-md-8 col-sm-12 right">
<div id="addclientefisico"></div>
</div>
</div>





</body>

</html> 



