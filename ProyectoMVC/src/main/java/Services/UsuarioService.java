/*
n este código, se define la clase UsuarioService, que actúa como una capa intermedia entre el controlador 
y el DAO para manejar las operaciones relacionadas con los usuarios. En el constructor, se inicializa un 
objeto UsuarioDAO que se utilizará para interactuar con la capa de acceso a datos.

La clase UsuarioService proporciona dos métodos validarCredenciales() y validar(). Ambos métodos 
llaman al método validar() en el objeto UsuarioDAO y retornan el resultado. El método validarCredenciales() se 
utiliza para validar las credenciales de un usuario específico, mientras que el método validar() se utiliza para 
validar un usuario en general.

Author     : Jose Ignacio Fuentes Osorio
*/
package Services;

import DAO.UsuarioDAO;
import Model.UsuarioModel;

public class UsuarioService {
    
   private final UsuarioDAO usuarioDAO; // Declaración del objeto UsuarioDAO

    public UsuarioService() {
        this.usuarioDAO = new UsuarioDAO(); // Inicialización del objeto UsuarioDAO en el constructor
    }
    
    public int validarCredenciales(UsuarioModel usuario) {
        return usuarioDAO.validar(usuario); // Llama al método validar() de UsuarioDAO para validar las credenciales de un usuario
    }
    
    public int validar(UsuarioModel usuario) {
        return usuarioDAO.validar(usuario); // Llama al método validar() de UsuarioDAO para validar un usuario
    }
  
}
