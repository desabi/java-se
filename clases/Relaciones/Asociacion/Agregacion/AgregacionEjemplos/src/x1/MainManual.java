
package x1;

/**
 *
 * @author Abi
 */
public class MainManual {
    public static void main(String[] args) {
        
        Estudiante elEstudiante = new Estudiante();
        elEstudiante.setNombre("Abi");
        elEstudiante.setEdad(28);
        
        Materia materia1 = new Materia();
        materia1.setNombre("Bases de Datos.");
        materia1.setHoras(4);
        
        Materia materia2 = new Materia();
        materia2.setNombre("Programacion");
        materia2.setHoras(5);
        
        elEstudiante.addMateria(0, materia1);
        elEstudiante.addMateria(1, materia2);
        
        elEstudiante.imprimir();
        
    }
}
