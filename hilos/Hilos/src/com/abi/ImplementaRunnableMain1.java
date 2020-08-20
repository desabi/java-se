
package com.abi;

import java.util.Scanner;

public class ImplementaRunnableMain1 {

    public static void main(String[] args) {
        
        ImplementarRunnable hiloHijo = new ImplementarRunnable();
        hiloHijo.iniciarHilo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = leer.next();
        System.out.println("Hola: " + nombre);
    }
}
