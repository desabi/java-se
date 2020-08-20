
package com.abi.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  EEscribirA.java
 * @fecha    12/08/2014 08:22:21 PM
 */

public class EEscribirA {
    public static void main(String[] args) {
        try {
            File archivo = new File("C:\\reportes\\mifilea.txt");
            
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter escritor = new BufferedWriter(fw);
            PrintWriter escribe = new PrintWriter(escritor);
            
            escribe.write("Bienvenido.");
            escribe.append(" a Java");
            
            escribe.close();
            escritor.close();
            fw.close();
            
        } catch (IOException e) {
            System.out.println("Error:"+e);
        }
    }
}
