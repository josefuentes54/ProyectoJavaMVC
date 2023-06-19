<%-- 
    Document   : contacto
    Created on : 14-06-2023, 0:56:47
    Author     : josef
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contacto PETVALPO</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">    
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
                            <a class="nav-link" href="quienes_somos">Quienes Somos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="contacto">Contacto</a>
                        </li>
                    </ul>                    
                </div>
            </div>
        </nav>
    </header>

    <div class="container mt-5">
        <div class="row">
            <div class="col-md-6">
                <div class="contact-info">
                    <h3>Información de contacto</h3>
                    <p><strong>Ubicación:</strong> Valparaíso, Chile</p>
                    <p><strong>Teléfono:</strong> +123456789</p>
                    <p><strong>Correo electrónico:</strong> info@petvalpo.com</p>
                </div>
            </div>
            <div class="col-md-6">
                <h3>Formulario de contacto</h3>
                <form action="./contacto" method="POST">
                    <div class="mb-3">
                        <label class="form-label">Nombre Completo:</label>
                        <input type="text" class="form-control" id="nombre" name="nombre_contacto" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Correo electrónico:</label>
                        <input type="email" class="form-control" id="correo" name="correo_contacto" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Teléfono:</label>
                        <input type="text" class="form-control" id="telefono" name="telefono_contacto" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Consulta:</label>
                        <textarea class="form-control" id="consulta" name="consulta_contacto" required></textarea>
                    </div>
                    <button type="submit" class="btn btn-primary">Enviar</button>
                </form>
            </div>
        </div>
    </div>
<footer class="bg-primary text-center text-lg-start text-white fixed-bottom">
            <div class="text-center p-3" style="background-color: #0D6EFD"> Derechos de autor © 2023: <a class="text-white">Jose Ignacio Fuentes</a></div>
        </footer>
</footer>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>


