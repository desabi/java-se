
package com.abi.ejercicios;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  Escribir0.java
 * @fecha    23/06/2014 12:05:51 PM
 */

public class ZEscribeMain {
    public static void main(String[] args) {
        
        try {
            FileWriter archivo = new FileWriter("C:\\reportes\\file.txt");
            
            String cadena = ZEscribe.cadena();
            archivo.write(cadena);
            
            archivo.close();
        } catch (IOException e) {
            
        }
    }
}
