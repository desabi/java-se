package modelo;

public class Libro {
	
	private String titulo;
	private double precio;
	
	public Libro(String titulo, double precio){
		this.titulo = titulo;
		this.precio = precio;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
}
