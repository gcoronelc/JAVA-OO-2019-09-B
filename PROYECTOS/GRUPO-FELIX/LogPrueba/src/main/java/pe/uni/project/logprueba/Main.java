/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.project.logprueba;
import java.io.IOException;
import java.util.logging.*;
import pe.uni.project.view.PedidoView2;
/**
 *
 * @author SAMUEL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static final Logger LOGR = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    
    private static void setupLogger() {
        LogManager.getLogManager().reset(); //colocamos los handler en null
        LOGR.setLevel(Level.ALL); //se coloca el nivel del log
        
        //ConsoleHandler
        FormatoLog formato = new FormatoLog();
        ConsoleHandler ch = new ConsoleHandler();
        ch.setFormatter(formato);
        ch.setLevel(Level.FINE); //se coloca el nivel del log del handler
        LOGR.addHandler(ch);
        
        //FileHandler
        try {
            FileHandler fh = new FileHandler("LogPrueba.txt", false); //sobreescribe el log
            fh.setLevel(Level.FINE);
            fh.setFormatter(formato);
            LOGR.addHandler(fh);    
        } catch (IOException e) {
            LOGR.log(Level.SEVERE, "File logger not working.",e);
        }
    }
    
    public static void main(String[] args) {
        
        setupLogger();
        PedidoView2 view2 = new PedidoView2();
	LOGR.info("Aplicacion iniciada"+"\r\n");
        view2.setVisible(true);
        
        /*try {
            throw new java.io.IOException("No se pudo leer el archivo log");
        } catch (java.io.IOException e) {
            LOGR.log(Level.SEVERE, "File logger not working.",e);
        } */       
    }
}

class Test {
    
    private static final Logger LOGR = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    
    static void test () {
        LOGR.info("Estoy en otra clase");
    }
}

