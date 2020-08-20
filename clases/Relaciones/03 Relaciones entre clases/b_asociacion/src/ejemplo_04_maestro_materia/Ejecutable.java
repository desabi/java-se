
package ejemplo_04_maestro_materia;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de las clases */
        Maestro elMaestro = new Maestro();
        Materia laMateria = new Materia();
        
        /* 2do: Colocar datos a las instancias */
        elMaestro.setNombre("ABI DESA");
        
        laMateria.setNombre("Algebra");
        laMateria.setHoras(5);
        
        /* 3ro: Imprimir los datos */
        elMaestro.imprimir();
        laMateria.imprimir();
    }
}
