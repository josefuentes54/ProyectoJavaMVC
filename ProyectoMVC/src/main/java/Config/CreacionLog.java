/*
En el contexto de programación, el "log" (registro o bitácora en español) 
se refiere a la práctica de registrar eventos, mensajes o errores relevantes 
durante la ejecución de una aplicación o sistema. El registro se guarda en un 
archivo de registro (log file) que puede ser útil para realizar seguimiento, 
diagnóstico de problemas, auditoría o análisis de la aplicación.

Los archivos de registro son especialmente útiles en entornos de producción, 
donde pueden proporcionar información valiosa sobre el estado de la aplicación, 
el flujo de ejecución, errores y excepciones, así como detalles relevantes para 
el análisis de rendimiento y optimización.

Author: Jose Ignacio Fuentes Osorio

*/

package Config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreacionLog {

    public static void errorLog(String errorMensaje) {
        doRutaMkdir(); // metodo que verifica ruta donde se creará log, sino existe crear la ruta con los directorios respectivos
        crearArchivoLog(errorMensaje); // metodo que crea el archivo de log
    }

    public static void crearArchivoLog(String errorMensaje) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat dateFormatHora = new SimpleDateFormat("HH:mm:ss");
        Date dateNow = new Date();
        String nombreArchivo = dateFormat.format(dateNow) + ".txt"; // Aqui se le asigna el nombre 
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("/opt/tomcat/bin/ProyectoMVC/Log/"+ nombreArchivo, true));
            out.write("ERROR: " + dateFormatHora.format(dateNow) + " " + errorMensaje);
            out.write("\n");
        } catch (IOException e) {
            System.out.println("[Error][CrearLog][crearArchivoLog][IOException]: " + e.getMessage());
            CreacionLog.errorLog("[CrearLog][crearArchivoLog][IOException]: " + e.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println("[Error][CrearLog][crearArchivoLog][IOException]: " + e.getMessage());
                    CreacionLog.errorLog("[CrearLog][crearArchivoLog][IOException]: " + e.getMessage());
                }
            }
        }
    }

    public static void doRutaMkdir() {
        if (!(new File("/opt/tomcat/bin/ProyectoMVC/Log/").exists())) {
            (new File("/opt/tomcat/bin/ProyectoMVC/Log/")).mkdirs();
        }
    }

}
