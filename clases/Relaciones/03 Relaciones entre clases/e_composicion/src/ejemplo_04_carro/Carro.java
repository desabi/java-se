package ejemplo_04_carro;

/**
 *
 * @author abi
 */
public class Carro {

    private String marca;

    private final Motor elMotor;

    public Carro() {
        elMotor = new Motor();
        
        elMotor.setPotencia(350);
        elMotor.setCilindros(6);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void imprimir() {
        System.out.println("DATOS DEL CARRO:");
        System.out.println("Marca: " + this.marca);
        System.out.println("MOTOR");
        System.out.println("Potencia: " + elMotor.getPotencia() );
        System.out.println("Cilindros: " + elMotor.getCilindros() );
    }
}
