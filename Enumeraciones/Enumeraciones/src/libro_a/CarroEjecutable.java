package libro_a;

/**
 *
 * @author abi
 */
public class CarroEjecutable {
    public static void main(String[] args) {
        
        Carro miCarro = new Carro(CarroTipo.PORSCHE, CarroColor.AZUL, 1_500_000);
        
        System.out.println(miCarro);
    }
}
