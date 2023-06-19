/*
En este controlador, se define un único método que se mapea a la ruta 
"/contacto" mediante la anotación @PostMapping. El método recibe un objeto 
ContactoModel como parámetro, que se vincula automáticamente con los datos 
enviados desde el formulario de contacto en la vista.

El método agregarContacto utiliza el servicio ContactoService para agregar 
el contacto al sistema. Luego, se realiza una redirección a la ruta "/index.htm" 
mediante return "redirect:/index.htm", lo que significa que después de agregar el 
contacto, se redirigirá al usuario a la página de inicio.

En resumen, este controlador se encarga de procesar la solicitud de agregar 
un nuevo contacto a través del método agregarContacto. Utiliza el servicio correspondiente 
para realizar la operación y luego redirige al usuario a la página de inicio.

Author: Jose Ignacio Fuentes Osorio
*/
package Controller;

import Model.ContactoModel;
import Services.ContactoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactoController {
    
    private ContactoService contactoService;
    
    public ContactoController() {
        this.contactoService = new ContactoService();
    }    
    
    @PostMapping("/contacto")
    public String agregarContacto(@ModelAttribute("contacto") ContactoModel contacto) {
        contactoService.agregarContacto(contacto);
        return "redirect:/index.htm"; // Redirige a la ruta "/index.htm" después de agregar un nuevo contacto
    }
    
}

