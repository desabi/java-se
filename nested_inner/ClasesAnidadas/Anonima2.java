
package Anonimas;

/*
 * @autor:    abi
 * @fecha:    13/08/2012
 * @hora:     03:52:15 PM
 * @proyecto: AnidadasInternas
 * @paquete:  Anonimas
 * @archivo:  Anonima2.java
 */

class PopCorn{
    public void Pop(){
        System.out.println("PopCorn");
    }
}

class Comida{

    PopCorn p = new PopCorn(){
        @Override
        
        public void Pop(){
            
            System.out.println("Pop Anónimo");
        }
        public void sizzle(){
            System.out.println("Anónimo sizzling popcorn");
        }
    };
    
    public void popIt(){
        p.Pop();
        
    }
}

public class Anonima2 {
    public static void main(String[] args) {
        
    }
}
