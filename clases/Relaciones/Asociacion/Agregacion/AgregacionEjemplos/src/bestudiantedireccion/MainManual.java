
package bestudiantedireccion;

/**
 *
 * @author Abi
 */
public class MainManual {
    public static void main(String[] args) {
        
        Estudiante elEstudiante = new Estudiante();
        
        elEstudiante.setNombre("Abi");
        elEstudiante.setEdad(28);
        
        Direccion laDireccion = new Direccion();
        laDireccion.setCiudad("Tlapa de comonfort");
        laDireccion.setColonia("Tepeyac");
        laDireccion.setCalle("Pensador Mexicano");
        laDireccion.setNumero(54);
        
        elEstudiante.setDireccion(laDireccion);
        
        elEstudiante.imprimir();
        
    }
}
