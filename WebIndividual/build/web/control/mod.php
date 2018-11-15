<?php
include ("conexion.php");

	$Password=$_POST['Con'];
	$Usuario=$_POST['User'];
 
	$query="select Usuario, Contra, Tipo from usuarios where Usuario = '$Usuario' and Contra = '$Password';";
	$resultado=$conexion -> query($query);
	
	if($tipo=mysqli_fetch_array($resultado)){
	$tipo['Tipo'];
	}
	if($resultado){
		if ($tipo['Tipo'] == "A"){
			header ("location: http://localhost/9no/P%20individual/ModUsuario.php?Usuario=$Usuario&Contra=$Password");
		} elseif ($tipo['Tipo'] == "C"){
			header ("location: http://localhost/9no/P%20individual/datos_usuario.php?Usuario=$Usuario&Contra='$Password'");
		} else {
			echo mysqli_error($conexion);
		}
	}
	else {
		echo mysqli_error($conexion);
	}
	

?>