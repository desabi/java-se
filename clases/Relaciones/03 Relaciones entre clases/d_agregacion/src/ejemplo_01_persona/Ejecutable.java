
package ejemplo_01_persona;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
    
        /*1ro: Crear las instancias de los objetos */
        Persona laPersona = new Persona();
        Direccion laDireccion = new Direccion();
        
        /*2do: Colocar datos a las instancias */
        
        /* Colocar los datos a la direccion */
        laDireccion.setCiudad("Tlapa");
        laDireccion.setColonia("Tepeyac");
        
        /* Colocar los datos a la persona */
        laPersona.setNombre("ABIDS");
        laPersona.setEdad(29);
        
        /* Colocar la direccion a la persona */
        laPersona.setLaDireccion(laDireccion);
        
        /*3ro: Imprimir los datos */
        laPersona.imprimir();
        
    }
    
    
}
