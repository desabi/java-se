
package Anonimas;

/*
 * @autor:    abi
 * @fecha:    13/08/2012
 * @hora:     03:37:35 PM
 * @proyecto: AnidadasInternas
 * @paquete:  Anonimas
 * @archivo:  Anonima1.java
 */

class comida{
    void comer(){
        System.out.println("Comiendo...");
    }
}

class ClaseAnonima1{
    comida c = new comida(){
        @Override
        public void comer(){
            char s = 'r';
            System.out.println("Clase comida anonima...");
        }
    };
    
    void imprimir(){
        c.comer();
    }
}
public class Anonima1 {
    public static void main(String[] args) {
        ClaseAnonima1 ca = new ClaseAnonima1();
        ca.imprimir();
    }
}
