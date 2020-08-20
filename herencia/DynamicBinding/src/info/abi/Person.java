package info.abi;

/**
 *
 * @author abi
 */
public class Person {
    
    /*
    El metodo esa definindo como private, solo es accesible dentro de la misma clase
    */
    private String getInfo() {
        return "Person";
    }
    
    /* Este metodo es publico y accede al metodo privado getInfo */
    /* Este metodo puede ser llamado desde otra clase y accedera al metodo privado */
    /* Imprimiendo Person */
    public void printPerson() {
        System.out.println(getInfo());
    }
    
}
