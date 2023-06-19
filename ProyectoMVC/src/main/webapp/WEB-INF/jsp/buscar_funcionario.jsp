<%-- 
    Document   : buscar_funcionario
    Created on : 30-05-2023, 2:47:13
    Author     : josef
--%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>

<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Buscar Funcionario PETVALPO</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" 
              rel="stylesheet" 
              integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" 
              crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">PET VALPO SYSTEM</a>
                <button class="navbar-toggler" type="button"
                        data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false"
                        aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">                        
                        <li class="nav-item"><a class="nav-link" href="agregar_funcionario">Agregar Funcionario</a></li>                                   
                        <li class="nav-item"><a class="nav-link" href="agregar_cliente">Agregar Reserva</a></li>
                        <li class="nav-item"><a class="nav-link" href="buscar_funcionario">Buscar Funcionario</a></li>
                        <li class="nav-item"><a class="nav-link" href="buscar_cliente">Buscar Reserva</a></li>
                        <li class="nav-item"><a class="nav-link" href="funcionarios">Ver Funcionarios</a></li>
                        <li class="nav-item"><a class="nav-link" href="clientes">Ver Reservas</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <br>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="card">
                        <div class="card-header text-center">
                            <h4>Busqueda de Funcionario</h4>
                        </div>
                        <div class="card-body">
                            <h3>Rut Funcionario</h3>
                            <form action="./buscar_funcionario" method="post">                                
                                <div class="mb-3">                                    
                                    <input type="text" name="rut_funcionario" class="form-control">
                                </div>
                                <button type="submit" class="btn btn-primary">Buscar</button>
                            </form>
                            <h3>Resultado de la búsqueda</h3>
                            <c:if test="${funcionario!=null}">
                                <table class="table">                                                            
                                    <thead>
                                        <tr>
                                            <th scope="col">Rut Funcionario</th>
                                            <th scope="col">Nombre Funcionario</th>
                                            <th scope="col">Apellido Funcionario</th>
                                            <th scope="col">Teléfono Funcionario</th>
                                            <th scope="col">Dirección Funcionario</th>
                                            <th scope="col">Cargo Funcionario</th>
                                            <th scope="col">Nombre Emergencia Funcionario</th>
                                            <th scope="col">Telefono Emergencia Funcionario</th>
                                            <th scope="col">Acciones</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>${funcionario.rut_funcionario}</td>
                                            <td>${funcionario.nombre_funcionario}</td>
                                            <td>${funcionario.apellido_funcionario}</td>
                                            <td>${funcionario.telefono_funcionario}</td>
                                            <td>${funcionario.direccion_funcionario}</td>
                                            <td>${funcionario.cargo_funcionario}</td>
                                            <td>${funcionario.nombre_emergencia_funcionario}</td>
                                            <td>${funcionario.telefono_emergencia_funcionario}</td>
                                            <td>
                                                <div class="d-flex gap-2">
                                                    <form action="./editar_funcionario" method="GET">
                                                        <input type="hidden" name="rut_funcionario" value="${funcionario.rut_funcionario}">
                                                        <button class="btn btn-primary" type="submit">Editar</button>
                                                    </form>
                                                    <form action="./funcionarios/${funcionario.rut_funcionario}/eliminar" method="POST">
                                                        <button class="btn btn-danger" type="submit">Eliminar</button>
                                                    </form>
                                                </div>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </c:if>
                            <c:if test="${empty funcionario}">
                                <p>No se encontraron resultados.</p>
                            </c:if>						
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br>
        <footer class="bg-primary text-center text-lg-start text-white fixed-bottom">
            <div class="text-center p-3" style="background-color: #0D6EFD"> Derechos de autor © 2023: <a class="text-white">Jose Ignacio Fuentes</a></div>
        </footer>
    </body>
</html>
