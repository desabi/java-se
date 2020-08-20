package c_libro;

import java.util.ArrayList;

public class Libro {
	
	private String nombre;
	private double precio;
	
	private final ArrayList<Capitulo> capitulos;

	public Libro(String nombre, double precio, ArrayList<Capitulo> capitulos) {
				
		this.nombre = nombre;
		this.precio = precio;
		this.capitulos = capitulos;	
		
		capitulos = new ArrayList<>();
		capitulos.addAll(capitulos);
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public ArrayList<Capitulo> getCapitulos() {
		return capitulos;
	}
	
	public void imprimir() {
		System.out.println("## DATOS DEL LIBRO ##");
		System.out.println("Nombre: " + nombre);
		System.out.println("Precio: " + precio);
		for (Capitulo capitulo : capitulos) {
			capitulo.imprimir();
		}
	}
	
}
