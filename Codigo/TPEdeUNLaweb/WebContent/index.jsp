 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript" src='js/main.js'></script>

<title>EdeUNLa - 2019</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="css/main.css">


<!-- SCRIPTS JQUERY -->


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
    <p>    
    Empresa lider en energía de la Universidad Nacional de Lanús.
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
            <li><a class="itemLista" href="/TPEdeUNLaweb/agregarCliente.jsp"> Alta de Clientes</a></li><br>
            <li><a class="itemLista" href="/TPEdeUNLaweb/modificarCliente.jsp"> Modificacion de Clientes</a></li><br>
            <li><a class="itemLista" href="/TPEdeUNLaweb/bajaCliente.jsp"> Baja de Clientes</a></li><br>
            <li> <a class="itemLista" href="/TPEdeUNLaweb/generarFactura.jsp"> Generación de Facturas</a></li><br>
            <li> <a class="itemLista" href="#"> Reportes de sistema</a></li>
      </ul>

       </div>
    </p>
   </div>
  </div>
</div>



</body>

</html> 



