package c_instituto_carreras;

public class Carrera {

	private String nombre;
	private int anios;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnios() {
		return anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}

	public void imprimir() {
		System.out.println("## DATOS DE LA CARRERA ##");
		System.out.println("Nombre: " + nombre);
		System.out.println("A�os de duracion: " + anios);
		System.out.println("");
	}
}
