
package com.abi.main;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  FEscribir.java
 * @fecha    12/08/2014 07:21:19 PM
 */

public class FEscribir {
    public static void main(String[] args) {
        
        try {
            FileOutputStream fichero = new FileOutputStream("C:\\reportes\\miarchivo.doc");
            BufferedOutputStream salida = new BufferedOutputStream(fichero);
            
            try {
                String texto = "Bienvenido...";
                salida.write(texto.getBytes());
                
                salida.close();
                fichero.close();
                
            } catch (IOException e) {
                System.out.println("ioexception"+e);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound"+e);
        }
    }
}
