package com.abi;

public class Employee extends Person {
    
    // constructor por defecto
    public Employee() {
        // llama al constructor parametrizado 
        this("2 Invoke Employee overloaded constructor.");
        System.out.println("3 Performs Employee's task");
    }
    
    // constructor parametrizado
    public Employee(String s) {
        System.out.println(s);        
    }
}
