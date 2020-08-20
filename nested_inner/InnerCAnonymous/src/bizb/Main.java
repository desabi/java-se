package bizb;

/**
 *
 * @author abi
 */
public class Main {

    public static void main(String[] args) {

        /* El codigo de la SubClase se puede omitir
           y se puede crear una clase anonima */
        SuperClass ob = new SuperClass() {
            /* Se sobre escribe el metodo display() 
               de la super clase */
            @Override
            public void display() {
                System.out.println("In Anonymous display() ");
            }

        };

        /* llama al display de la clase anonima */
        ob.display();
    }
}
