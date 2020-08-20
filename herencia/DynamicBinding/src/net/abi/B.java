package net.abi;

/**
 *
 * @author abi
 */
public class B extends A{
    /* ¿Sera asi ?*/
    
    /* Java crea un constructor por defecto */
    
    /*
    public B() {
        super(); // llama al constructor por defecto de la superclase A
                 // imprime A's constructor is invoked.
    }
    */
    
    /* Y luego llama al constructor parametrizado
       e imprime B's constructor is invoked */
    
    public B(int t){
        System.out.println("B's constructor is invoked");
    }
    
    /* el libro dice:  Is the no-arg constructor of Object invoked when new B(3) is invoked?*/
}
