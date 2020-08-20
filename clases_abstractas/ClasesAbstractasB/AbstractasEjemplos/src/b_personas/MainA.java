
package b_personas;

/**
 *
 * @author Abi
 */

public class MainA {
        
    public static void main(String[] args) {
        
        /* Crear los objetos */
        Maestro maestro1 = new Maestro();
        maestro1.setNombre("Abi");
        maestro1.setEdad(28);
        
        Barrendero barrenderoA = new Barrendero();
        barrenderoA.setNombre("Luis");
        barrenderoA.setEdad(24);
        
        /* imprimir las personas */
        imprimirPersona(maestro1);
        imprimirPersona(barrenderoA);
    }
    
    /* Metodo que sirve para imprimir objetos de tipo persona */
    static void imprimirPersona(Persona p){
        System.out.println("---------------------------");
        System.out.println("Nombre: " + p.getNombre() );
        System.out.println("Edad: " + p.getEdad() );
        p.trabajar();
    }
}
