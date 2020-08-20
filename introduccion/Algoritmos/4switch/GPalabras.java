
import java.util.Scanner;

class GPalabras {
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Escribe una palabra (animal, color, fruta): ");
		String palabra = leer.nextLine();
		
		switch(palabra){
			
			case "ANIMAL":
			case "animal":
				System.out.println("Pangolin, basilisco");
				break;
				
			case "COLOR":
			case "color":
				System.out.println("Rojo, Azul");
				System.out.println("Verde, Naranja");
				break;
				
			case "fruta":
				System.out.println("Mango, Mandarina, durazno");
				break;
				
			default:
				System.out.println("Palabra no encontrada");
		}
	}
}