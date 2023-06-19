/*
 
Author     : Jose Ignacio Fuentes Osorio
 */
package DAO;

import Model.ContactoModel;
import java.sql.SQLException;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContactoDAO {

    private Connection con;

    // Método para agregar un contacto a la base de datos
    public void agregarContacto(ContactoModel contacto) {
        String sql = "INSERT INTO contactos (nombre_contacto, correo_contacto, telefono_contacto, consulta_contacto) VALUES (?, ?, ?, ?)";

        try {
            Conexion db = new Conexion();
            con = db.conexion();

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, contacto.getNombre_contacto());
            stmt.setString(2, contacto.getCorreo_contacto());
            stmt.setInt(3, contacto.getTelefono_contacto());
            stmt.setString(4, contacto.getConsulta_contacto());

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Contacto agregado exitosamente a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el contacto: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener la conexión: " + ex.getMessage());
        }
    }
}


