
import java.util.Scanner;

class DOperarNumero {
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in);
		
		// Hacer resultado = 0
		int resultado = 0;
		
		//Imprimir "escribe un numero"
		System.out.print("Escribe un numero: ");
		// Leer numero
		int numero = leer.nextInt();
		
		// Imprimir MENU
		System.out.println("     MENU  ");
		System.out.println("1. sumar 10 al numero le�do.");
		System.out.println("2. Multiplicar por 10 al numero le�do.");
		
		// Imprimir "Escribe una opcion (1 o 2)"
		System.out.print("Escribe una opcion (1 o 2): ");
		// Leer opcion
		int opcion = leer.nextInt();
		
		// En caso de opcion
		switch(opcion){
			case 1:
				// Imprimir "Se va sumar 10 al numero le�do"
				// Hacer resultado = numero + 10
				System.out.println("Se va sumar 10 al numero le�do");
				resultado = numero + 10;
				break;
			case 2:
				// Hacer resultado = numero * 8
				// Imprimir "Se multiplico por 8 el numero leido"
				resultado = numero * 8;
				System.out.println("Se multiplico por 8 el numero le�do");
				break;
			default:
				// Imprmir "OPCION NO V�LIDA"
				System.out.println("OPCI�N NO VALIDA");
		}
		
		// Imprimir resultado
		System.out.println(resultado);
		
		
	}
}
