package ejemplo_03_persona;

/**
 *
 * Autor: Abi
 */
public class Empleado {

    private final Trabajo elTrabajo;

    public Empleado() {
        /* Cuando se crea un empleado, automaticamente se le asigna
         * el trabajo de policia con un sueldo de 3000        
         */        
        elTrabajo = new Trabajo();
        
        elTrabajo.setDescripcion("Policia");
        elTrabajo.setSueldo(3000);
        
    }
    
    public void imprimir() {
        System.out.println("DATOS DEL EMPLEADO");
        System.out.println("TRABAJO:");
        System.out.println("Oficio: " + elTrabajo.getDescripcion() );
        System.out.println("Sueldo: " + elTrabajo.getSueldo() );
    }
    
}
