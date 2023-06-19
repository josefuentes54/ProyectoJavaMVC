/*

En el método testAgregarCliente(), se crea un objeto ClienteModel con datos de prueba y 
se llama al método agregarCliente() del objeto ClienteDAO para agregar el cliente en la base de datos.

En el método testListarClientes(), se llama al método listarClientes() del objeto ClienteDAO 
para obtener una lista de clientes y se verifica que el resultado no sea nulo.

En el método testEliminarCliente(), se define el rut de un cliente a eliminar, se crea una instancia 
del ClienteDAO y se llama al método eliminarCliente() con el rut del cliente para eliminarlo de la base de datos.

Author     : Jose Ignacio Fuentes Osorio
*/
package DAO;

import Model.ClienteModel;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ClienteDAOTest {
    
    public ClienteDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarCliente method, of class ClienteDAO.
     */
    public void testAgregarCliente() {
        System.out.println("agregarCliente");

        // Crear un objeto ClienteModel con datos de prueba
        ClienteModel cliente = new ClienteModel();
        cliente.setRut_cliente(12345678);
        cliente.setNombre_cliente("Juan");
        cliente.setApellido_cliente("Pérez");
        cliente.setDireccion_cliente("Calle Principal 123");
        cliente.setTelefono_cliente(987654321);
        cliente.setNombre_mascota_cliente("Toby");
        cliente.setTipo_mascota_cliente("Perro");
        cliente.setFecha_reserva_cliente("2023-06-15");
        cliente.setNombre_emergencia_cliente("María");
        cliente.setTelefono_emergencia_cliente(123456789);
    
        ClienteDAO instance = new ClienteDAO();
    
        instance.agregarCliente(cliente);
    }
    
    @Test
    public void testListarClientes() {
        System.out.println("listarClientes");   
        ClienteDAO instance = new ClienteDAO();    
        List<ClienteModel> result = instance.listarClientes();   
        assertNotNull(result);
    }

    /**
     * Test of eliminarCliente method, of class ClienteDAO.
     */
    @Test
    public void testEliminarCliente() {
        System.out.println("eliminarCliente");

        // Definir el rut del cliente que se desea eliminar
        int rut_cliente = 12345678;

        // Crear una instancia del ClienteDAO
        ClienteDAO instance = new ClienteDAO();

        // Llamar al método eliminarCliente con el rut del cliente
        instance.eliminarCliente(rut_cliente);
    }
}

 