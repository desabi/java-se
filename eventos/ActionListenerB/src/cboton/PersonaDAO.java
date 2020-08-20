
package cboton;

/**
 *
 * @author Abi
 */
public class PersonaDAO {
    
    public void insertar(Persona laPersona) {
        String nombre = laPersona.getNombre();
        int edad = laPersona.getEdad();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    public void eliminar(){
        
    }
    
    public void actualizar() {
        
    }
}
