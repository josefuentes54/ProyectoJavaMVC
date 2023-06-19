## ProyectoJavaMVC
El proyecto es un sistema de gestión de clientes y mascotas para una empresa de veterinaria.

## Descripción
El sistema de gestión de clientes y mascotas es una aplicación que permite a la empresa administrar la información de sus clientes y las mascotas asociadas. Proporciona funcionalidades como agregar nuevos clientes, listar clientes existentes, eliminar clientes y actualizar la información de los clientes, lo mismo para las mascotas. Además, permite validar las credenciales de los usuarios para acceder al sistema.

El sistema cuenta con entidades principales, como Cliente, Contacto y Funcionario, y se basa en una arquitectura de tres capas: DAO (Data Access Object), Service y Controller. Cada entidad tiene su propia clase DAO que se encarga de acceder a los datos en la base de datos, un Service que implementa la lógica de negocio y un Controller que maneja las solicitudes de los usuarios.

El proyecto utiliza el framework Spring y sigue el patrón de diseño MVC (Modelo-Vista-Controlador) para organizar y separar las responsabilidades. Además, se utiliza una base de datos para almacenar y recuperar la información de los clientes.

## Tecnologías utilizadas

- HTML, CSS y JS para el desarrollo del sitio web.
- Utilización de Bootstrap para estilos y responsividad.
- Spring MVC para el desarrollo del backend.
- Repositorios para el acceso a datos.

## Uso

1. Accede a la aplicación.
2. Inicia sesión con tus credenciales según tu rol de usuario.
3. Para iniciar sesion en la aplicaciones y explorar las diferentes funcionalidades disponibles según tu rol prueba con:
a.- Rol de administrativo: id: 1 , password: 123
b.- Rol de secretario:  id: 2, password:1234


## Características
Agregar nuevos clientes/mascotas: Permite registrar la información de un nuevo cliente, incluyendo su nombre, apellido, dirección, teléfono, nombre de mascota, tipo de mascota, fecha de reserva, nombre de contacto de emergencia y teléfono de contacto de emergencia.

Listar clientes/mascotas existentes: Permite ver la lista de todos los clientes registrados en el sistema, mostrando su información básica.

Eliminar clientes/mascotas: Permite eliminar un cliente específico del sistema utilizando su número de identificación único (RUT).

Actualizar información de clientes/mascotas: Permite modificar la información de un cliente existente, como su dirección, teléfono de contacto y nombre de contacto de emergencia.

Validación de credenciales: Permite verificar las credenciales de un usuario para controlar el acceso al sistema.

## Requisitos del Sistema
Java 8
Spring Framework
Base de datos relacional compatible con el sistema (por ejemplo, MySQL, PostgreSQL)


## Instrucciones de instalación

1. Clona el repositorio de GitHub: `git clone https://github.com/josefuentes54/ProyectoJavaMVC.git
2. Importa el proyecto en tu entorno de desarrollo favorito.
3. Configura la conexión a la base de datos con el Script.
4. Ejecuta la aplicación.

## Usos

- Sitio Web
(HTML, CSS, Bootstrap): /ProyectoMVC/Web Pages/WEB-INF/jsp

- Algoritmia de cálculo y manipulación de archivos de texto:

## Utilización general del lenguaje: 

- Se utilizan sentencias lógicas (if, else, switch) -->
/ProyectoMVC/Source Packages/DAO/
linea 126 del metodo "eliminarActividades"

- Se emplean expresiones y operaciones para realizar cálculos y manipulaciones de los archivos de texto:
/ProyectoMVC/Source Packages/DAO/UsuarioDAO.java
En el método listarUsuariosPorRol(), se realiza una consulta SQL para obtener la cantidad de usuarios por rol.

- Se aplican comparaciones para evaluar condiciones y tomar decisiones: 
En el método login, se realiza una comparación switch para evaluar el valor de la variable resultado. Dependiendo del resultado, se agregan diferentes atributos al modelo y se redirige a diferentes vistas.
/ProyectoMVC/Source Packages/Controller/UsuarioController.java.
linea 85.

- Sentencias repetitivas: Se utilizan bucles (for, while) para iterar sobre los elementos:
/ProyectoMVC/Web Pages/WEB-INF/jsp/funcionarios.jsp, linea 151.

- Estructuras de datos: Se emplean estructuras de datos apropiadas, como listas, arrays o colecciones:
/ProyectoMVC/Source Packages/DAO/UsuarioDAO.java
linea 75 metodo "listarUsuario()".

- Principios de encapsulamiento y responsabilidad única: Se crean clases y métodos que se centran en tareas específicas y tienen una única responsabilidad:
/ProyectoMVC/Source Packages/Model/.

- Uso de interfaces o relaciones de herencia para hacer polimorfismo: Se utilizan interfaces:
/ProyectoMVC/Source Packages/Model/Validar.java.

- Utilización de unidades de prueba:
/ProyectoMVC/Test Packages/Controller/FuncionarioDAOTest.java.

c) Consultas a la base de datos de la aplicación:

- Utilización de JOIN y GROUP BY:
/ProyectoMVC/Source Packages/DAO/UsuarioDAO.java
linea 125 del metodo "listarUsuariosPorRol()".

- Utilización de WHERE: 
/ProyectoSpringMVC/Source Packages/Repository/DirectorioRepository.java
linea 115 del metodo "eliminarActividades()".

- Utilizacion de ORDER BY:
/ProyectoSpringMVC/Source Packages/Repository/DirectorioRepository.java
linea 69 del metodo "listarActividades()".

Autores
Jose Ignacio Fuentes Osorio

Licencia
Este proyecto está bajo la Licencia MIT.
