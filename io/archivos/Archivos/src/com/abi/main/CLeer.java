
package com.abi.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  GLeer.java
 * @fecha    23/06/2014 01:43:09 PM
 */

public class CLeer {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream archivo = new FileInputStream("C:\\reportes\\data.doc");
            int letra = archivo.read();
            
            while(letra != -1){
                System.out.print((char)letra);
                letra = archivo.read();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir el archivo: " + e);
        }
    }
}
