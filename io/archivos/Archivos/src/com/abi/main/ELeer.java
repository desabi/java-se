
package com.abi.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  ELeer.java
 * @fecha    12/08/2014 07:00:17 PM
 */

public class ELeer {
    public static void main(String[] args) {
        try {
            File archivo = new File("C:\\reportes\\mifile.txt");
            FileReader fr = new FileReader(archivo);
            
            BufferedReader lector = new BufferedReader(fr);
            
            String linea;
            while((linea = lector.readLine()) != null){
                System.out.println(linea);
            }
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo." + e);
        }
    }
}
