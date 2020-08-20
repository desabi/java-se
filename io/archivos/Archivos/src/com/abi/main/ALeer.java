
package com.abi.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  Leer.java
 * @fecha    23/06/2014 11:07:01 AM
 */

public class ALeer {
    public static void main(String[] args) {
        try {
            File archivo = new File("C:\\reportes\\archivo.txt");
            
            FileReader lector = new FileReader(archivo);
            int letra = lector.read();
            
            while(letra >=0 ){
                System.out.print((char)letra);
                letra = lector.read();
            }
            
            lector.close();
            
        } catch (IOException e) {
            System.out.println("Error al leer: " + e);
        }
    }
}
