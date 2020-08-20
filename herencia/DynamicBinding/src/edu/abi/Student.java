package edu.abi;

/**
 *
 * @author abi
 */
public class Student extends Person {
    
    /* Este metodo sobre escribe el metodo getInfo() de la superclase Person */
    @Override
    public String getInfo(){
        return "Student";
    }
    
    /* Como Student hereda de Person, tambien puede llamar al metodo printPerson() */
    /* printPerson() llama al metodo getInfo() */
    /* Cuando se llame a este metodo, imprimira Student */
    
//    public void printPerson(){
//        System.out.println(getInfo());
//    }
    
//    public void printPerson() {
            /* se supone que debe llamar al metodo que esta en la superclase
               pero aun asi imprime lo que esta en la subclase. 
               ¿sera porque el metodo getinfo de la superclase es sobre escrito
               por la subclase? */
//        super.printPerson();
//    }
    
    
    
    
    
}
