
package modelo;

/**
 *
 * @author Abi
 */
public class PersonaDAO {
    
    public String imprimir(PersonaDTO laPersonaDTO) {
        String nombre = laPersonaDTO.getNombre();
        int edad = laPersonaDTO.getEdad();
        double estatura = laPersonaDTO.getEstatura();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    
        return nombre + edad + estatura;
    }
    
}
