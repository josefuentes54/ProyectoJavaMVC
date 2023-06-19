/*

Author     : Jose Ignacio Fuentes Osorio
*/

package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // ...

    @GetMapping("/quienes_somos")
    public String mostrarPaginaQuienesSomos() {
        return "quienes_somos";
    }
    @GetMapping("/contacto")
    public String mostrarContacto() {
        return "contacto";
    }
    

}
