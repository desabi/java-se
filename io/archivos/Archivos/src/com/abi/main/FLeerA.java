
package com.abi.main;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  FLeerA.java
 * @fecha    12/08/2014 08:30:31 PM
 */

public class FLeerA {
    public static void main(String[] args) {
        
        try {
            FileInputStream archivo = new FileInputStream("C:\\reportes\\miarchivo.doc");
            BufferedInputStream input = new BufferedInputStream(archivo);
            DataInputStream data = new DataInputStream(input);
            
            try {
                while(data.available() != 0){
                    //System.out.println(data.readLine());
                    System.out.print((char)data.read());
                }
            } catch (IOException e) {
                System.out.println("IOesception");
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound"+e);
        }
    }

}
