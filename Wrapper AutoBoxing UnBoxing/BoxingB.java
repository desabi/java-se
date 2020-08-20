
package classes;


public class BoxingB {
    public static void main(String[] args) {
        // UNBOXING: convierte un objeto en un valor primitivo
        
        /*
         * Cuando el valor esta envuelto en una clase generica, tenemos que
         * explicitar la clase wrapper que queremos utilizar para el unboxing
         */
        
        Object objeto = 8;
        
        /*unboxing automatico */
        int a = (Integer) objeto;
        
        int i = (int) objeto;
    }
}
