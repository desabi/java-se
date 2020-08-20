package a_taxi_chofer;

public class Taxi {

	private String sitio;
	private int numero;
	private Chofer elChofer;

	public String getSitio() {
		return sitio;
	}

	public void setSitio(String sitio) {
		this.sitio = sitio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Chofer getElChofer() {
		return elChofer;
	}

	public void setElChofer(Chofer elChofer) {
		this.elChofer = elChofer;
	}
	
	public void imprimir(){
		System.out.println("## DATOS DEL TAXI ##");
		System.out.println("Sitio: " + sitio);
		System.out.println("Numero: " + numero);
		System.out.println();
		
		elChofer.imprimir();
	}
}
