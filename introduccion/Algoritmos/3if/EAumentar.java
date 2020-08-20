import java.util.Scanner;

public class EAumentar {
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		// Declarar total
		int total = 0;
		
		// Leer el numero
		System.out.print("Escribe un numero: ");
		int numero = leer.nextInt();
		
		// si el numero es mayor a diez
		if (numero>10) {
			// Entonces: Hacer total = numero + 80
			total = numero + 80;
			// imprimir se le sumo 80 al numero ingresado
			System.out.println("Se le sumo 80 al numero ingresado");
		} else {
			// Si no: Hacer total = numero - 5
			total = numero - 5;
			// imprimir al numero ingresado se le resto 5
			System.out.println("Al numero ingresado se le resto 5");
		}
		
		//  imprimir total
		System.out.println(total);
	}
}