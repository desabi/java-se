
package com.abi.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  ELee.java
 * @fecha    23/06/2014 12:40:48 PM
 */

public class BLeer {
    public static void main(String[] args) throws IOException {
        try {
            FileReader archivo = new FileReader("C:\\reportes\\file.txt");
            BufferedReader lector = new BufferedReader(archivo);
            
            String linea = lector.readLine();
            
            while(linea != null){
                System.out.println(linea);
                linea = lector.readLine();
            }
  
            lector.close();
            archivo.close();
            
        } catch (FileNotFoundException e) {
        }
    }
}
