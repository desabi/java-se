import java.util.Scanner;

public class DAprobadoReprobado {
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		// Leer el nombre
		System.out.print("Escribe el nombre del alumno: ");
		String nombre = leer.nextLine();
		
		// Leer la calificacion 1
		System.out.print("Escribe la calificacion 1: ");
		double calificacion1 = leer.nextDouble();
		
		// Leer la calificacion 2
		System.out.print("Escribe la calificacion 2: ");
		double calificacion2 = leer.nextDouble();
		
		// Hacer promedio = (calificacion1 + calificacion2) / 2
		double promedio = (calificacion1 + calificacion2) / 2;
		
		// imprimir el nombre 
		System.out.println(nombre);
		
		// si el promedio es mayor 0 igual a 7.0
		if (promedio>=7.0) {
			//Entonces : Imprimir has aprobado la materia, muchas felicidades
			System.out.println("Has aprobado la materia, muchas feliciades.");
		} else {
			// si no: imprimir Lamentablemente reprobaste, debes volver a cursar la materia.
			System.out.println("Lamentablemente reprobaste, debes volver a cursar la materia.");
		}
		
	}
}