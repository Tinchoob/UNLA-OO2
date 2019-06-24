<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript" src='js/main.js'></script>

<title>Generar Factura</title>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/main.css">

<!-- AGREGAR FISICO!! -->
<script type="text/javascript">
	$(document).ready(function() {
		$('#generarFactura').click(function() {
			var cliente = $('#cliente').val();
			var mes = $('#mes').val();
			var anio = $('#anio').val();
			var nroMedidor = $('#nroMedidor').val();
			$.ajax({
				method : "POST",
				url : "GenerarFactura",
				data : {
					cliente : cliente,
					mes : mes,
					anio : anio,
					nroMedidor : nroMedidor
				},
				async : false
			}).done(function(data) {
				$("#mostrarFactura").html(data);
			})
		});
	});
	
	function alertaFactura(){
		alert("Carballo viejo puto!!");
		}
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
 <div class="container">
  <form>
   <div class="row">
    <div class="col-lg-4 col-md-4 col-sm-12">
      <h1>Generar Factura</h1> 
    </div>
    <div class="col-lg-8 col-md-8 col-sm-12 right">
       <div class="form-group">
         <input type="text" class="form-control form-control-lg" placeholder="Cliente" id="cliente">
         <input type="text" class="form-control form-control-lg" placeholder="Mes" id="mes">
         <input type="text" class="form-control form-control-lg" placeholder="Año" id="anio">
         <input type="text" class="form-control form-control-lg" placeholder="Numero Medidor" id="nroMedidor">
       <INPUT id="generarFactura" type="button" class="btn btn-secondary btn-block"
					value="Generar" />
					
    </div>
   </div>
   </div>
  </form>
 </div>
</div>

<div class="d-flex justify-content-center">
<div id="mostrarFactura"></div>
</div>


<!-- aca va el de generar factura alta y el div para mostrar la factura-->


<!--  -->


</header>

</body>
</html>