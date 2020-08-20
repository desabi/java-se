package vista;

import java.util.Scanner;
import modelo.Libro;

public class Ejecutable{
	public static void main(String[] args){
		
		Scanner leer = new Scanner(System.in);
		Libro elLibro;
		
		System.out.println("=== DATOS DEL LIBRO ===");
		System.out.print("Escribe el titulo: ");
		String titulo = leer.next();
		System.out.print("Escribe el precio: ");
		double precio = leer.nextDouble();
		
		elLibro = new Libro(titulo, precio);
		
		System.out.println("=== DATOS DEL LIBRO ===");
		System.out.println("El titulo es: " + elLibro.getTitulo());
		System.out.println("El precio es: " + elLibro.getPrecio());
	}
}
