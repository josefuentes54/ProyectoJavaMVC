<%-- 
    Document   : reservas
    Created on : 25-05-2023, 21:28:45
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
<title>Reservas</title>
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
						<h4>Reservas Medicas</h4>
     
						
					</div>
					<div class="card-body">
						<table class="table">
							<thead>

								<tr>
									<th scope="col">Rut Cliente</th>
									<th scope="col">Nombre Cliente</th>
									<th scope="col">Apellido Cliente</th>
                                                                        <th scope="col">Direccion Cliente</th>
									<th scope="col">Telefono Cliente</th>
									<th scope="col">Mascota Cliente</th>
                                                                        <th scope="col">Tipo mascota Cliente</th>
									<th scope="col">Fecha Reserva Cliente</th>
									<th scope="col">Nombre Emergencia Cliente</th>
									<th scope="col">Telefono Emergencia Cliente</th>
                                                                        <th scope="col">Acciones</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="cliente" items="${cliente}">
									<tr>
										<td>${cliente.rut_cliente}</td>
                                                                                <td>${cliente.nombre_cliente}</td>
                                                                                <td>${cliente.apellido_cliente}</td>
                                                                                <td>${cliente.direccion_cliente}</td>
                                                                                <td>${cliente.telefono_cliente}</td>
                                                                                <td>${cliente.nombre_mascota_cliente}</td>
                                                                                <td>${cliente.tipo_mascota_cliente}</td>
                                                                                <td>${cliente.fecha_reserva_cliente}</td>
                                                                                <td>${cliente.nombre_emergencia_cliente}</td>
                                                                                <td>${cliente.telefono_emergencia_cliente}</td>
                                                                                <td>
                                                                                    <div class="d-flex gap-2">
                                                                                        <form action="./editar_cliente" method="GET">
                                                                                            <input type="hidden" name="rut_cliente" value="${cliente.rut_cliente}">
                                                                                            <button class="btn btn-primary" type="submit">Editar</button>
                                                                                        </form>
                                                                                        <form action="./clientes/${cliente.rut_cliente}/eliminar" method="POST">
                                                                                            <button class="btn btn-danger" type="submit">Eliminar</button>
                                                                                        </form>
                                                                                    </div>
                                                                                </td>
										
									</tr>
								</c:forEach>
							</tbody>
						</table>
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
