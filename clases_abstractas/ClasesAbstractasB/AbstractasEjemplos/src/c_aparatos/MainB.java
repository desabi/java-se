
package c_aparatos;

/**
 *
 * @author Abi
 */

public class MainB {
    public static void main(String[] args) {
        
        /* Crear un arreglo de aparatos */
        Aparato[] aparatos = new Aparato[4];
        
        /* Crear los aparatos y asignarles datos */        
        aparatos[0] = new Laptop();
        aparatos[0].setDescripcion("Laptop HP");
        
        aparatos[1] = new Lavadora();
        aparatos[1].setDescripcion("Lavadora LG");
        
        aparatos[2] = new Laptop();
        aparatos[2].setDescripcion("Laptop Toshiba");
        
        aparatos[3] = new Lavadora();
        aparatos[3].setDescripcion("Lavadora Wirlpool");
        
        /* Hacer funcionar a los aparatos que estan en el arreglo */
        for (int i = 0; i < aparatos.length; i++) {
            aparatos[i].funcionar();
        }
        
        /* Otra manera */
        /*for (Aparato aparato : aparatos) {
            aparato.funcionar();
        }*/
        
    }
}
