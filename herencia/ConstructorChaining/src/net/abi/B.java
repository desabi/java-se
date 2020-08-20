package net.abi;

public class B extends A {
    
    public B() {    
    }
    
    /*
    B ejecuta su constructor por defecto
    
    public B(){
        super();        // llama a constructor de A
        tareas de B
    }
    
    B extiende de A, entonces primero llama al constructor por defecto de A
    A no tiene un constructor por defecto, por eso marca error
    A solo tiene un constructor parametrizado 
    */
}
