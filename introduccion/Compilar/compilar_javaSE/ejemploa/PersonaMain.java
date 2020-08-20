
package com;

import java.util.Scanner;

public class PersonaMain {
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in);
		Persona persona = new Persona();
		
		System.out.print("Escribe tu nombre: ");
		String nombre = leer.next();
		persona.setNombre(nombre);
		
		System.out.print("Escribe tu edad: ");
		int edad = leer.nextInt();
		persona.setEdad(edad);
		
		persona.imprimirDatos();
    }
}