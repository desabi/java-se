package a_taxi_chofer;

public class Chofer {

	private String nombre;
	private long telefono;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Chofer [nombre=" + nombre + ", telefono=" + telefono + "]";
	}

}
