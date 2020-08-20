package c_libro;

public class Capitulo {

	private String nombre;
	private int paginas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public void imprimir() {
		System.out.println("##DATOS DEL CAPITULO##");
		System.out.println("Nombre: " + nombre);
		System.out.println("Numero de paginas: " + paginas);
		System.out.println("");
	}
}
