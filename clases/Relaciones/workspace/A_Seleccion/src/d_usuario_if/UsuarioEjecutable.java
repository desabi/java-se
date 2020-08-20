package d_usuario_if;

public class UsuarioEjecutable {
	public static void main(String[] args) {
		
		Usuario elUsuario = new Usuario();
		
		elUsuario.setNombre("ABI DS");
		elUsuario.setContrasena("124");
		
		elUsuario.iniciarSesion();
	}	
}
