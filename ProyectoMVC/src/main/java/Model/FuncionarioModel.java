/*   

Package "Model": Este paquete es adecuado para almacenar tus clases de modelo, como la clase FuncionarioModel que ya tienes. 
Estas clases representan los objetos de dominio y proporcionan métodos para acceder y manipular los datos. 
En este paquete, no implementarías directamente los métodos CRUD, ya que su función principal es modelar los datos.

 
Author     : Jose Ignacio Fuentes Osorio
*/
package Model;

public class FuncionarioModel {
    private int rut_funcionario;
    private String nombre_funcionario;
    private String apellido_funcionario;
    private String direccion_funcionario;
    private int telefono_funcionario;    
    private String cargo_funcionario;
    private String nombre_emergencia_funcionario;
    private int telefono_emergencia_funcionario;

    public FuncionarioModel(int rut_funcionario, String nombre_funcionario, String apellido_funcionario, String direccion_funcionario, int telefono_funcionario, String cargo_funcionario, String nombre_emergencia_funcionario, int telefono_emergencia_funcionario) {
        this.rut_funcionario = rut_funcionario;
        this.nombre_funcionario = nombre_funcionario;
        this.apellido_funcionario = apellido_funcionario;
        this.direccion_funcionario = direccion_funcionario;
        this.telefono_funcionario = telefono_funcionario;
        this.cargo_funcionario = cargo_funcionario;
        this.nombre_emergencia_funcionario = nombre_emergencia_funcionario;
        this.telefono_emergencia_funcionario = telefono_emergencia_funcionario;
    }

    public FuncionarioModel() {
       
    }   

    public int getRut_funcionario() {
        return rut_funcionario;
    }

    public void setRut_funcionario(int rut_funcionario) {
        this.rut_funcionario = rut_funcionario;
    }

    public String getNombre_funcionario() {
        return nombre_funcionario;
    }

    public void setNombre_funcionario(String nombre_funcionario) {
        this.nombre_funcionario = nombre_funcionario;
    }

    public String getApellido_funcionario() {
        return apellido_funcionario;
    }

    public void setApellido_funcionario(String apellido_funcionario) {
        this.apellido_funcionario = apellido_funcionario;
    }

    public String getDireccion_funcionario() {
        return direccion_funcionario;
    }

    public void setDireccion_funcionario(String direccion_funcionario) {
        this.direccion_funcionario = direccion_funcionario;
    }

    public int getTelefono_funcionario() {
        return telefono_funcionario;
    }

    public void setTelefono_funcionario(int telefono_funcionario) {
        this.telefono_funcionario = telefono_funcionario;
    }

    public String getCargo_funcionario() {
        return cargo_funcionario;
    }

    public void setCargo_funcionario(String cargo_funcionario) {
        this.cargo_funcionario = cargo_funcionario;
    }

    public String getNombre_emergencia_funcionario() {
        return nombre_emergencia_funcionario;
    }

    public void setNombre_emergencia_funcionario(String nombre_emergencia_funcionario) {
        this.nombre_emergencia_funcionario = nombre_emergencia_funcionario;
    }

    public int getTelefono_emergencia_funcionario() {
        return telefono_emergencia_funcionario;
    }

    public void setTelefono_emergencia_funcionario(int telefono_emergencia_funcionario) {
        this.telefono_emergencia_funcionario = telefono_emergencia_funcionario;
    }
    
}


/**
 Package "Model": Este paquete es adecuado para almacenar tus clases de modelo, como la clase FuncionarioModel que ya tienes. 
 * Estas clases representan los objetos de dominio y proporcionan métodos para acceder y manipular los datos. 
 * En este paquete, no implementarías directamente los métodos CRUD, ya que su función principal es modelar los datos.
 * @author josef
 */