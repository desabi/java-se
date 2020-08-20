
package Mains;

/*
 * @autor:    abi
 * @fecha:    13/08/2012
 * @hora:     11:56:24 AM
 * @proyecto: ClasesAnidadas
 * @paquete:  Mains
 * @archivo:  StaticNestedClass.java
 */

class ExteriorEsatico{
    
    private int x = 10;   
    void prueba(){
        AnidadaEstatica obAni = new AnidadaEstatica();
        obAni.mostrar();
    }
    
    static class AnidadaEstatica{       
        int y = 30;
        int z = 20;
        void mostrar(){
            System.out.println("Ver z: " + z);
            System.out.println("Ver y: " + y);
            ExteriorEsatico obExt = new ExteriorEsatico();
            System.out.println("Ver x: " + obExt.x);
        }
    }
}

public class StaticNestedClass {

    public static void main(String[] args) {
        ExteriorEsatico exterior = new ExteriorEsatico();
        exterior.prueba();
    }

}