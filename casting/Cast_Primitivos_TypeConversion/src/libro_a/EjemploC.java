package libro_a;

/**
 *
 * @author abi
 */
public class EjemploC {
    public static void main(String[] args) {
        
        /* Valor pequeno */
        int pequeno;
        
        /* valor grande */
        double grande = 4.87;
        
        /* cast */
        /* Retorna el valor de grande (4.87) convertido a int (4) */
        pequeno = (int) grande;
        
        /* La siguiente linea imprime: 4 */
        System.out.println("pequeno = " + pequeno);
        
        /* la siguiente linea imprime: 4.87*/
        System.out.println("grande = " + grande);
        
    }
}
