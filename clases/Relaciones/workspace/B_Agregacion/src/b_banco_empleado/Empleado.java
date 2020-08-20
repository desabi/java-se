package b_banco_empleado;

public class Empleado {

	private String nombre;
	private String puesto;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public void imprimir() {
		System.out.println(" ## DATOS DEL EMPLEADO ##");
		System.out.println("Nombre: " + nombre);
		System.out.println("Puesto: " + puesto);
		System.out.println();
	}
}
