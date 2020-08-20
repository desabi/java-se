
import java.util.Scanner;

class EOperarDosNumeros {
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in);
		
		// Hacer resultado = 0
		int resultado = 0;
		
		//Imprimir "escribe el 1er numero"
		System.out.print("Escribe el 1er numero: ");
		// Leer numeroA
		int numeroA = leer.nextInt();
		
		//Imprimir "escribe el 2do numero"
		System.out.print("Escribe el 2do numero: ");
		// Leer numeroB
		int numeroB = leer.nextInt();
		
		// Imprimir MENU
		System.out.println("Elige una opcion");
		System.out.println("     MENU  ");
		System.out.println("1. Sumar");
		System.out.println("2. Restar.");
		System.out.println("3. Multiplicar");
		
		// Imprimir "Escribe una opcion (1, 2 o 3)"
		System.out.print("Escribe una opcion (1, 2 o 3): ");
		// Leer opcion
		int opcion = leer.nextInt();
		
		// En caso de opcion
		switch(opcion){
			case 1:
				// Hacer resultado = numeroA + B
				resultado = numeroA + numeroB;
				// Imprimir "Se hizo la suma"
				System.out.println("Se hizo la suma");			
				break;
			case 2:
				// Imprimir "Se eligió la opción 2"
				System.out.println("Se eligió la opción 2.");
				// Hacer resultado = numeroA - numeroB
				resultado = numeroA - numeroB;
				break;
			case 3:
				// Hacer resultado = numeroA * numeroB
				resultado = numeroA * numeroB;
				break;
			default:
				// Imprmir "Opcion no valida."
				System.out.println("Opcion no válida");
		}
		
		// Imprimir resultado
		System.out.println(resultado);
		
		
	}
}
