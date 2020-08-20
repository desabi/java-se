
package Mains;

/*
 * @autor:    abi
 * @fecha:    13/08/2012
 * @hora:     01:01:28 PM
 * @proyecto: ClasesAnidadas
 * @paquete:  Mains
 * @archivo:  InternaEstatica.java
 */

class _externa{
    static class _interna{
        public void muestra(){
            System.out.println("Clase estatica");
        }
    }
}

public class InternaEstatica {
    public static void main(String[] args) {
        _externa._interna _in = new _externa._interna();
        _in.muestra();
    }

}
/* Clases internas estaticas:
 * No pueden acceder a las variables y métodos no estaticos de la
 * clase externa directamente si no a traves de un objeto
 */