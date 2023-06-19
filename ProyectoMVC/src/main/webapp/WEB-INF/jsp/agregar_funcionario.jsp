<%--
    Document   : agregar_funcionario
    Created on : 23-05-2023, 19:50:26
    Author     : josef
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Agregar Funcionario PETVALPO</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">PET VALPO SYSTEM</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
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
                <div class="col-md-6 offset-md-3">
                    <div class="card">
                        <div class="card-header text-center">
                            <h3>Agregar Funcionario</h3>
                        </div>
                        <div class="card-body">                            
                            <form action="./agregar_funcionario" method="POST">
                                <div class="mb-3">
                                    <label>Rut Funcionario</label>
                                    <input type="text" name="rut_funcionario" class="form-control" required>
                                </div>
                                <div class="mb-3">
                                    <label>Nombre Funcionario</label>
                                    <input type="text" name="nombre_funcionario" class="form-control" required>
                                </div>
                                <div class="mb-3">
                                    <label>Apellido Funcionario</label>
                                    <input type="text" name="apellido_funcionario" class="form-control" required>
                                </div>
                                <div class="mb-3">
                                    <label>Direccion Funcionario</label>
                                    <input type="text" name="direccion_funcionario" class="form-control" required>
                                </div>
                                <div class="mb-3">
                                    <label>Telefono Funcionario</label>
                                    <input type="text" name="telefono_funcionario" class="form-control" required>
                                </div>
                                <div class="mb-3">
                                    <label>Cargo Funcionario</label>
                                    <input type="text" name="cargo_funcionario" class="form-control" required>
                                </div>
                                <div class="mb-3">
                                    <label>Nombre de Emergencia</label>
                                    <input type="text" name="nombre_emergencia_funcionario" class="form-control" required>
                                </div>
                                <div class="mb-3">
                                    <label>Teléfono de Emergencia</label>
                                    <input type="text" name="telefono_emergencia_funcionario" class="form-control" required>
                                </div>
                                    <button class="btn btn-primary" type="submit">Agregar</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br>        
        <footer class="bg-primary text-center text-lg-start text-white">
            <div class="text-center p-3" style="background-color: #0D6EFD"> Derechos de autor © 2023: <a class="text-white">Jose Ignacio Fuentes</a></div>
        </footer>
        
    </body>
</html>

