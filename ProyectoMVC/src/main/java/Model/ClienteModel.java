/*
La clase ClienteModel representa un modelo de datos para un cliente en tu aplicación. 
Tiene atributos como rut_cliente, nombre_cliente, apellido_cliente, direccion_cliente, telefono_cliente, 
nombre_mascota_cliente, tipo_mascota_cliente, fecha_reserva_cliente, nombre_emergencia_cliente y telefono_emergencia_cliente. 
Estos atributos están encapsulados y se acceden mediante los métodos getter y setter.

Author     : Jose Ignacio Fuentes Osorio
*/


package Model;

public class ClienteModel {
    private int rut_cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private String direccion_cliente;
    private int telefono_cliente;
    private String nombre_mascota_cliente;
    private String tipo_mascota_cliente;
    private String fecha_reserva_cliente;    
    private String nombre_emergencia_cliente;
    private int telefono_emergencia_cliente;

    public ClienteModel(int rut_cliente, String nombre_cliente, String apellido_cliente, String direccion_cliente, int telefono_cliente, String nombre_mascota_cliente, String tipo_mascota_cliente, String fecha_reserva_cliente, String nombre_emergencia_cliente, int telefono_emergencia_cliente) {
        this.rut_cliente = rut_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.direccion_cliente = direccion_cliente;
        this.telefono_cliente = telefono_cliente;
        this.nombre_mascota_cliente = nombre_mascota_cliente;
        this.tipo_mascota_cliente = tipo_mascota_cliente;
        this.fecha_reserva_cliente = fecha_reserva_cliente;
        this.nombre_emergencia_cliente = nombre_emergencia_cliente;
        this.telefono_emergencia_cliente = telefono_emergencia_cliente;
    }
    
    public ClienteModel(){
    }
    

    public int getRut_cliente() {
        return rut_cliente;
    }

    public void setRut_cliente(int rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public int getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(int telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getNombre_mascota_cliente() {
        return nombre_mascota_cliente;
    }

    public void setNombre_mascota_cliente(String nombre_mascota_cliente) {
        this.nombre_mascota_cliente = nombre_mascota_cliente;
    }

    public String getTipo_mascota_cliente() {
        return tipo_mascota_cliente;
    }

    public void setTipo_mascota_cliente(String tipo_mascota_cliente) {
        this.tipo_mascota_cliente = tipo_mascota_cliente;
    }

    public String getFecha_reserva_cliente() {
        return fecha_reserva_cliente;
    }

    public void setFecha_reserva_cliente(String fecha_reserva_cliente) {
        this.fecha_reserva_cliente = fecha_reserva_cliente;
    }

    public String getNombre_emergencia_cliente() {
        return nombre_emergencia_cliente;
    }

    public void setNombre_emergencia_cliente(String nombre_emergencia_cliente) {
        this.nombre_emergencia_cliente = nombre_emergencia_cliente;
    }

    public int getTelefono_emergencia_cliente() {
        return telefono_emergencia_cliente;
    }

    public void setTelefono_emergencia_cliente(int telefono_emergencia_cliente) {
        this.telefono_emergencia_cliente = telefono_emergencia_cliente;
    }
   
    
}
