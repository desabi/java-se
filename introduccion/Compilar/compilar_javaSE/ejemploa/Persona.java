
package com;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona(){
		
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getEdad(){
		return this.edad;
	}
	
	public void imprimirDatos(){
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Edad: " + this.getEdad());
	}
}