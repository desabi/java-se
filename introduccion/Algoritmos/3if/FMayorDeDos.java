import java.util.Scanner;

public class FMayorDeDos {
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		// Leer el primer numero
		System.out.print("Ingresa el primer numero: ");
		int primerNumero = leer.nextInt();
		
		// Leer el segundo numero
		System.out.print("Ingresa el segundo numero: ");
		int segundoNumero = leer.nextInt();
		
		// imprimir el numero mayor es:
		System.out.println("El numero mayor es: ");
		
		// Si el primer numero es mayor al segundo numero
		if (primerNumero>segundoNumero) {
			// Entonces: imprimir primerNumero
			System.out.println(primerNumero);
		} else {
			// Si no: imprimir segundoNumero
			System.out.println(segundoNumero);
		}
		
	}
}