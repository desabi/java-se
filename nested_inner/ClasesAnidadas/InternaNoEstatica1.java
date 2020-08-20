
package Mains;

/*
 * @autor:    abi
 * @fecha:    13/08/2012
 * @hora:     12:39:39 PM
 * @proyecto: ClasesAnidadas
 * @paquete:  Mains
 * @archivo:  InternaNoEstatica1.java
 */

class Externa1{

    class Interna1{
        void muestra(){
            System.out.println("Objeto Interno");
        }
    }
}
public class InternaNoEstatica1 {

    public static void main(String[] args) {
        Externa1 ex = new Externa1();
        Externa1.Interna1 in = ex.new Interna1();
        in.muestra();
    }

}
