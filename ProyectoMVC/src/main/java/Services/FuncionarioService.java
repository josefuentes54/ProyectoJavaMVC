/*
 Package "Services": En este paquete, implementarás la lógica de negocio de tu aplicación. 
 Puedes crear una clase llamada FuncionarioService en este paquete y utilizarla para coordinar las operaciones entre los DAO y los modelos. 
 Por ejemplo, en el método crearFuncionario, puedes llamar al método correspondiente en el DAO para guardar el funcionario en la base de datos. 
 También puedes realizar validaciones adicionales, aplicar reglas de negocio y manejar excepciones en los servicios.

Aqui se llama al metodo en mi DAO y en la estructura que has planteado, la capa de servicio (Service) es responsable de orquestar la 
lógica de negocio y actuar como una capa intermedia entre los controladores (Controller) y los objetos de acceso a datos (DAO).

La capa de servicio utiliza los objetos de acceso a datos (DAO) para interactuar con la base de datos y 
realizar las operaciones CRUD (crear, leer, actualizar, eliminar) necesarias. 
Los métodos de la capa de servicio pueden llamar a los métodos correspondientes en los objetos DAO para realizar estas operaciones.

Author     : Jose Ignacio Fuentes Osorio
 */

package Services;

import Model.FuncionarioModel;
import DAO.FuncionarioDAO;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    private FuncionarioDAO funcionarioDAO;

    public FuncionarioService() {
        this.funcionarioDAO = new FuncionarioDAO(); // Inicialización del objeto FuncionarioDAO en el constructor
    }

    public void agregarFuncionario(FuncionarioModel funcionario) {
        funcionarioDAO.agregarFuncionario(funcionario); // Llama al método agregarFuncionario() de FuncionarioDAO para agregar un funcionario
    }
    
    public List<FuncionarioModel> listarFuncionarios() {       
        return funcionarioDAO.listarFuncionarios(); // Llama al método listarFuncionarios() de FuncionarioDAO para obtener una lista de funcionarios
    }
    
    public void eliminarFuncionario(int rut_funcionario) {
        funcionarioDAO.eliminarFuncionario(rut_funcionario); // Llama al método eliminarFuncionario() de FuncionarioDAO para eliminar un funcionario por su rut
    }
    
    public void actualizarFuncionario(FuncionarioModel funcionario) {
        funcionarioDAO.actualizarFuncionario(funcionario); // Llama al método actualizarFuncionario() de FuncionarioDAO para actualizar los datos de un funcionario
    }

    public FuncionarioModel obtenerFuncionario(int rut_funcionario) {
        return funcionarioDAO.obtenerFuncionario(rut_funcionario); // Llama al método obtenerFuncionario() de FuncionarioDAO para obtener un funcionario por su rut
    }
}


