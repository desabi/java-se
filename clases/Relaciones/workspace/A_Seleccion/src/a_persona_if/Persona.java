package a_persona_if;

/**
 * @author abi
 *
 */
public class Persona {

	private String nombre;
	private int edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void imprimir() {
		System.out.println(" ## DATOS DE LA PERSONA ## ");
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);

		if (edad >= 18) {
			System.out.println("Eres mayor de edad.");
		} else {
			System.out.println("Eres menor de edad. ");
		}

	}
}