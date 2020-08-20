
package com.abi.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  EEscribir.java
 * @fecha    12/08/2014 06:50:52 PM
 */

public class EEscribir {
    public static void main(String[] args) {
        
        try {
            
            File archivo = new File("C:\\reportes\\mifile.txt");
            FileWriter fw = new FileWriter(archivo);
            
            PrintWriter escribe = new PrintWriter(fw);
            
            for (int i = 0; i < 10; i++) {
                escribe.println("fila: "+i);
            }
            
            escribe.close();
            fw.close();
            
        } catch (IOException e) {
            System.out.println("Error al escribir."+e);
        }
    }
}
