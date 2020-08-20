package e_empleado_if;

public class Empleado {

	private String nombre;
	private double sueldoPorHora;
	private double horasTrabajadas;

	private double sueldo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoPorHora() {
		return sueldoPorHora;
	}

	public void setSueldoPorHora(double sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public void calcularSueldo() {
		sueldo = sueldoPorHora * horasTrabajadas;

		System.out.println(" ## SUELDO DEL EMPLEADO ## ");

		if (horasTrabajadas > 8) {
			System.out.println("El empleado trabajo horas extras");
			System.out.println("Se le da un bono de 300 pesos");
			System.out.println("Sueldo normal: " + sueldo);
			sueldo = sueldo + 300;
			System.out.println("Sueldo con bono: " + sueldo);
		} else {
			System.out.println("Sueldo: " + sueldo);
		}
		System.out.println();
	}
	
	public void imprimir() {
		System.out.println(" ## DATOS DEL TRABAJADOR ##");
		System.out.println("El nombre: " + nombre);
		System.out.println("Sueldo por hora: " + sueldoPorHora);
		System.out.println("Horas trabajadas: " + horasTrabajadas);
		System.out.println();
	}
}
