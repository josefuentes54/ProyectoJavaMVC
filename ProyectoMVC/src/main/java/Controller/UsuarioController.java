/*
Recibe las solicitudes del cliente, interactua con los datos
enviados del jsp y coordina una respuesta. usa al servicio para las
opraciones y prepara los datos para mandarlos de vuelta al cliente.
Aca se reciben los parametros del form de inicio de sesion y se llama
al servicio para validar las credenciales y decidir a donde redireccionar
segun el resultado dado.

Author     : Jose Ignacio Fuentes Osorio

 */

package Controller;

import Model.UsuarioModel;
import Services.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController() {
        this.usuarioService = new UsuarioService();
    }

    // Método para mostrar la página de inicio de sesión
    @GetMapping("/index")
    public String getLogin() {
        return "index";
    }

    // Método para procesar el inicio de sesión
    @PostMapping("/index")
    public String login(@RequestParam("txtId") String nombre_usuario, @RequestParam("contrasena_usuario") String contrasena_usuario, Model model) {
        
        // Se crea un objeto UsuarioModel y se establecen los datos proporcionados en el formulario
        UsuarioModel usuario = new UsuarioModel();
        usuario.setNombre_usuario(nombre_usuario);
        usuario.setContrasena_usuario(contrasena_usuario);

        // Se llama al método validar del servicio de usuario para verificar las credenciales
        int resultado = usuarioService.validar(usuario);

        // Se realiza una acción basada en el resultado de la validación
        switch (resultado) {
            case 1: // El usuario es un administrador
                model.addAttribute("tipo_rol", "administrador");
                model.addAttribute("id", nombre_usuario);
                return "redirect:/funcionarios"; // Redirige a la página de funcionarios
            case 2: // El usuario es un directorio
                model.addAttribute("tipo_rol", "secretario");
                model.addAttribute("id", nombre_usuario);
                return "redirect:/clientes"; // Redirige a la página de clientes
            default: // El usuario no es válido
                model.addAttribute("error", "Datos inválidos");
                return "index"; // Regresa a la página de inicio de sesión con un mensaje de error
        }
    }

}

