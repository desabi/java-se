
package classes;

import java.util.ArrayList;

public class BoxingC {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add(11);
        lista.add(34);
        lista.add(45);
        
        for(int posicion=0; posicion <lista.size(); posicion++){
            /*
             * Cuando el valor esta envuelto en una clase generica, tenemos que
             * explicitar la clase wrapper que queremos utilizar para el unboxing
             * (Para evitar esto se utilizan genericos).
             */
            int valor = (Integer) lista.get(posicion);
            //int valor = (int) lista.get(posicion);
            System.out.printf("Lista(%d) = %d \n", posicion, valor);
        }
    }
}
