/*

Author     : Jose Ignacio Fuentes Osorio
*/
package Services;

import Model.ContactoModel;
import DAO.ContactoDAO;
import org.springframework.stereotype.Service;

@Service
public class ContactoService {
    
    private ContactoDAO contactoDAO;

    public ContactoService() {
        this.contactoDAO = new ContactoDAO(); // Inicialización del objeto ContactoDAO en el constructor
    }

    public void agregarContacto(ContactoModel contacto) {
        contactoDAO.agregarContacto(contacto); // Llama al método agregarContacto() de ContactoDAO para agregar un contacto
    }
}
