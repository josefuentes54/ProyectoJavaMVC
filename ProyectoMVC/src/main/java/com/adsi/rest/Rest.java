/*

Author     : Jose Ignacio Fuentes Osorio
*/
package com.adsi.rest;

import DAO.FuncionarioDAO;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;
import javax.ws.rs.PathParam;
import Model.FuncionarioModel;

@Path("/rest")
public class Rest {
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/get/{rut_funcionario}") // Parámetro en la ruta
    public String get(@PathParam("rut_funcionario") int rut_funcionario) {
    System.out.println("entra a get");
    // Crear un objeto Java que deseas convertir a JSON
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    FuncionarioModel funcionario = (FuncionarioModel) funcionarioDAO.obtenerFuncionario(rut_funcionario);

    // Convertir el objeto Java a JSON utilizando Gson
    Gson gson = new Gson();
    String json = gson.toJson(funcionario);

    // Devolver el JSON resultante
    return json;
        //http://localhost:8080/demoRest/api/rest/get/rut (<-- asi se ejecuta, el rut que esta en la base de datos)
        //http://localhost:8080/ProyectoMVC/api/rest/get/999
    }
}