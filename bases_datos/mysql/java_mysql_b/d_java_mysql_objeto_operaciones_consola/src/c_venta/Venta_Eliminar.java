
package c_venta;

import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Venta_Eliminar {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear la instancia de las clases */
        Scanner leer = new Scanner(System.in);
        Venta laVenta = new Venta();
        
        /* 2do: Pedir los datos */
        /* 3ro: Colocar los datos a la instancia laVenta */
        System.out.print("Escribe el id de la venta a eliminar: ");
        laVenta.setIdVenta(leer.nextInt());
        
        /* 4to: Eliminar */
        laVenta.eliminar();
    }
}
