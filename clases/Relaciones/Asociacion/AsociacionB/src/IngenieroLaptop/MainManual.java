
package IngenieroLaptop;

/**
 *
 * @author Abi
 */
public class MainManual {
    public static void main(String[] args) {
        
        /* Crear el objeto Ingeniero */
        Ingeniero elIngeniero = new Ingeniero();
        
        /* colocar datos al ingeniero */
        elIngeniero.setNombre("Abi");
        elIngeniero.setEdad(28);
        
        /* Crear la laptop */
        Laptop laLap = new Laptop();
        laLap.setMarca("HP");
        laLap.setModelo(2014);
        laLap.setPrecio(7250);
        
        /* colocar la lap al ingeniero */
        elIngeniero.setLaptop(laLap);
        
        elIngeniero.imprimirDatos();
    }
}
