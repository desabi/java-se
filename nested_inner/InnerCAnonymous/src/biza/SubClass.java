package biza;

/**
 *
 * @author abi
 */
public class SubClass extends SuperClass {

    /* El unico proposito de esta Sub Clase es sobre 
       escribir el metodo display() de la Super Clase */
    @Override
    public void display() {
        System.out.println("In SubClass display()");
    }
}
