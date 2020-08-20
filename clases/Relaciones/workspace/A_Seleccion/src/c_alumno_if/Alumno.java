package c_alumno_if;

/**
 * @author abi
 *
 */
public class Alumno {

	private String nombre;
	private double calificacion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		if ( (calificacion<0) || (calificacion>10)) {
			System.out.println("## ERROR AL ASIGNAR LA CALIFICACION ##");
			System.out.println("La calificacion: " + calificacion + " no es valida");
			System.out.println(" Asigna otra");
			System.out.println();
		} else {
			this.calificacion = calificacion;
		}		
	}
	
	public void imprimir() {
		System.out.println(" ## DATOS DEL ESTUDIANTE ## ");
		System.out.println("El nombre: " + nombre);
		System.out.println("La calificacion: " + calificacion);
		System.out.println();
	}

}
