import java.util.Scanner;

class CMayoriaEdad {
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		// Leer el nombre
		System.out.print("Escribe tu nombre: ");
		String nombre = leer.nextLine();
		
		// Leer la edad
		System.out.print("Escribe tu edad: ");
		int edad = leer.nextInt();
		
		// imprimir el nombre
		System.out.println(nombre);
		
		// si la edad es mayor o igual a 18
		if (edad>=18) {
			//Entonces: imprimir edad
			System.out.println(edad);
			// Imprimir eres mayor de edad
			System.out.println("Eres mayor de edad.");
		} else {
			// Si no: imprimir edad
			System.out.println(edad);
			// imprimir Aún eres menor de edad
			System.out.println("Aun eres menor de edad");
		}
	}
}