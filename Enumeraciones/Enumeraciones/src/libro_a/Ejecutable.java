package libro_a;

/**
 *
 * @author abi
 */

public class Ejecutable {
    public static void main(String[] args) {
        
        /* Creamos una variable de tipo Dia */
        Dia diaTrabajo;
        
        /* Asigna el dia miercoles a diaSemana */
        diaTrabajo = Dia.MIERCOLES;
        
        /* Error: */
        /* Solo se aceptan los valores definidos en la enumeracion */
        //diaTrabajo = "Enero";
        //diaTrabajo = 3;        
        
    }
}
