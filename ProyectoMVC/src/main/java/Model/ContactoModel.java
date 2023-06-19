/*
La clase ContactoModel representa un modelo de datos para un contacto en tu aplicación. 
Tiene atributos como nombre_contacto, correo_contacto, telefono_contacto y consulta_contacto. 
Estos atributos están encapsulados y se acceden mediante los métodos getter y setter.
Esta clase se utiliza para crear objetos de tipo ContactoModel y almacenar información relacionada con los contactos realizados en la aplicación.

Author     : Jose Ignacio Fuentes Osorio
*/
package Model;

public class ContactoModel {
    private String nombre_contacto;
    private String correo_contacto;
    private int telefono_contacto;
    private String consulta_contacto;

    public ContactoModel(String nombre_contacto, String correo_contacto, int telefono_contacto, String consulta_contacto) {
        this.nombre_contacto = nombre_contacto;
        this.correo_contacto = correo_contacto;
        this.telefono_contacto = telefono_contacto;
        this.consulta_contacto = consulta_contacto;
    }
    
    public ContactoModel(){
    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }

    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }

    public String getCorreo_contacto() {
        return correo_contacto;
    }

    public void setCorreo_contacto(String correo_contacto) {
        this.correo_contacto = correo_contacto;
    }

    public int getTelefono_contacto() {
        return telefono_contacto;
    }

    public void setTelefono_contacto(int telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }

    public String getConsulta_contacto() {
        return consulta_contacto;
    }

    public void setConsulta_contacto(String consulta_contacto) {
        this.consulta_contacto = consulta_contacto;
    }
    
    
}
