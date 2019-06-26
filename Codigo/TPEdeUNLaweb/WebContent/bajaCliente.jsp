<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript" src='js/main.js'></script>

<title>Baja de Cliente</title>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/main.css">

<!--  SCRIPT DE BAJA DE CLIENTE -->
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

<div class="altaCliente">
<div class="d-flex justify-content-center">
<h1>Baja de Clientes</h1>
</div>
<br>
 <div class="container">
  <form>
   <div class="row">
   
    <div class="col-lg-4 col-md-4 col-sm-12">
      <h1>Baja de Cliente</h1> 
    </div>
    <div class="col-lg-8 col-md-8 col-sm-12 right">
       <div class="form-group">
         <input type="text" class="form-control form-control-lg" placeholder="Numero de Cliente" id="nroClienteBaja">
       <INPUT id="eliminarCliente" type="button" class="btn btn-secondary btn-block"
					value="Eliminar" />
    </div>
   </div>
   </div>
  </form>
 </div>
</div>



<div class="d-flex justify-content-center">
<div id="bajacliente"></div>
</div>


</header>


</body>
</html>