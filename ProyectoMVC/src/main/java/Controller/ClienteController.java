/*
Este código representa un controlador en Java para una aplicación web utilizando el framework Spring MVC.

Author: Jose Ignacio Fuentes Osorio
 */
package Controller;

import Model.ClienteModel;
import Services.ClienteService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClienteController {   
   
    private ClienteService clienteService;

    public ClienteController() {
        this.clienteService = new ClienteService();
    }    
    
    @GetMapping("/clientes")
    public String listarClientes(Model model) {
        List<ClienteModel> cliente = clienteService.listarClientes();
        model.addAttribute("cliente", cliente);
        return "clientes"; // Retorna la vista "clientes" para mostrar la lista de clientes
    }
    
    @GetMapping("/agregar_cliente")
    public String mostrarFormularioCliente(Model model) {
        ClienteModel cliente = new ClienteModel();
        model.addAttribute("cliente", cliente);
        return "agregar_cliente"; // Retorna la vista "agregar_cliente" para mostrar el formulario de creación de clientes
    }

    @PostMapping("/agregar_cliente")
    public String agregarCliente(@ModelAttribute("cliente") ClienteModel cliente) {
        clienteService.agregarCliente(cliente);
        return "redirect:/clientes"; // Redirige a la ruta "/clientes" después de agregar un nuevo cliente
    }
        
    @PostMapping("/clientes/{rut_cliente}/eliminar")
    public String eliminarCliente(@PathVariable int rut_cliente) {
        clienteService.eliminarCliente(rut_cliente);
        return "redirect:/clientes"; // Redirige a la ruta "/clientes" después de eliminar un cliente
    }
    
    @GetMapping("/editar_cliente")
    public String mostrarFormularioEdicioncliente(@RequestParam("rut_cliente") int rut_cliente, Model model) {
        ClienteModel cliente = clienteService.obtenerCliente(rut_cliente);
        model.addAttribute("cliente", cliente);
        return "editar_cliente"; // Retorna la vista "editar_cliente" para mostrar el formulario de edición de clientes
    }

    @PostMapping("/editar_cliente")
    public String actualizarCliente(@ModelAttribute("cliente") ClienteModel cliente) {
        clienteService.actualizarCliente(cliente);
        return "redirect:/clientes"; // Redirige a la ruta "/clientes" después de actualizar un cliente
    }
    
    @GetMapping("/buscar_cliente")
    public String mostrarFormularioBusqueda() {
        return "buscar_cliente"; // Retorna la vista "buscar_cliente" para mostrar el formulario de búsqueda de clientes
    }

    @PostMapping("/buscar_cliente")
    public String buscarCliente(@RequestParam("rut_cliente") int rut_cliente, Model model) {
        ClienteModel cliente = clienteService.obtenerCliente(rut_cliente);
        if (cliente != null) {
            model.addAttribute("cliente", cliente);
            return "buscar_cliente"; // Retorna la vista "buscar_cliente" con el cliente encontrado
        } else {
            model.addAttribute("mensaje", "No se encontró ningún cliente con el rut proporcionado.");
            return "buscar_cliente"; // Retorna la vista "buscar_cliente" con un mensaje de error
        }
    }   
}


