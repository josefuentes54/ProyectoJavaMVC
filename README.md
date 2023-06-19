# ProyectoJavaMVC
El proyecto es un sistema de gestión de clientes y mascotas para una empresa de veterinaria.

Descripción
El sistema de gestión de clientes es una aplicación que permite a la empresa administrar la información de sus clientes y las mascotas asociadas. Proporciona funcionalidades como agregar nuevos clientes, listar clientes existentes, eliminar clientes y actualizar la información de los clientes. Además, permite validar las credenciales de los usuarios para acceder al sistema.

El sistema cuenta con entidades principales, como Cliente, Contacto y Funcionario, y se basa en una arquitectura de tres capas: DAO (Data Access Object), Service y Controller. Cada entidad tiene su propia clase DAO que se encarga de acceder a los datos en la base de datos, un Service que implementa la lógica de negocio y un Controller que maneja las solicitudes de los usuarios.

El proyecto utiliza el framework Spring y sigue el patrón de diseño MVC (Modelo-Vista-Controlador) para organizar y separar las responsabilidades. Además, se utiliza una base de datos para almacenar y recuperar la información de los clientes.

Características
Agregar nuevos clientes/mascotas: Permite registrar la información de un nuevo cliente, incluyendo su nombre, apellido, dirección, teléfono, nombre de mascota, tipo de mascota, fecha de reserva, nombre de contacto de emergencia y teléfono de contacto de emergencia.

Listar clientes/mascotas existentes: Permite ver la lista de todos los clientes registrados en el sistema, mostrando su información básica.

Eliminar clientes/mascotas: Permite eliminar un cliente específico del sistema utilizando su número de identificación único (RUT).

Actualizar información de clientes/mascotas: Permite modificar la información de un cliente existente, como su dirección, teléfono de contacto y nombre de contacto de emergencia.

Validación de credenciales: Permite verificar las credenciales de un usuario para controlar el acceso al sistema.

Requisitos del Sistema
Java 8 o superior
Spring Framework
Base de datos compatible con el sistema (por ejemplo, MySQL, PostgreSQL)


Instalación y Uso
Clona el repositorio: git clone https://github.com/josefuentes54/ProyectoJavaMVC.git
Navega al directorio del proyecto: cd josefuentes54
Configura las opciones de configuración en el archivo config.yml.
Compila y ejecuta la aplicación: mvn clean install && mvn spring-boot:run
Accede a la aplicación desde tu navegador en http://localhost:8080.

Autores
Jose Ignacio Fuentes Osorio

Licencia
Este proyecto está bajo la Licencia MIT.
