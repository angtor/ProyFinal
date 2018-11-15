<?php
include ("conexion.php");


	$Usuario=$_GET['Usuario'];
	$Pass=$_GET['Contra'];
 
	$query="UPDATE usuarios SET activo='0'
								WHERE Usuario='$Usuario' and Contra='$Pass'";
	$resultado=$conexion -> query($query);
	
	if($resultado){
		header ("http://localhost/9no/P%20individual/Form%20perfil.html");
	}
	else {
		echo "Error al actualizar los datos. Por favor revise";		
	}
?>