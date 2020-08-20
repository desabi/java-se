
package d_vehiculo;

/**
 * Autor: Abi
 * Fecha: 25/04/2016
 * Hora: 01:30:16 PM
 */

public class Main {
    public static void main(String[] args) {
        
        Avion elAvion = new Avion("abc", 950000);
        Submarino elSubmarino = new Submarino("xyz", 983000);
        
        String masCaro = elAvion.getMasCaro(elSubmarino);
        System.out.println(masCaro);
        
        String masCaro1 = elSubmarino.getMasCaro(elAvion);
        System.out.println(masCaro1);
    }
}
