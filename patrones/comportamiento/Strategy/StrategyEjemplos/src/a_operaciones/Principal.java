
package a_operaciones;

/**
 *
 * @author Abi
 */
public class Principal {
    public static void main(String[] args) {
        
        Contexto contexto = new Contexto(new EstrategiaSuma());
        
        int suma = contexto.ejecutarEstrategia(4, 3);
        System.out.println("suma = " + suma);
        
        contexto = new Contexto(new EstrategiaMultiplicacion());
        
        int multiplicacion = contexto.ejecutarEstrategia(5, 4);
        System.out.println("multiplicacion = " + multiplicacion);
        
    }
    
}
