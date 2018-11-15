<%-- 
    Document   : Catálogo
    Created on : 21/10/2018, 03:35:57 PM
    Author     : win 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

    <?php
    require_once("control/conexion.php");
    ?>

    <head>
        <title>
            Catálogo de libros
        </title>

        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
            <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
            <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
            <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
            <link href="CSS/style.css" rel="stylesheet">
                <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"></script>

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

                            <ul class="nav navbar-nav navbar-center">
                                <br/>
                                    <input id="buscar" class = "srchTxt" type ="text" placeholder="Buscar"> 
                                        </ul>
                                        <!-- Collect the nav links, forms, and other content for toggling -->
                                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">


                                            <ul class="nav navbar-nav navbar-right">
                                                <li><a href="#"><i class="fa fa-home" aria-hidden="true"></i></a></li>
                                                <li class="active"><a href="/WebIndividual/Admin/Catálogo.jsp"><i class="fas fa-book" aria-hidden="true"></i></a></li>
                                                <li><a href="/WebIndividual/Admin/Carrito.jsp"><i class="fas fa-shopping-cart" aria-hidden="true"></i></a></li>
                                                <li><a href="/WebIndividual/Admin/Form perfil.jsp"><i class="fas fa-user" aria-hidden="true"></i></a></li>
                                                <li><a href="/WebIndividual/Admin/Reporte.jsp"><i class="fas fa-file-invoice" aria-hidden="true"></i></a></li>
                                                <li><a href="#"><i class="fas fa-truck" aria-hidden="true"></i></a></li>




                                            </ul>
                                        </div><!-- /.navbar-collapse -->
                        </div><!-- /.container-collapse -->
                                        </nav>
                                        <!-- Espacio de inicio-->

                                        <br/><br/><br/><br/>
                                        <body>
                                            <!-- Productos más vendidos -->
                                            <div class="container">
                                                <div class="row">
                                                    <h2>Productos más comprados</h2>
                                                </div>
                                                <div class="row">
                                                    <div class='col-md-8'>
                                                        <div class="carousel slide media-carousel" id="media">
                                                            <div class="carousel-inner">
                                                                <div class="item  active">
                                                                    <div class="row">
                                                                        <div class="col-md-4">
                                                                            <div class = "thumbnail">
                                                                                <a href = "#"><img src = "img/El principito.jpg" alt = "Compra más" style = "width:150px; height:225px;"></a>
                                                                                <div class = "caption">
                                                                                    <h5>El principito</h5>
                                                                                    <h4><a class = "btn" href = "#"> Ver</a>
                                                                                        <span class = "pull-right">$200</span>
                                                                                    </h4>
                                                                                </div>
                                                                            </div>
                                                                        </div>

                                                                        <div class = "col-md-4">
                                                                            <div class = "thumbnail">
                                                                                <a href = "#"><img src = "img/Digital Image Processing.jpg" alt = "Compra más" style = "width:150px; height:225px;">
                                                                                </a>
                                                                                <div class = "caption">
                                                                                    <h5>Digital Image Processing</h5>
                                                                                    <h4><a class = "btn" href = "#"> Ver</a>
                                                                                        <span class = "pull-right">$250</span>
                                                                                    </h4>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <div class = "col-md-4">
                                                                            <div class = "thumbnail">
                                                                                <a href = "#"><img src = "img/Alicia en el pais de las maravillas.jpg" alt = "Compra más" style = "width:150px; height:225px;">
                                                                                </a>
                                                                                <div class = "caption">
                                                                                    <h5>Alicia en el pais de las maravillas</h5>
                                                                                    <h4><a class = "btn" href = "#"> Ver</a>
                                                                                        <span class = "pull-right">$250</span>
                                                                                    </h4>
                                                                                </div>
                                                                            </div>
                                                                        </div>

                                                                    </div>
                                                                </div>
                                                                <div class = "item">
                                                                    <div class = "row">
                                                                        <div class = "col-md-4">
                                                                            <div class = "thumbnail">

                                                                                <a href = "#"><img src = "img/El senor de los anillos.jpg" alt = "Compra más" style = "width:150px; height:225px;">
                                                                                </a>
                                                                                <div class = "caption">
                                                                                    <h5>El senor de los anillos</h5>
                                                                                    <h4><a class = "btn" href = "#"> Ver</a>
                                                                                        <span class = "pull-right">$250</span>
                                                                                    </h4>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <div class = "col-md-4">
                                                                            <div class = "thumbnail">

                                                                                <a href = "#"><img src = "img/Historia de dos ciudades.jpg" alt = "Compra más" style = "width:150px; height:225px;">
                                                                                </a>
                                                                                <div class = "caption">
                                                                                    <h5>Historia de dos ciudades</h5>
                                                                                    <h4><a class = "btn" href = "#"> Ver</a>
                                                                                        <span class = "pull-right">$250</span>
                                                                                    </h4>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <a data-slide="prev" href="#media" class="left carousel-control">‹</a>
                                                        <a data-slide="next" href="#media" class="right carousel-control">›</a>
                                                    </div>
                                                </div>
                                            </div>
                                            </div>


                                            <br><br><br>
                                                        <!--Catálogo de libros -->
                                                        <form>
                                                            <div class="container">
                                                                <div class="row">
                                                                    <!-- BEGIN PRODUCTS -->
                                                                    <div class="col-md-3 col-sm-6">
                                                                        <span class="thumbnail">
                                                                            <img src="http://placehold.it/500x400" alt="...">
                                                                                <h4>Título del libro</h4>

                                                                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
                                                                                <hr class="line">
                                                                                    <div class="row">
                                                                                        <div class="col-md-6 col-sm-6">
                                                                                            <p class="price">$29,90</p>
                                                                                        </div>
                                                                                        <div class="col-md-6 col-sm-6">
                                                                                            <button class="btn btn-success right" > Agregar a carrito</button>
                                                                                        </div>

                                                                                    </div>
                                                                                    </span>
                                                                                    </div>
                                                                                    <div class="col-md-3 col-sm-6">
                                                                                        <span class="thumbnail">
                                                                                            <img src="http://placehold.it/500x400" alt="...">
                                                                                                <h4>Título del libro</h4>

                                                                                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
                                                                                                <hr class="line">
                                                                                                    <div class="row">
                                                                                                        <div class="col-md-6 col-sm-6">
                                                                                                            <p class="price">$29,90</p>
                                                                                                        </div>
                                                                                                        <div class="col-md-6 col-sm-6">
                                                                                                            <button class="btn btn-success right" > Agregar a carrito</button>
                                                                                                        </div>

                                                                                                    </div>
                                                                                                    </span>
                                                                                                    </div>
                                                                                                    <div class="col-md-3 col-sm-6">
                                                                                                        <span class="thumbnail">
                                                                                                            <img src="http://placehold.it/500x400" alt="...">
                                                                                                                <h4>Título del libro</h4>

                                                                                                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
                                                                                                                <hr class="line">
                                                                                                                    <div class="row">
                                                                                                                        <div class="col-md-6 col-sm-6">
                                                                                                                            <p class="price">$29,90</p>
                                                                                                                        </div>
                                                                                                                        <div class="col-md-6 col-sm-6">
                                                                                                                            <button class="btn btn-success right" > Agregar a carrito</button>
                                                                                                                        </div>

                                                                                                                    </div>
                                                                                                                    </span>
                                                                                                                    </div>
                                                                                                                    <div class="col-md-3 col-sm-6">
                                                                                                                        <span class="thumbnail">
                                                                                                                            <img src="http://placehold.it/500x400" alt="...">
                                                                                                                                <h4>Título del libro</h4>
                                                                                                                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
                                                                                                                                <div class="row">
                                                                                                                                    <div class="col-md-6 col-sm-6">
                                                                                                                                        <p class="price">$29,90</p>
                                                                                                                                    </div>
                                                                                                                                    <div class="col-md-6 col-sm-6">
                                                                                                                                        <button class="btn btn-success right" > Agregar a carrito</button>
                                                                                                                                    </div>

                                                                                                                                </div>
                                                                                                                        </span>
                                                                                                                    </div>
                                                                                                                    <!-- END PRODUCTS -->
                </div>
            </div>
        </form>
    </body>
</html>