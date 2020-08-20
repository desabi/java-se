
import java.util.Scanner;

class COperarNumero {
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in);
		
		// Hacer resultado = 0
		int resultado = 0;
		
		//Imprimir "escribe un numero del 1 al 3"
		System.out.print("Escribe un numero del 1 al 3: ");
		// Leer numero
		int numero = leer.nextInt();
		
		// En caso de numero
		switch(numero){
			case 1:
				// Hacer resultado = numero + 100
				resultado = numero + 100;
				break;
			case 2:
				// Hacer resultado = numero * 7
				resultado = numero * 7;
				break;
			case 3:
				// Hacer resultado = numero - 5
				resultado = numero - 5;
				break;
			default:
				// Hacer resultado = numero + 44
				resultado = numero + 44;
		}
		
		// Imprimir resultado
		System.out.println(resultado);
		
		
	}
}
