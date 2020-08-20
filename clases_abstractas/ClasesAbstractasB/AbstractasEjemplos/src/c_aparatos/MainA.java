
package c_aparatos;

import java.util.ArrayList;

/**
 *
 * @author Abi
 */

public class MainA {
    public static void main(String[] args) {
        
        /* Crear un arraylist de aparatos */
        ArrayList<Aparato> listaAparatos = new ArrayList<>();
        
        /* Crear los aparatos */
        Laptop lap1 = new Laptop();
        lap1.setDescripcion("Laptop DELL");
        
        Laptop lap2 = new Laptop();
        lap2.setDescripcion("Laptop TOSHIBA");
        
        Lavadora lavadoraA = new Lavadora();
        lavadoraA.setDescripcion("Lavadora DAEWOOD");
        
        Lavadora lavadoraB = new Lavadora();
        lavadoraB.setDescripcion("Lavadora GENERAL ELECTRIC");
        
        /* Agregar los aparatos a la lista */
        listaAparatos.add(lap1);
        listaAparatos.add(lap2);
        listaAparatos.add(lavadoraA);
        listaAparatos.add(lavadoraB);
        
        /* Hacer funcionar a los aparatos */
        for (Aparato aparato : listaAparatos) {
            aparato.funcionar();
        }
                
    }
}
