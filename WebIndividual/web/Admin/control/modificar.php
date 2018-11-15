<html>
<HEAD>

	<TITLE></TITLE>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
		<script type="text/javascript" src="js/jquery-3.3.1.min"></script>
		<script src="js/listas.js" type="text/javascript"></script>
		<meta charset="utf-8">


	<?php 
	include ("conexion.php");
	$No=$_REQUEST['No'];
	
	$consulta="SELECT * FROM usuario WHERE No='$No'";
	$result=mysqli_query($conexion,$consulta);
	
	$mostrar=mysqli_fetch_array($result);
	
	?>

<center>

<form action = "actualizar_user.php?No=<?php echo $mostrar['No']; ?>" method = "post">

	
<div class="form-row">
    <div class="col-md-4 mb-3"> <!- nombre ->
      <label for="validationCustom01">Nombre</label> 
      <input type="text" class="form-control" required name="Nombre" placeholder="Nombre" value="<?php echo $mostrar['Nombre'];?>" required>
      <div class="valid-feedback">
        Válido
      </div>
      <br>
    </div>
    <br>

    <div class="col-md-4 mb-3"> <!- ape ->
      <label for="validationCustom02">Apellido</label> 
      <input type="text" class="form-control" required name="Apellido" placeholder="Apellido" value="<?php echo $mostrar['Apellido'];?>" required>
      <div class="valid-feedback">
        Válido
      </div>
    </div>

    <br>
    <div class="col-md-4 mb-3"> <!- user ->
      <label for="validationCustomUsername">Usuario</label> 
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text" id="inputGroupPrepend">@</span>
        </div>
        <input type="text" class="form-control" required name="Usuario" placeholder="Usuario" aria-describedby="inputGroupPrepend" value="<?php echo $mostrar['Usuario'];?>" required>
        <div class="invalid-feedback">
          Nombre de usuario no válido
        </div>
      </div>
    </div>
    <br>

    <div class="col-md-4 mb-3"> <!- bd ->
      <label for="validationCustom02"> Fecha nacimiento </label> 
      <input type="date" class="form-control" required name="Fecha_nacimiento" placeholder="DD/MM/AAAA" 
      value="<?php echo $mostrar['Fecha_nacimiento'];?>" required>
      <div class="valid-feedback">
        Válido
      </div>
    </div>


    <div class="col-md-4 mb-3"> <!- psw ->
      <label for="inputPassword4">Contraseña</label>
      <input type="password" class="form-control" required name="Pass" placeholder="Pass" value="<?php echo $mostrar['Pass'];?>">
    </div>
<!--

 	<div class="col-md-4 mb-3"> <!- check psw ->
      <label for="inputPassword4">Confirmar contraseña</label>
      <input type="password" class="form-control" required name="Pass2" placeholder="Pass2" value="">
    </div>-->
  
    <br>
</div>



<!-Ubicacion->
<center> <h1> Datos ubicación </h1> </center> 
    <br>  

<form>
        <table>
        
        <td style="text-align: left;">Pais</td>
        <td style="text-align: left;">
            <select name="Pais" id="Pais" required name="Pais" onchange="setStates();">
            <option value="Alemania">Alemania</option>
              <option value="Canada">Canada</option>
              <option value="Estados Unidos">Estados Unidos</option>
			  <option value="Mexico">México</option>
            </select>
        </td>
        
        <td style="text-align: left;">Estado</td>
        <td style="text-align: left;">
            <select name="Estado" id="Estado" required name="Estado" onchange="setCities();">
              <option value="">Please select a Country</option>
            </select>
        </td>
        
        <td style="text-align: left;">Ciudad</td>
        <td style="text-align: left;">
            <select name="Ciudad"  id="Ciudad" required name="Ciudad">
              <option value="">Please select a Country</option>
            </select>
        </td>
        
        </table>
    </form>




<!-Direccion->
<center> <h1> Detalles de envio </h1> </center> 
    <br>  

<div class="form-row">
    <div class="col-md-4 mb-3"> <!- calle ->
      <label for="validationCustom02"> Calle </label> 
      <input type="text" class="form-control" required name="Calle" placeholder="Calle" 
      		value="<?php echo $mostrar['Calle'];?>" required>
      <div class="valid-feedback">
        Válido
      </div>
    </div>

  	 <div class="col-md-4 mb-3"> <!- interior ->
      <label for="validationCustom02"> No. interior </label> 
      <input type="int" class="form-control" required name="Interior" placeholder="Interior" 
      		value="<?php echo $mostrar['Interior'];?>" required>
      <div class="valid-feedback">
        Válido
      </div>
    </div>

  	 <div class="col-md-4 mb-3"> <!- exterior ->
      <label for="validationCustom02"> No. exterior </label> 
      <input type="int" class="form-control" required name="Exterior" placeholder="Exterior" 
      	value="<?php echo $mostrar['Exterior'];?>" required>
      <div class="valid-feedback">
        Válido
      </div>
    </div>

     <div class="col-md-4 mb-3"> <!- colonia ->
      <label for="validationCustom02"> Colonia </label> 
      <input type="text" class="form-control" required name="Colonia" placeholder="Colonia" 
      		value="<?php echo $mostrar['Colonia'];?>" required>
      <div class="valid-feedback">
        Válido
      </div>
    </div>

    <div class="col-md-4 mb-3"> <!- cp ->
      <label for="validationCustom02"> Codigo postal </label> 
      <input type="int" class="form-control" required name="Cp" placeholder="Cp" 
      value="<?php echo $mostrar['Cp'];?>" required>
      <div class="valid-feedback">
        Válido
      </div>
    </div>

    <div class="col-md-4 mb-3"> <!- tel ->
      <label for="validationCustom02"> Telefono </label> 
      <input type="bigint" class="form-control" required name="Telefono" placeholder="Telefono" 
      		value="<?php echo $mostrar['Telefono'];?>" required>
      <div class="valid-feedback">
        Válido
      </div>
    </div>

 </div>
 <br>

  <button class="btn btn-primary" type="submit">Guardar cambios</button>

</form>
</form> <!-Fin todo formulario->

<script>
// Example starter JavaScript for disabling form submissions if there are invalid fields
(function() {
  'use strict';
  window.addEventListener('load', function() {
    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    var forms = document.getElementsByClassName('needs-validation');
    // Loop over them and prevent submission
    var validation = Array.prototype.filter.call(forms, function(form) {
      form.addEventListener('submit', function(event) {
        if (form.checkValidity() === false) {
          event.preventDefault();
          event.stopPropagation();
        }
        form.classList.add('was-validated');
      }, false);
    });
  }, false);
})();
</script>

	</center>


</form>
</center>
	</BODY>
</HTML>