import java.util.Scanner;

public class HOrdenarTexto {
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		// Leer el primer nombre:
		System.out.print("Escribe el primer nombre: ");
		String nombre1 = leer.nextLine();
		
		// Leer el segundo nombre:
		System.out.print("Escribe el segundo nombre: ");
		String nombre2 = leer.nextLine();
		
		int comparacion = nombre1.compareTo(nombre2);
		System.out.println(comparacion);
		
	}
}