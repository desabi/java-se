package biz.abi;

/**
 *
 * @author abi
 */
public class Outer {

    int x = 100;

    class Inner {
        
        void display(){
            System.out.println("x = " + x);
        }
        
    }
    
    void test() {
        /* Lo objetos de la clase interna (inner)
           a menudo son creados en la clase 
           externa (outer) */
        Inner i = new Inner();
        i.display();
    }

}
