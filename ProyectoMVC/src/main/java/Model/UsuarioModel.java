/*
Author     : Jose Ignacio Fuentes Osorio
*/
package Model;

public class UsuarioModel {
    private int id_usuario;
    private String nombre_usuario;
    private String contrasena_usuario;
    private int id_rol;

    public UsuarioModel(int id_usuario, String nombre_usuario, String contrasena_usuario, int id_rol) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasena_usuario = contrasena_usuario;
        this.id_rol = id_rol;
    }  
        
     public UsuarioModel(){
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena_usuario() {
        return contrasena_usuario;
    }

    public void setContrasena_usuario(String contrasena_usuario) {
        this.contrasena_usuario = contrasena_usuario;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
     
     
    
    
    
    
}
