
package com.abi.main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  FLeer.java
 * @fecha    12/08/2014 07:45:06 PM
 */

public class FLeer {
    public static void main(String[] args) {
    
        try {
            
            FileInputStream archivo = new FileInputStream("C:\\reportes\\miarchivo.doc");
            BufferedInputStream entrada = new BufferedInputStream(archivo);
            int letra = entrada.read();
            
            while(letra != -1){
                System.out.print((char)letra);
                letra = entrada.read();
            }
            entrada.close();
            archivo.close();
        } catch (IOException e) {
            
        }
    }
}
