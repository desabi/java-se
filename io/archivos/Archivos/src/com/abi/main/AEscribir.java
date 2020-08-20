
package com.abi.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  ArchivoEscribir.java
 * @fecha    23/06/2014 10:50:30 AM
 */

public class AEscribir {
    public static void main(String[] args) {
        try {
            
            File archivo = new File("C:\\reportes\\archivo.txt");
            FileWriter escritor = new FileWriter(archivo);
            
            escritor.write("Hola");
            //archivo.append(System.getProperty("line.separator"));
            escritor.write("java");
            
            escritor.close();
            
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e);
        }
    }
}
