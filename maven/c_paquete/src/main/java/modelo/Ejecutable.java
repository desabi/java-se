package modelo;

import java.util.Scanner;

public class Ejecutable {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		Producto elProducto;
		
		System.out.println("### PRODUCTO ###");
		System.out.print("Escribe el nombre: ");
		String nombre = leer.next();
		System.out.print("Escribe el precio: ");
		double precio = leer.nextDouble();
	
		elProducto = new Producto(nombre, precio);
		
		System.out.println(""); 
		System.out.println("### DATOS DEL PRODUCTO");
		System.out.println("El nombre es: " + elProducto.getNombre());
		System.out.println("El precio es: " + elProducto.getPrecio());
		
	}
}
