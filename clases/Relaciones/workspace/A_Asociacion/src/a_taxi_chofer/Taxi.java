package a_taxi_chofer;

public class Taxi {

	public int numero;
	public String placas;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	@Override
	public String toString() {
		return "Taxi [numero=" + numero + ", placas=" + placas + "]";
	}
		
}
