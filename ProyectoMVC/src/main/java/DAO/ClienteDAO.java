/*
Este código representa una clase ClienteDAO que se encarga de realizar operaciones de acceso a datos 
(CRUD) para la entidad Cliente en una base de datos. Aquí tienes una descripción de los métodos presentes en esta clase.

Estos métodos interactúan con una base de datos mediante consultas 
SQL utilizando una clase Conexion para establecer la conexión y ejecutar las consultas.

Author     : Jose Ignacio Fuentes Osorio
*/
package DAO;

import Model.ClienteModel;
import java.sql.SQLException;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private Connection con;

    // Método para agregar un cliente a la base de datos
    public void agregarCliente(ClienteModel cliente) {
        String sql = "INSERT INTO clientes (rut_cliente, nombre_cliente, apellido_cliente, direccion_cliente, telefono_cliente, nombre_mascota_cliente, tipo_mascota_cliente, fecha_reserva_cliente, nombre_emergencia_cliente, telefono_emergencia_cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Conexion db = new Conexion();
            con = db.conexion();

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cliente.getRut_cliente());
            stmt.setString(2, cliente.getNombre_cliente());
            stmt.setString(3, cliente.getApellido_cliente());
            stmt.setString(4, cliente.getDireccion_cliente());
            stmt.setInt(5, cliente.getTelefono_cliente());
            stmt.setString(6, cliente.getNombre_mascota_cliente());
            stmt.setString(7, cliente.getTipo_mascota_cliente());
            stmt.setString(8, cliente.getFecha_reserva_cliente());            
            stmt.setString(9, cliente.getNombre_emergencia_cliente());
            stmt.setInt(10, cliente.getTelefono_emergencia_cliente());

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Cliente agregado exitosamente a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el cliente: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener la conexión: " + ex.getMessage());
        }
    }

    // Método para obtener una lista de clientes desde la base de datos
    public List<ClienteModel> listarClientes() {
        List<ClienteModel> listaClientes = new ArrayList<ClienteModel>();

        String sql = "SELECT * FROM clientes ORDER BY rut_cliente DESC;";

        try {
            Conexion db = new Conexion();
            con = db.conexion();

            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int rut = rs.getInt("rut_cliente");
                String nombre = rs.getString("nombre_cliente");
                String apellido = rs.getString("apellido_cliente");
                String direccion = rs.getString("direccion_cliente");
                int telefono = rs.getInt("telefono_cliente");
                String nombre_mascota = rs.getString("nombre_mascota_cliente");
                String tipo_mascota = rs.getString("tipo_mascota_cliente");  
                String fecha_reserva = rs.getString("fecha_reserva_cliente");  
                String nombre_emergencia = rs.getString("nombre_emergencia_cliente");
                int telefono_emergencia = rs.getInt("telefono_emergencia_cliente");
                
                ClienteModel cliente = new ClienteModel(rut,nombre, apellido, direccion, telefono, nombre_mascota, tipo_mascota, fecha_reserva, nombre_emergencia, telefono_emergencia);
                listaClientes.add(cliente);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error al listar los clientes: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener la conexión: " + ex.getMessage());
        }

        return listaClientes;
    }

    // Método para eliminar un cliente de la base de datos
    public void eliminarCliente(int rut_cliente) {
        String sql = "DELETE FROM clientes WHERE rut_cliente = ?";

        try {
            Conexion db = new Conexion();
            con = db.conexion();

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, rut_cliente);

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("La reserva con rut " + rut_cliente + " se eliminó correctamente.");
            } else {
                System.out.println("No se encontró ninguna reserva con rut " + rut_cliente + ".");
            }

            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar la reserva: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener la conexión: " + ex.getMessage());
        }
    }

    // Método para actualizar la información de un cliente en la base de datos
    public void actualizarCliente(ClienteModel cliente) {
        String sql = "UPDATE clientes SET nombre_cliente = ?, apellido_cliente = ?, direccion_cliente = ?, telefono_cliente = ?, nombre_mascota_cliente = ?, tipo_mascota_cliente = ?, fecha_reserva_cliente = ?, nombre_emergencia_cliente = ?, telefono_emergencia_cliente = ? WHERE rut_cliente = ?";

        try {
            Conexion db = new Conexion();
            con = db.conexion();

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNombre_cliente());
            stmt.setString(2, cliente.getApellido_cliente());
            stmt.setString(3, cliente.getDireccion_cliente());
            stmt.setInt(4, cliente.getTelefono_cliente());
            stmt.setString(5, cliente.getNombre_mascota_cliente());
            stmt.setString(6, cliente.getTipo_mascota_cliente());
            stmt.setString(7, cliente.getFecha_reserva_cliente());            
            stmt.setString(8, cliente.getNombre_emergencia_cliente());
            stmt.setInt(9, cliente.getTelefono_emergencia_cliente());
            stmt.setInt(10, cliente.getRut_cliente());

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("El funcionario con rut " + cliente.getRut_cliente() + " se actualizó correctamente.");
            } else {
                System.out.println("No se encontró ningún funcionario con rut " + cliente.getRut_cliente() + ".");
            }

            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar el cliente: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener la conexión: " + ex.getMessage());
        }
    }

    // Método para obtener un cliente específico de la base de datos
    public ClienteModel obtenerCliente(int rut_cliente) {
        String sql = "SELECT * FROM clientes WHERE rut_cliente = ?";
        ClienteModel cliente = null;

        try {
            Conexion db = new Conexion();
            con = db.conexion();

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, rut_cliente);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                 int rut = rs.getInt("rut_cliente");
                String nombre = rs.getString("nombre_cliente");
                String apellido = rs.getString("apellido_cliente");
                String direccion = rs.getString("direccion_cliente");
                int telefono = rs.getInt("telefono_cliente");
                String nombre_mascota = rs.getString("nombre_mascota_cliente");
                String tipo_mascota = rs.getString("tipo_mascota_cliente");  
                String fecha_reserva = rs.getString("fecha_reserva_cliente");  
                String nombre_emergencia = rs.getString("nombre_emergencia_cliente");
                int telefono_emergencia = rs.getInt("telefono_emergencia_cliente");

                cliente = new ClienteModel(rut, nombre, apellido, direccion, telefono, nombre_mascota, tipo_mascota, fecha_reserva, nombre_emergencia, telefono_emergencia);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener el funcionario: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener la conexión: " + ex.getMessage());
        }
        return cliente;
    }

}
