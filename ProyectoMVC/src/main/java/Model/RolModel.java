/*
Author     : Jose Ignacio Fuentes Osorio
*/
package Model;

public class RolModel {
    private int id_rol;
    private String tipo_rol;

    public RolModel(int id_rol, String tipo_rol) {
        this.id_rol = id_rol;
        this.tipo_rol = tipo_rol;
    }
    
     public RolModel(){
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getTipo_rol() {
        return tipo_rol;
    }

    public void setTipo_rol(String tipo_rol) {
        this.tipo_rol = tipo_rol;
    }      
       
    
}
