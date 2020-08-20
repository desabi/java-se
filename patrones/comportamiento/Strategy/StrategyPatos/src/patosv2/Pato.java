
package patosv2;

/**
 *
 * @author Abi
 */
public abstract class Pato {
    
    public void quack() {
        System.out.println("- El pato a hecho quack");
    }
    
    public void nadar() {
        System.out.println("* El pato está nadando.");
    }
    
    public abstract void mostrar();
    
    /* agregar la caracteristica de volar */
    public abstract void volar();
    /* colocando el metodo volar en la superclase
       proporciona la habilidad de volar a todos los patos,
       incluyendo a aquellos que no deberían volar. */

}
