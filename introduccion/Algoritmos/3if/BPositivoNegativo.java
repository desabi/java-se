import java.util.Scanner;

class BPositivoNegativo {
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		// Leer el numero
		System.out.print("Escribe un numero: ");
		int numero = leer.nextInt();
		
		// Si el numero es mayor a cero
		if (numero>0) {
			// Entonces: imprimir el numero ingresado es positivo
			System.out.println("EL numero ingresado es positivo.");
		}else{
			// Si no: imprimir el numero es negativo
			System.out.println("El numero es negativo.");
		}
		
	}
}