
package Mains;

/*
 * @autor:    abi
 * @fecha:    13/08/2012
 * @hora:     12:53:40 PM
 * @proyecto: ClasesAnidadas
 * @paquete:  Mains
 * @archivo:  InternaAnonima.java
 */

class Test{
    void imprimir(){
        System.out.println("Imprimir test");
    }
}

class Externa_{
    
    Test test2 = new Test(){  /*Define clase anonima*/
        @Override
        public void imprimir(){
            System.out.println("Imprimir clase anonima");
        }
    };
    
    void proceso(){
        test2.imprimir();
    }
}

public class InternaAnonima {

    public static void main(String[] args) {
        Externa_ oEx = new Externa_();
        oEx.proceso();
    }

}
