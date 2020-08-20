
package a_conexiones;

import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Conexion conexion;
        Fabrica fabrica;
        
        System.out.print("Escribe el tipo de conexion: ");
        String tipo = leer.next();
        
        fabrica = new Fabrica(tipo);
        conexion = fabrica.crearConexion();
        
        System.out.println("Tipo de conexion: " + conexion.getDescripcion());
        
        
        
    }
}
