/*   
Package "Controller": En este paquete, puedes crear una clase llamada FuncionarioController encargada de manejar
las solicitudes HTTP relacionadas con los funcionarios. Esta clase actúa como un punto de entrada para las 
solicitudes del cliente y se comunica con FuncionarioService para realizar las operaciones necesarias. 
Puedes definir métodos en FuncionarioController para las operaciones CRUD, 
como crear, leer, actualizar y eliminar funcionarios, y asignar las rutas correspondientes a estos métodos utilizando 
anotaciones de Spring MVC, por ejemplo @GetMapping, @PostMapping, etc.

Author     : Jose Ignacio Fuentes Osorio
*/

package Controller;

import Model.FuncionarioModel;
import Services.FuncionarioService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FuncionarioController {   
    
    private FuncionarioService funcionarioService;

    public FuncionarioController() {
        this.funcionarioService = new FuncionarioService();
    }    
    
    // Método para listar los funcionarios
    @GetMapping("/funcionarios")
    public String listarFuncionarios(Model model) {
        List<FuncionarioModel> funcionario = funcionarioService.listarFuncionarios();
        model.addAttribute("funcionario", funcionario);
        return "funcionarios"; // nombre de la vista a mostrar, puedes cambiarlo según tus necesidades
    }
    
    // Método para mostrar el formulario de agregar funcionario
    @GetMapping("/agregar_funcionario")
    public String mostrarFormularioFuncionario(Model model) {
        FuncionarioModel funcionario = new FuncionarioModel();
        model.addAttribute("funcionario", funcionario);
        return "agregar_funcionario"; // nombre de la vista del formulario, puedes cambiarlo según tus necesidades
    }

    // Método para agregar un nuevo funcionario
    @PostMapping("/agregar_funcionario")
    public String agregarFuncionario(@ModelAttribute("funcionario") FuncionarioModel funcionario) {
        funcionarioService.agregarFuncionario(funcionario);
        return "redirect:/funcionarios"; // redirige a la lista de funcionarios después de agregar uno nuevo
    }
        
    // Método para eliminar un funcionario
    @PostMapping("/funcionarios/{rut_funcionario}/eliminar")
    public String eliminarFuncionario(@PathVariable int rut_funcionario) {
        funcionarioService.eliminarFuncionario(rut_funcionario);
        return "redirect:/funcionarios";
    }
    
    // Método para mostrar el formulario de edición de funcionario
    @GetMapping("/editar_funcionario")
    public String mostrarFormularioEdicionFuncionario(@RequestParam("rut_funcionario") int rut_funcionario, Model model) {
        FuncionarioModel funcionario = funcionarioService.obtenerFuncionario(rut_funcionario);
        model.addAttribute("funcionario", funcionario);
        return "editar_funcionario";
    }

    // Método para actualizar un funcionario
    @PostMapping("/editar_funcionario")
    public String actualizarFuncionario(@ModelAttribute("funcionario") FuncionarioModel funcionario) {
        funcionarioService.actualizarFuncionario(funcionario);
        return "redirect:/funcionarios";
    }
    
    // Método para mostrar el formulario de búsqueda de funcionario
    @GetMapping("/buscar_funcionario")
    public String mostrarFormularioBusqueda() {
        return "buscar_funcionario";
    }

    // Método para buscar un funcionario por su rut
    @PostMapping("/buscar_funcionario")
    public String buscarFuncionario(@RequestParam("rut_funcionario") int rut_funcionario, Model model) {
        FuncionarioModel funcionario = funcionarioService.obtenerFuncionario(rut_funcionario);
        if (funcionario != null) {
            model.addAttribute("funcionario", funcionario);
            return "buscar_funcionario";
        } else {
            model.addAttribute("mensaje", "No se encontró ningún funcionario con el rut proporcionado.");
            return "buscar_funcionario";
        }
    }
    
}

