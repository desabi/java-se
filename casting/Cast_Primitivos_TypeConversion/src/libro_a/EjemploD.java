package libro_a;

/**
 *
 * @author abi
 */
public class EjemploD {

    public static void main(String[] args) {

        int a = 10;
        int b = 4;

        // division entera
        // a y b son int
        double r1 = a / b;

        /* 10 entre 4 = 2.5 */
        /* la siguiente linea imprime 2 */
        System.out.println("r1 = " + r1);

        // para que salga el valor correcto
        // a o b debe convertirse a doble
        
        double r2 = (double) a / b;
        /* La siguiente linea imprime 2.5 */
        System.out.println("r2 = " + r2);
        
        
    }
}
