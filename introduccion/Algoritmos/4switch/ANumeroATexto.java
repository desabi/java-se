import java.util.Scanner;

class ANumeroATexto {
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//Imprimir "escribe un numero del 1 al 3"
		System.out.println("Escribe un numero del 1 al 3: ");
		// Leer numero
		int numero = leer.nextInt();
		
		// Imprimir "El numero escrito es: "
		System.out.println("El numero escrito es: ");
		
		switch(numero){
			case 1:
				// imprimir "uno"
				System.out.println("Uno");
				break;
			case 2:
				// imprimir "Dos"
				System.out.println("Dos");
				break;
			case 3:
				// imprimir "Tres"
				System.out.println("Tres");
				break;
			default:
				// imprimir "Numero no valido"
				System.out.println("Numero no valido.");
		}
		
		
	}
}
