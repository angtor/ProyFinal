<%-- 
    Document   : Login
    Created on : 1/11/2018, 10:27:41 PM
    Author     : win 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

    <?php
    include("control/conexion.php");
    ?>

    <head>
        <title>
            Iniciar sesión
        </title>
        <Meta charset = "iso-8859-1"/>

        <!-- Website CSS style -->
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css"/>
        <link href="CSS/bootstrap.min.css" rel="stylesheet"/>
        <link href="CSS/style.css" rel="stylesheet"/>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"/>

        <!-- Website Font style -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css"/>

        <!-- Google Fonts -->
        <link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'/>
        <link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'/>

        <meta name="viewport" content="width=device-width, initial-scale=1"/>

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
                    <li><a href="Catalogo.jsp"><i class="fas fa-book" aria-hidden="true"></i></a></li>
                    <li><a href="Carrito.jsp"><i class="fas fa-shopping-cart" aria-hidden="true"></i></a></li>
                    <li class="active"><a href="Form perfil.jsp"><i class="fas fa-user" aria-hidden="true"></i></a></li>
                    <li><a href="Reporte.jsp"><i class="fas fa-file-invoice" aria-hidden="true"></i></a></li>
                    <li><a href="#"><i class="fas fa-truck" aria-hidden="true"></i></a></li>


                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-collapse -->
    </nav>
    <body>

        <!-- Espacio de inicio-->
        <form action="Logon" method="POST">

            <div class="container">
                <div class="row main">
                    <div class="main-login main-center">

                        <b><i>
                                <h3>Cuenta existente</h3>
                        </b></i>
                        Usuario:
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-group fa" aria-hidden="true"></i></span>
                                <input type ="text" required="required" class="form-control" name="User" id = "User" placeholder="Usuario"/>
                            </div>
                        </div>
                        Contraseña:
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-group fa" aria-hidden="true"></i></span>
                                <input type ="password" required="required" class="form-control" name="Con" id = "Con" placeholder="Contraseña"/>
                            </div>
                        </div>
                        <BR>


                            <font color= "black">
                                <input font size = "20" type = "submit" value = "Iniciar sesión" name = "register"/>
                                <input font size = "14" type = "reset" />
                            </font>


                    </div>
                </div>
            </div>
        </form>
    </body>
</html>