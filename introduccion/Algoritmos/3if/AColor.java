import java.util.Scanner;

public class AColor{
	public static void main(String[] args){
		
		Scanner leer = new Scanner(System.in);
		
		// Ingresar el nombre del color:
		System.out.print("Ingresa el nombre del color: ");
		String color = leer.nextLine();

		// si el color ingresado es blanco
		if (color.equals("blanco")) {
			// Entonces -> imprimir color encontrado.
			System.out.println("Color encontrado");
		} else {
			// Si no -> imprimir color ingresado no encotrado
			System.out.println("Color ingresado no encontrado");
		}
		
	}
}