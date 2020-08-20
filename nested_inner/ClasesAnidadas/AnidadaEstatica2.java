
package Principal;



/*
 * @autor:    abi
 * @fecha:    13/08/2012
 * @hora:     02:07:31 PM
 * @proyecto: AnidadasEstaticas
 * @paquete:  Principal
 * @archivo:  AnidadaEstatica2.java
 */

class Externa2{
    static class AnidadaEstatica2{
        void saludar(){
            System.out.println("Hola...");
        }
    }
}

public class AnidadaEstatica2 {
    
    static class AnidadaEstatica3{
        void saludar2(){
            System.out.println("Hi...");
        }
    }
    
    public static void main(String[] args) {
        
        Externa2.AnidadaEstatica2 n = new Externa2.AnidadaEstatica2();
        n.saludar();
        
        AnidadaEstatica3 o = new AnidadaEstatica3();
        o.saludar2();
    }
}
