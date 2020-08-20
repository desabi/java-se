package a_operaciones;

/**
 *
 * @author desab
 */
public class PrincipalB {
    public static void main(String[] args) {
        
        ConextoB elContexto = new ConextoB();
        
        elContexto.setEstrategia(new EstrategiaMultiplicacion());
        int ejecutarOperacion = elContexto.ejecutarOperacion(3, 5);
        System.out.println("ejecutarOperacion = " + ejecutarOperacion);
    }
}
