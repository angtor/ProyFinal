<!DOCTYPE html PUBLIC "-//W3C//DTDXHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<html>
   <head>
	<title>
	Modificar información
	</title>
	
	
		<!-- Website CSS style -->
		<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
		<link href="CSS/bootstrap.min.css" rel="stylesheet">
		<link href="CSS/style.css" rel="stylesheet">
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
		
		<meta name="viewport" content="width=device-width, initial-scale=1" charset = "utf-8"/>
	
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<script src="js/listas.js" type="text/javascript"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
	
   </head>
   
   
	<!-- Barra de menú-->
   
   <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">LandryLibros</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      
      
      <ul class="nav navbar-nav navbar-right">
          <li><a href="#"><i class="fa fa-home" aria-hidden="true"></i></a></li>
		  <li><a href="Catálogo.html"><i class="fas fa-book" aria-hidden="true"></i></a></li>
        <li><a href="Carrito.html"><i class="fas fa-shopping-cart" aria-hidden="true"></i></a></li>
        <li class="active"><a href="Form perfil.html"><i class="fas fa-user" aria-hidden="true"></i></a></li>
		<li><a href="Reporte.html"><i class="fas fa-file-invoice" aria-hidden="true"></i></a></li>
        <li><a href="#"><i class="fas fa-truck" aria-hidden="true"></i></a></li>
        
		
        
        
        
      </ul>
    </div><!-- /.navbar-collapse -->
      </div><!-- /.container-collapse -->
  </nav>
  
  <body>
  <br><br><br>
<center>
<br><br>
<table> 
	
	</tr>

	
	<th>Nombre</th>
	<th>Apellido Paterno</th>
	<th>Apellido Materno</th>
	<th>Género</th>
	<th>Fecha de nacimiento</th>
	<th>Telefono</th>
	<th>Pais</th>
	<th>Estado</th>
	<th>Ciudad</th>
	<th>Colonia</th>
	<th>Calle</th>
	<th>Código postal</th>
	<th>Número exterior</th>
	<th>Número interior</th>
	<th>Usuario</th>
	<th>Contraseña</th>
	<th>Correo electrónico</th>
	<th>Telefono</th>
	<th>Géneros favoritos</th>
	
	<?php 
	include ("control/conexion.php");
	
	$consulta="SELECT * FROM usuarios";
	$result=mysqli_query($conexion,$consulta);
	
	while ($mostrar=mysqli_fetch_array($result)){
	
	?>
	
	<tr>
		
		<td align="center"> <?php echo $mostrar['Nombre'] ?> </td>
		<td align="center"> <?php echo $mostrar['ApellidoP'] ?> </td>
		<td align="center"> <?php echo $mostrar['ApellidoM'] ?> </td>
		<td align="center"> <?php echo $mostrar['Genero'] ?> </td>
		<td align="center"> <?php echo $mostrar['FNac'] ?> </td>
		<td align="center"> <?php echo $mostrar['Tel'] ?> </td>
		<td align="center"> <?php echo $mostrar['Pais'] ?> </td>
		<td align="center"> <?php echo $mostrar['Estado'] ?> </td>
		<td align="center"> <?php echo $mostrar['Ciudad'] ?> </td>
		<td align="center"> <?php echo $mostrar['Colonia'] ?> </td>
		<td align="center"> <?php echo $mostrar['Calle'] ?> </td>
		<td align="center"> <?php echo $mostrar['CP'] ?> </td>
		<td align="center"> <?php echo $mostrar['NExt'] ?> </td>
		<td align="center"> <?php echo $mostrar['NInt'] ?> </td>
		<td align="center"> <?php echo $mostrar['Usuario'] ?> </td>
		<td align="center"> <?php echo $mostrar['Contra'] ?> </td>
		<td align="center"> <?php echo $mostrar['Correo'] ?> </td>
		<td align="center"> <?php echo $mostrar['Tel'] ?> </td>
		<td align="center"> <?php echo $mostrar['GenFav'] ?> </td>
		
		
	</tr>

	<?php

	}
	?>
	
</table>
</center>
		
	<br> <br> <br>	
	<br> <br> <br>

	<A HREF = "http://localhost/9no/P%20individual/control/eliminar.php?Usuario=<?php echo $User?>&Contra=<?php echo $Pass?>"
	> <div align="center"> Deshabilitar cuenta </div>
	</A>	
		
		
	</BODY>
</HTML>