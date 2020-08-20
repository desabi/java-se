package b_banco_empleado;

public class Ejecutable {
	public static void main(String[] args) {
		
		Banco elBanco = new Banco();
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado();
		
		elBanco.setNombre("HSBC");
		elBanco.setDireccion("Tlapa, Centro No 34");
		
		empleado1.setNombre("Luis");
		empleado1.setIdentificador(23);
		
		empleado2.setNombre("Ana");
		empleado2.setIdentificador(87);
		
		System.out.println(elBanco.toString());
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
	}
}
