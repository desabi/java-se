
package ejemplo_04_maestro;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de las clases*/
        Maestro elMaestro = new Maestro();
        Materia laMateria = new Materia();
        
        /* 2do: Colocar datos a las instancias */
        elMaestro.setNombre("ABIDESA");
        
        laMateria.setNombre("Simulacion");
        laMateria.setHoras(4);
        
        /* 3ro: Imprimir los datos */
        elMaestro.imprimir();
        elMaestro.imprimirMateria(laMateria);
        
    }
}
