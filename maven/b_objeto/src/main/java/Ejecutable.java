import java.util.Scanner;

public class Ejecutable {
	public static void main(String[] args){
		
		Scanner leer = new Scanner(System.in);
		Persona laPersona = new Persona();
		
		System.out.print("Escribe tu nombre: ");
		laPersona.setNombre(leer.next());
		
		System.out.print("Escribe tu edad: ");
		laPersona.setEdad(leer.nextInt());
		
		System.out.print("Escribe tu estatura: ");
		laPersona.setEstatura(leer.nextDouble());
		
		System.out.println("");
		System.out.println("Tu nombre es: " + laPersona.getNombre());
		System.out.println("Tu edad es: " + laPersona.getEdad());
		System.out.println("Tu estatura es: " + laPersona.getEstatura());
		
	}
}
