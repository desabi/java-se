package comb;

/**
 *
 * @author abi
 */
public class Main {

    public static void main(String[] args) {

        /* Se crea una instancia de la Interface
           y no marcara error porque estamos i
           implementando el metodo dentro de la 
           clase anonima */
        MyInterface ob = new MyInterface() {
            /* Se sobre escribe el metodo show() 
               de MyIterface */
            @Override
            public void show() {
                System.out.println("Hello!");
            }
        };

        ob.show();
    }
}
