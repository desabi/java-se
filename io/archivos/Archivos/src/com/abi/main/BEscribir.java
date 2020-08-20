
package com.abi.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  DEscribir.java
 * @fecha    23/06/2014 12:32:10 PM
 */

public class BEscribir {
    public static void main(String[] args) {
        try {
            FileWriter archivo =  new FileWriter("C:\\reportes\\file.txt");
            
            BufferedWriter escribe = new BufferedWriter(archivo);
            escribe.write("Hola mundo.");
            escribe.newLine();
            escribe.write("Bienvenido a java");
            
            escribe.close();
            archivo.close();
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e);
        }
    }
}
