package ejemplo_06_carro;

/**
 *
 * @author abi
 */
public class Motor {

    private String marca;
    private int potencia;

    public Motor(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void trabajar() {
        System.out.println("El motor ha comenzado a trabajar");
    }
}
