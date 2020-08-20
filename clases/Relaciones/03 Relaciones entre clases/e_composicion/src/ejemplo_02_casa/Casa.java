package ejemplo_02_casa;

/**
 *
 * Autor: Abi
 */
public class Casa {

    private final Puerta laPuerta;
    
    /**
     * Se utiliza final para que nos aseguremos que el objeto sea creado
     *  Una casa debe tener una puerta
    */

    public Casa() {       
        
        /* Cuando se crea la casa, tambien se debe crear la puerta */
        
        laPuerta = new Puerta();
        
        /* se pone la letra F por que son de tipo float */
        laPuerta.setAncho(2.3F);
        laPuerta.setAlto(1.5F);
        
    }
    
    public void imprimir() {
        System.out.println("DATOS DE LA CASA:");
        System.out.println("VENTANA");
        System.out.println("Alto: " + laPuerta.getAncho());
        System.out.println("Ancho: " + laPuerta.getAlto() );
    }
    
}
