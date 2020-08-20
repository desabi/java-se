
package ejemplo_04_maestro;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de las clases */
        Materia laMateria = new Materia();
        Maestro elMaestro = new Maestro();
        
        /* 2do: Colocar datos a las instancias */
        laMateria.setNombre("Matematicas");
        laMateria.setHoras(80);
        
        elMaestro.setNombre("abi de sa");        
        /* Colocar materia al maestro */
        elMaestro.setLaMateria(laMateria);
        
        /* 3ro: Imprimir los datos */
        elMaestro.imprimir();
        
    }
}
