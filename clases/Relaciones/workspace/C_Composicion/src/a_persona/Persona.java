package a_persona;

public class Persona {
	
	private final NombreCompleto elNombreCompleto;
	private int edad;
	
	public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad) {
		elNombreCompleto = new NombreCompleto(nombre, apellidoPaterno, apellidoMaterno);
		this.edad = edad;
	}
	
	public void imprimir() {
		System.out.println("## DATOS DE LA PERSONA ##");
		elNombreCompleto.imprimir();
		System.out.println("Edad: " + edad);
	}
}
