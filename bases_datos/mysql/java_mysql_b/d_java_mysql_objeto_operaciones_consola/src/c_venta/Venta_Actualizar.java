
package c_venta;

import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Venta_Actualizar {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las isntancias de los objetos */
        Scanner leer = new Scanner(System.in);
        Venta laVenta = new Venta();
        
        /* 2do: Pedir los datos */
        /* 3ro: Colocar los datos a la instancia laVenta */
        System.out.print("Escribe el id de la venta a actualizar: ");
        laVenta.setIdVenta(leer.nextInt());
        
        System.out.print("Escribe el nuevo nombre del producto: ");
        laVenta.setProducto(leer.next());
        
        System.out.print("Escribe la nueva fecha de pedido (AAAA-MM-DD): ");
        laVenta.setPedido(leer.next());
        
        System.out.print("Escribe la nueva fehca de entrega (AAAA-MM-DD): ");
        laVenta.setEntregado(leer.next());
        
        /* 4to: Actualizar*/
        laVenta.actualizar();
    }
}
