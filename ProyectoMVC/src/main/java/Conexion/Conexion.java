/*
Package "Conexion": Este paquete generalmente se utiliza para 
administrar la conexión con una base de datos. 

Aquí puedes incluir clases relacionadas con la configuración y gestión de la conexión, como clases de utilidad para establecer
y cerrar conexiones, manejo de excepciones, etc.

Author: Jose Ignacio Fuentes Osorio
 */
package Conexion;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // Author: Jose Ignacio Fuentes Osorio
    private static Conexion instancia = null;
    private static String url = "jdbc:mysql://localhost:3306/petvalpomvc";
    private static String user = "root";
    private static String pass = "";
    private static Connection con = null;
    private Statement stmt = null;

    public Conexion() throws SQLException, ClassNotFoundException {
        System.out.println("Conectando...");
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        stmt = con.createStatement();
        System.out.println(con);
        System.out.println("Conectado");
    }

    public static Conexion obtenerInstancia() throws SQLException, ClassNotFoundException {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public Connection getConexion() //Permite retornar la conexion
    {
        return con;
    }

    public int CerrarConexion() {
        try {
            con.close();
            return 0;
        } catch (Exception exc) {
            System.out.println("Error al cerrar la conexion: " + " : " + exc);
            return -1;
        }
    }

    public void close() {
        try {
            if (con != null) {
                stmt.close();
                con.close();
                con = null;
            }
        } catch (SQLException sqe) {
            System.out.println("Unexpected exception : "
                    + sqe.toString() + ", sqlstate = " + sqe.getSQLState());
            sqe.printStackTrace();
        }
    }

    public Connection conexion() {
        return con;
    }

    public Statement sentencia() {
        return stmt;
    }
}

