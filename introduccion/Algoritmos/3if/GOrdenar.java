import java.util.Scanner;

public class GOrdenar {
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		// Leer el primer numero
		System.out.print("Escribe el primer numero: ");
		int primerNumero = leer.nextInt();
		
		// Leer el segundo numero
		System.out.print("Escribe el segundo numero: ");
		int segundoNumero = leer.nextInt();
		
		// imprimir los numeros ordenados
		System.out.println("Los numeros ordenados: ");
		
		// Si el primer numero es mayor al segundo
		if (primerNumero>segundoNumero) {
			// Entonces: imprimir primerNumero
			System.out.println(primerNumero);
			// Imrpimir segundoNumero
			System.out.println(segundoNumero);
		} else {
			// Si no: imprimir segundoNumero
			System.out.println(segundoNumero);
			// imprimir primerNumero
			System.out.println(primerNumero);
		}
		
	}
}