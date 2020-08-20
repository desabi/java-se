package edua;

/**
 *
 * @author abi
 */
public class Main {

    /* Interface como parametro de un metodo */
    public void show(MyInterface myInterface) {
        myInterface.display();
    }
    
    public static void main(String[] args) {
        
        Main ob = new Main();
        
        /* Se crea la clase anonima en un argumento
           de un metodo */
        ob.show(new MyInterface() {
            @Override
            public void display() {
                System.out.println("Hello");
            }
        });
        
    }
}
