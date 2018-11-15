<?php
include ("conexion.php");

	$Nombre=$_POST['Nombre'];
	$ApP=$_POST['AP'];
	$ApM=$_POST['AM'];
	$Gen=$_POST['Genero'];
	$FN=$_POST['bday'];
	$Tel=$_POST['Tel'];
	$Pais=$_POST['Pais'];
	$Estado=$_POST['Estado'];
	$City=$_POST['Ciudad'];
	$Col=$_POST['Col'];
	$Cal=$_POST['Cal'];
	$CP=$_POST['CP'];
	$NExt=$_POST['NExt'];
	$NInt=$_POST['NInt'];
	$Usuario=$_POST['User'];
	$Pass=$_POST['Con'];
	$Cor=$_POST['Correo'];
	$Libros=$_POST['Check'];
 
	$query="UPDATE usuarios SET Nombre='$Nombre',ApellidoP='$ApP',ApellidoM='$ApM',
								Genero='$Gen',FNac='$FN',Tel='$Tel',
								Pais='$Pais',Estado='$Estado',Ciudad='$City',
								Colonia='$Col',Calle='$Cal',CP='$CP',
								NExt='$NExt', NInt='$NInt',
								Usuario='$Usuario',Contra='$Pass',Correo='$Cor',
								GenFav='$Libros'
								WHERE Usuario='$Usuario' and Contra='$Pass'";
	$resultado=$conexion -> query($query);
	
	if($resultado){
		header ("location: http://localhost/9no/P%20individual/datos_usuario.php?Usuario=$Usuario&Contra=$Pass");
	}
	else {
		echo "Error al actualizar los datos. Por favor revise";		
	}
?>