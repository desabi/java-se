
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
        FabricaConcreta fabricaConcreta = new FabricaConcreta();
        
        System.out.print("Escribe el tipo de conexion: ");
        String tipo = leer.next();
        
        conexion = fabricaConcreta.crearConexion(tipo);
        
        System.out.println("Tipo de Conexion: " + conexion.getDescripcion());
    }
}
