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

	if(empty($NInt)){
		$NInt = $NInt ?: 0;
	}
	
	$query="INSERT INTO usuarios(Nombre, ApellidoP, ApellidoM,
	Genero, FNac, Tel, Pais, Estado, Ciudad, Colonia, Calle, CP, NExt, NInt,
	Usuario, Contra, Tipo, Correo, GenFav, activo)
	VALUES ('$Nombre','$ApP','$ApM','$Gen','$FN', $Tel,
	'$Pais', '$Estado', '$City','$Col', '$Cal', '$CP', '$NExt',
	'$NInt', '$Usuario', '$Pass', 'C', '$Cor', '$Libros', '1')";
	$resultado=$conexion -> query($query);
	
	if($resultado){
		header ("location: http://localhost/9no/P%20individual/datos_usuario.php?Usuario=$Usuario&Contra=$Pass");
	}
	else {
		echo "error insercion";
		echo "" . mysqli_error($conexion) . "<br><br>";
	}

?>