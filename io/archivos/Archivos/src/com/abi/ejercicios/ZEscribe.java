
package com.abi.ejercicios;

import java.util.Scanner;

/**
 * @author   Abi
 * @proyecto Archivos
 * @archivo  Lector.java
 * @fecha    23/06/2014 12:03:32 PM
 */

public class ZEscribe {
    
    public static String cadena(){
        Scanner lee = new Scanner(System.in);
        System.out.print("Escribe el texto: ");
        String texto = lee.nextLine();
        return texto;
        
    }
}
