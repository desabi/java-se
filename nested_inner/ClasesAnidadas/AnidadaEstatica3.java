
package Principal;

/*
 * @autor:    abi
 * @fecha:    13/08/2012
 * @hora:     02:40:29 PM
 * @proyecto: AnidadasEstaticas
 * @paquete:  Principal
 * @archivo:  AnidadaEstatica3.java
 */

class Externa4{
    static double tasa = 1.16;
    
    static class Interna4{
        public double CalculoNeto(double precio){
            return precio * tasa;
        }
    }
}

public class AnidadaEstatica3 {
    public static void main(String[] args) {
        Externa4.Interna4 c;
        c = new Externa4.Interna4();
        double CalculoNeto = c.CalculoNeto(45343.800);
        System.out.println(CalculoNeto);
    }
}
