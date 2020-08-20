package info.abi;

/**
 *
 * @author abi
 */
public class Student extends Person {
    
    /* Este metodo es privado, solo es accesible dentro de la clase */
    /* No sobre escribe al metodo de la superclase */
    
    private String getInfo(){
        return "Student";
    }
    
    /* Cuando se llama al metodo printPersona, llama al que esta en la superclase */
    /* Ya qu el metodo getInfo de la subclase no sobre escribe al metodo getInfo de
       la superclase. */
    
    /*
    public void printPerson() {
        System.out.println(getInfo());
    }
    */
}
