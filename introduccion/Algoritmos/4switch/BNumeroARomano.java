
import java.util.Scanner;

class BNumeroARomano {
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//Imprimir "escribe un numero del 1 al 4"
		System.out.println("Escribe un numero del 1 al 4: ");
		// Leer numero
		int numero = leer.nextInt();
		
		// Imprimir "El numero escrito en romano es: "
		System.out.print("El numero escrito en romano es: ");
		
		switch(numero){
			case 1:
				// imprimir "I"
				System.out.println("I");
				break;
			case 2:
				// imprimir "III"
				System.out.println("II");
				break;
			case 3:
				// imprimir "III"
				System.out.println("III");
				break;
			case 4:
				// imprimir "IV"
				System.out.println("IV");
				break;
			default:
				// imprimir "Numero fuera de rango"
				System.out.println("Numero fuera de rango.");
		}
		
		
	}
}
