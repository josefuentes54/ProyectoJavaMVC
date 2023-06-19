/*Dao que contiene la logica para las operaciones de la base de datos
y en este caso valida las credenciales del usuario.

Author     : Jose Ignacio Fuentes Osorio
*/
package DAO;

import Conexion.Conexion;
import Model.UsuarioModel;
import Model.Validar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioDAO implements Validar {
    
    private Connection con;

    @Override
    public int validar(UsuarioModel usuario) {
        int resultado = 0;

        String sql = "SELECT tipo_rol FROM rol WHERE id_rol IN (SELECT id_rol FROM usuarios WHERE nombre_usuario = ? AND contrasena_usuario = ?)";

        try {
            Conexion db = new Conexion();
            con = db.conexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, usuario.getId_usuario());
            ps.setString(2, usuario.getContrasena_usuario());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String rol = rs.getString("tipo_rol");
                // Aquí puedes hacer algo con el rol, como asignar permisos o redireccionar a páginas específicas
                if (rol.equals("administrador")) {
                    // El usuario es un administrador
                    resultado = 1;
                } else if (rol.equals("secretario")) {
                    // El usuario es un usuario normal
                    resultado = 2;
                }
            }
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al validar las credenciales del usuario: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener la conexión: " + ex.getMessage());
        }

        return resultado;
    }
}