
package ejemplo_01_persona;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de las clases */
        Persona laPersona = new Persona();
        Direccion laDireccion = new Direccion();
        
        /* 2do: Colocar datos a las instancias */
        
        /* Datos para lapersona */
        laPersona.setNombre("Abi");
        laPersona.setEdad(29);
        
        /* Datos laDireccion */
        laDireccion.setCiudad("Tlapa");
        laDireccion.setColonia("Tepeyac");
        
        /* 3ro: Imprimir los datos */
        laPersona.imprimir();
        laPersona.imprimirDireccion(laDireccion);
        
    }
}
