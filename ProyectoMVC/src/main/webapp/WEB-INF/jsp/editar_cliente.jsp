<%-- 
    Document   : editar_reserva.jsp
    Created on : 29-05-2023, 20:50:48
    Author     : josef
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>

<title>Editar Cliente/Reserva PETVALPO</title>
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
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header text-center">
						<h3>Editar Reserva</h3>
					</div>
					<div class="card-body">
						<form action="./editar_cliente" method="post">							
							<div class="mb-3">
								<label>Rut Cliente</label>
								<input type="text" name="rut_cliente" class="form-control" value="${cliente.rut_cliente}">
							</div>
							<div class="mb-3">
								<label>Nombre Cliente</label>
								<input type="text" name="nombre_cliente" class="form-control" value="${cliente.nombre_cliente}">
							</div>
							<div class="mb-3">
								<label>Apellido Cliente</label>
								<input type="text" name="apellido_cliente" class="form-control" value="${cliente.apellido_cliente}">
							</div>
							<div class="mb-3">
								<label>Dirección Cliente</label>
								<input type="text" name="direccion_cliente" class="form-control" value="${cliente.direccion_cliente}">
							</div>
							<div class="mb-3">
								<label>Teléfono Cliente</label>
								<input type="text" name="telefono_cliente" class="form-control" value="${cliente.telefono_cliente}">
							</div>
							<div class="mb-3">
								<label>Nombre Mascota</label>
								<input type="text" name="nombre_mascota_cliente" class="form-control" value="${cliente.nombre_mascota_cliente}">
							</div>
                                                        <div class="mb-3">
								<label>Tipo Mascota Cliente</label>
								<input type="text" name="tipo_mascota_cliente" class="form-control" value="${cliente.tipo_mascota_cliente}">
							</div>
							<div class="mb-3">
								<label>Fecha Reserva</label>
								<input type="text" name="fecha_reserva_cliente" class="form-control" value="${cliente.fecha_reserva_cliente}">
							</div>
							<div class="mb-3">
                                                                <label>Nombre de Emergencia</label>
								<input type="text" name="nombre_emergencia_cliente" class="form-control" value="${cliente.nombre_emergencia_cliente}">
							</div>
							<div class="mb-3">
								<label>Teléfono de Emergencia</label>
								<input type="text" name="telefono_emergencia_cliente" class="form-control" value="${cliente.telefono_emergencia_cliente}">
							</div>
							<button type="submit" class="btn btn-primary">Actualizar</button>
						</form>
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

