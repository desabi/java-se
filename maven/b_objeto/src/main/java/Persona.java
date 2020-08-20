public class Persona {
	
	private String nombre;
	private int edad;
	private double estatura;
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public void setEstatura(double estatura){
		this.estatura = estatura;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public double getEstatura() {
		return this.estatura;
	}
}
