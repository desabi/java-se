package edu.abi;

public class Apple extends Fruit {
    /* 
    Since no constructor is explicitly defined in Apple, 
    Apple's default no-arg constructor is defined implicitly. 
    
    public Apple(){
        super();        // llama al constructor vacio de Fruit
    }
    
    Since Apple is a subclass of Fruit, Apple's default constructor 
    automatically invokes Fruit's no-arg constructor.
    
    However, Fruit does not have a no-arg constructor, 
    because Fruit has an explicit constructor (with String) defined. 
    Therefore, the program cannot be compiled.
    */
}
