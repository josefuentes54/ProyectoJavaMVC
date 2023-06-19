/*   
Package "DAO" (Data Access Object): En este paquete, implementarás los métodos de acceso a datos, 
que se utilizan para interactuar con la base de datos o algún otro mecanismo de persistencia. 
Puedes crear una clase llamada FuncionarioDAO en este paquete y proporcionar métodos 
como crearFuncionario, obtenerFuncionarioPorRut, actualizarFuncionario y eliminarFuncionario. 
Estos métodos se encargarán de realizar las operaciones correspondientes en la base de datos,
utilizando consultas SQL o algún framework ORM como Hibernate o JPA.

Esta clase es un Data Access Object (DAO) que se encarga de interactuar con la 
base de datos para realizar operaciones relacionadas con los funcionarios.

Estos métodos utilizan la clase FuncionarioModel para representar los datos del funcionario. 
La clase Conexion se utiliza para establecer la conexión con la base de datos.

Author     : Jose Ignacio Fuentes Osorio
*/

package DAO;

import Model.FuncionarioModel;
import java.sql.SQLException;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    private Connection con;

    // Método para agregar un funcionario a la base de datos
    public void agregarFuncionario(FuncionarioModel funcionario) {
        String sql = "INSERT INTO funcionarios (rut_funcionario, nombre_funcionario, apellido_funcionario, direccion_funcionario, telefono_funcionario, cargo_funcionario, nombre_emergencia_funcionario, telefono_emergencia_funcionario) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Conexion db = new Conexion();
            con = db.conexion();

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, funcionario.getRut_funcionario());
            stmt.setString(2, funcionario.getNombre_funcionario());
            stmt.setString(3, funcionario.getApellido_funcionario());
            stmt.setString(4, funcionario.getDireccion_funcionario());
            stmt.setInt(5, funcionario.getTelefono_funcionario());
            stmt.setString(6, funcionario.getCargo_funcionario());
            stmt.setString(7, funcionario.getNombre_emergencia_funcionario());
            stmt.setInt(8, funcionario.getTelefono_emergencia_funcionario());

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Funcionario agregado exitosamente a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el funcionario: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener la conexión: " + ex.getMessage());
        }
    }

    // Método para listar todos los funcionarios de la base de datos
    public List<FuncionarioModel> listarFuncionarios() {
        List<FuncionarioModel> listaFuncionarios = new ArrayList<FuncionarioModel>();

        String sql = "SELECT * FROM funcionarios ORDER BY rut_funcionario DESC;";

        try {
            Conexion db = new Conexion();
            con = db.conexion();

            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int rut = rs.getInt("rut_funcionario");
                String nombre = rs.getString("nombre_funcionario");
                String apellido = rs.getString("apellido_funcionario");
                String direccion = rs.getString("direccion_funcionario");
                int telefono = rs.getInt("telefono_funcionario");
                String cargo = rs.getString("cargo_funcionario");
                String nombre_emergencia = rs.getString("nombre_emergencia_funcionario");
                int telefono_emergencia = rs.getInt("telefono_emergencia_funcionario");

                FuncionarioModel funcionario = new FuncionarioModel(rut, nombre, apellido, direccion, telefono, cargo, nombre_emergencia, telefono_emergencia);
                listaFuncionarios.add(funcionario);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error al listar los funcionarios: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener la conexión: " + ex.getMessage());
        }

        return listaFuncionarios;
    }

    // Método para eliminar un funcionario de la base de datos
    public void eliminarFuncionario(int rut_funcionario) {
        String sql = "DELETE FROM funcionarios WHERE rut_funcionario = ?";

        try {
            Conexion db = new Conexion();
            con = db.conexion();

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, rut_funcionario);

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("El funcionario con rut " + rut_funcionario + " se eliminó correctamente.");
            } else {
                System.out.println("No se encontró ningún funcionario con rut " + rut_funcionario + ".");
            }

            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar el funcionario: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener la conexión: " + ex.getMessage());
        }
    }

    // Método para actualizar un funcionario en la base de datos
    public void actualizarFuncionario(FuncionarioModel funcionario) {
        String sql = "UPDATE funcionarios SET nombre_funcionario = ?, apellido_funcionario = ?, direccion_funcionario = ?, telefono_funcionario = ?, cargo_funcionario = ?, nombre_emergencia_funcionario = ?, telefono_emergencia_funcionario = ? WHERE rut_funcionario = ?";

        try {
            Conexion db = new Conexion();
            con = db.conexion();

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, funcionario.getNombre_funcionario());
            stmt.setString(2, funcionario.getApellido_funcionario());
            stmt.setString(3, funcionario.getDireccion_funcionario());
            stmt.setInt(4, funcionario.getTelefono_funcionario());
            stmt.setString(5, funcionario.getCargo_funcionario());
            stmt.setString(6, funcionario.getNombre_emergencia_funcionario());
            stmt.setInt(7, funcionario.getTelefono_emergencia_funcionario());
            stmt.setInt(8, funcionario.getRut_funcionario());

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("El funcionario con rut " + funcionario.getRut_funcionario() + " se actualizó correctamente.");
            } else {
                System.out.println("No se encontró ningún funcionario con rut " + funcionario.getRut_funcionario() + ".");
            }

            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar el funcionario: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener la conexión: " + ex.getMessage());
        }
    }

    // Método para obtener un funcionario de la base de datos por su rut
    public FuncionarioModel obtenerFuncionario(int rut_funcionario) {
        String sql = "SELECT * FROM funcionarios WHERE rut_funcionario = ?";
        FuncionarioModel funcionario = null;

        try {
            Conexion db = new Conexion();
            con = db.conexion();

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, rut_funcionario);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int rut = rs.getInt("rut_funcionario");
                String nombre = rs.getString("nombre_funcionario");
                String apellido = rs.getString("apellido_funcionario");
                String direccion = rs.getString("direccion_funcionario");
                int telefono = rs.getInt("telefono_funcionario");
                String cargo = rs.getString("cargo_funcionario");
                String nombreEmergencia = rs.getString("nombre_emergencia_funcionario");
                int telefonoEmergencia = rs.getInt("telefono_emergencia_funcionario");

                funcionario = new FuncionarioModel(rut, nombre, apellido, direccion, telefono, cargo, nombreEmergencia, telefonoEmergencia);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener el funcionario: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener la conexión: " + ex.getMessage());
        }
        return funcionario;
    }

}
