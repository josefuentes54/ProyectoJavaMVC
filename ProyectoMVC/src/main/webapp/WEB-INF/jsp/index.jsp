<%--
    Document   : index.jsp
    Created on : 25-05-2023, 21:26:16
    Author     : josef
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pet Valpo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="<c:url value="/resources/css/style.css"/>">

</head>

<body>
    <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <div class="container-fluid">
                <a class="navbar-brand" href="index.htm">Pet Valpo</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link" href="quienes_somos" >Quienes Somos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="contacto">Contacto</a>
                        </li>
                    </ul>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <button class="btn btn-warning" type="button" data-bs-toggle="modal" data-bs-target="#loginModal">Iniciar Sesión</button>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
 
    <div class="container-fluid text-center">
    <h1 class="display-4"><strong>PET VALPO</strong></h1>

    <p class="lead">Aquí puedes encontrar todo lo relacionado con mascotas en Valparaíso.</p>
    <p class="lead">Pet Valpo es una reconocida veterinaria en la ciudad de Valparaíso. Nos dedicamos a brindar atención de calidad a tus mascotas y ofrecemos una amplia gama de servicios veterinarios, incluyendo consultas, vacunas, cirugías y más. Nuestro equipo de veterinarios altamente capacitados y amantes de los animales está comprometido con el bienestar y la salud de tus mascotas. Ven y visítanos para recibir el mejor cuidado veterinario para tu compañero peludo.</p>
</div>

<div class="container-fluid text-center mt-3">
    <img src="https://cdn.shopify.com/s/files/1/0283/1925/2585/files/banner-veterinaria.png?v=1598378431" alt="Descripción de la imagen" class="img-fluid">
</div>
    <br>
    
 <footer class="bg-primary text-center text-lg-start text-white fixed-bottom">
     <div class="text-center p-3" style="background-color: #0D6EFD">
        Derechos de autor © 2023: <a class="text-white">Jose Ignacio Fuentes</a>
    </div>
</footer>

</div>
    <div class="modal fade" id="loginModal" tabindex="-1" aria-labelledby="loginModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="loginModalLabel">Inicio de Sesión</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body text-center mb-1">
                    <form action="./index" method="post">
                        <div class="md-form ml-0 mr-0">
                            <input type="text" id="txtId" class="form-control form-control-sm validate ml-0" name="txtId">
                            <label data-error="wrong" data-success="right" for="id_usuario" class="ml-0">Nombre de usuario</label>
                            <input type="password" id="password" name="contrasena_usuario" class="form-control form-control-sm validate ml-0">
                            <label data-error="wrong" data-success="right" for="password" class="ml-0">Contraseña</label>
                        </div>
                        <div class="text-center mt-4">
                            <button type="submit" id="login" class="btn btn-primary btn-rounded ml-auto">Inicia Sesion<i></i></button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
