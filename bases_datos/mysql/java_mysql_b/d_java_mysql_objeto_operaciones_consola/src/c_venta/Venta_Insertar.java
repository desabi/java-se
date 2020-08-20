
package c_venta;

import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Venta_Insertar {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de las clases */
        Scanner leer = new Scanner(System.in);
        Venta elProducto = new Venta();
        
        /* 2do: Pedir los datos */
        /* 3ro: Colocar los datos a la instancia elProducto */
        System.out.print("Escribe el nombre del producto: ");
        elProducto.setProducto(leer.next());
        
        System.out.print("Escribe la fecha de pedido (AAAA-MM-DD) : ");
        elProducto.setPedido(leer.next());
        
        System.out.print("Escribe la fecha de entgreda (AAAA-MM-DD) : ");
        elProducto.setEntregado(leer.next());
        
        /* 4to: Insertar */
        elProducto.insertar();
    }
}
