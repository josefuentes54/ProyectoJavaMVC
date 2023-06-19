/*
Author     : Jose Ignacio Fuentes Osorio
*/
package Services;

import Model.ClienteModel;
import DAO.ClienteDAO;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    private ClienteDAO clienteDAO;

    public ClienteService() {
        this.clienteDAO = new ClienteDAO(); // Inicialización del objeto ClienteDAO en el constructor
    }

    public void agregarCliente(ClienteModel cliente) {
        clienteDAO.agregarCliente(cliente); // Llama al método agregarCliente() de ClienteDAO para agregar un cliente
    }
    
    public List<ClienteModel> listarClientes() {       
        return clienteDAO.listarClientes(); // Devuelve la lista de clientes obtenida a través del método listarClientes() de ClienteDAO
    }
    
    public void eliminarCliente(int rut_cliente) {
        clienteDAO.eliminarCliente(rut_cliente); // Llama al método eliminarCliente() de ClienteDAO para eliminar un cliente por su rut
    }
    
    public void actualizarCliente(ClienteModel cliente) {
        clienteDAO.actualizarCliente(cliente); // Llama al método actualizarCliente() de ClienteDAO para actualizar los datos de un cliente
    }

    public ClienteModel obtenerCliente(int rut_cliente) {
        return clienteDAO.obtenerCliente(rut_cliente); // Devuelve un objeto ClienteModel obtenido a través del método obtenerCliente() de ClienteDAO, utilizando el rut como parámetro
    }
    
}

