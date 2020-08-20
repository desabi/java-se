
package com.abi.ejercicios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  EscribeWrite.java
 * @fecha    24/06/2014 12:30:13 PM
 */

public class EscribeWrite {
    public static void main(String[] args) throws IOException {
        
        try {
            FileOutputStream archivo = new FileOutputStream("C:\\reportes\\test.txt");
            
            byte datos[] = new byte[] {65, 66, 67, 68, 69};
            
            archivo.write(datos);
            
        } catch (FileNotFoundException e) {
            System.out.println("Error al escribir en el archivo: " + e);
        }
    }
}
