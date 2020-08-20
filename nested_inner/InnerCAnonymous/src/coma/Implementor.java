package coma;

/**
 *
 * @author abi
 */
public class Implementor implements MyInterface {

    /* El unico proposito de la clase Implementor 
       es sobre escribir el metodo show() de la 
       MyInterface.
    
       Podemos omitir la creacion de toda esta 
       clase con una clase anonima */
    @Override
    public void show() {
        System.out.println("Hello!");
    }
    
}
