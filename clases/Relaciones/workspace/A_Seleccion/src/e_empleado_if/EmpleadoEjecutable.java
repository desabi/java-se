package e_empleado_if;

public class EmpleadoEjecutable {
	public static void main(String[] args) {
		
		Empleado elEmpleado = new Empleado();
		
		elEmpleado.setNombre("ABI DS");
		elEmpleado.setSueldoPorHora(150);
		elEmpleado.setHorasTrabajadas(8);
		
		elEmpleado.imprimir();
		
		elEmpleado.calcularSueldo();
		
	}
}
