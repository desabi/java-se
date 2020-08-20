
package com.abi.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  FEscribir.java
 * @fecha    23/06/2014 01:34:56 PM
 */

public class CEscribir {
    public static void main(String[] args) throws IOException {
        
        try {
            FileOutputStream archivo = new FileOutputStream("C:\\reportes\\data.doc");
            
            String texto = "Buenos dias";
            texto += "Estamos programando en Java.";
            
            byte[] letras = texto.getBytes();
            
            archivo.write(letras);
            
            archivo.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al escribir: " + e);
        }
    }
}
