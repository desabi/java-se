package d_usuario_if;

public class Usuario {

	private String nombre;
	private String contrasena;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public void iniciarSesion(){		
		if((nombre.equals("administrador")) && (contrasena.equals("rZ8"))){
			System.out.println(" BIENVENIDO AL SISTEMA");
		} else {
			System.out.println(" DATOS INCORRECTOS");
		}
	}
}
