
import java.util.Scanner;

class HPalabras {
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String texto = "";
		
		System.out.print("Escribe una palabra (frase o marca): ");
		String palabra = leer.nextLine();
		
		switch(palabra){
			
			case "frase":
			case "FRASE":
				texto = "El tiempo es relativo";
				break;
				
			case "MARCA":
			case "marca":
				texto = "Coca-Cola";
				break;
				
			default:
				texto = "Palabra no encontrada.";
		}
		
		System.out.println(texto);
		
	}
}