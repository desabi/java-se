package b_banco_empleado;

public class Empleado {

	private String nombre;
	private int identificador;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", identificador=" + identificador + "]";
	}

}
