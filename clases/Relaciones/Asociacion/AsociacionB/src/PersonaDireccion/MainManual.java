
package PersonaDireccion;

/**
 *
 * @author Abi
 */
public class MainManual {
    public static void main(String[] args) {
        
        /* Crear el objeto persona */
        Persona laPersona = new Persona();
        
        /* colocar datos de la persona */
        laPersona.setNombre("Abi");
        laPersona.setEdad(28);
        laPersona.setTelefono(7571002850L);
        
        /* Crear el objeto direccion */
        Direccion laDireccion = new Direccion();
        laDireccion.setCiudad("Tlapa de comonfort.");
        laDireccion.setColonia("Tepeyac.");
        laDireccion.setCalle("Pensador Mexicano.");
        laDireccion.setNumero(58);
        
        /* Colocar la direccion de la persona */        
        laPersona.setDireccion(laDireccion);
        
        laPersona.imprimirDatos();
    }
}
