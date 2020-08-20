package b_carro;

public class Carro {

	private String marca;
	private int modelo;

	private final Motor elMotor;

	public Carro(String marca, int modelo, String motorMarca, int motorPotencia) {
		this.marca = marca;
		this.modelo = modelo;

		elMotor = new Motor(motorMarca, motorPotencia);
	}

	public String getMarca() {
		return marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void arrancar() {
		elMotor.trabajar();
	}

}
