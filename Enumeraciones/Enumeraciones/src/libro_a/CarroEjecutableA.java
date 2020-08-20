package libro_a;

/**
 *
 * @author abi
 */

public class CarroEjecutableA {
    public static void main(String[] args) {
        
        // Crear el carro y establecer datos 
        Carro miCarro = new Carro(CarroTipo.PORSCHE, CarroColor.ROJO, 2_500_00);
        
        // Obtenemos el tipo de carro 
        // Retorna una constante de tipo enum
        CarroTipo tipo = miCarro.getTipo();
        
        // 
        switch (tipo) {
            // no se escribe la expresion completa
            // CarroTipo.PORSCHE
            // ya que el compilador marcaria error 
            case PORSCHE:
                System.out.println("Tu carro fue hecho en Alemania.");
                break;
            case FERRARI:
                System.out.println("Tu carro fue hecho en Italia.");
                break;
            case JAGUAR:
                System.out.println("Tu carro fue hecho en Inglaterra.");
                break;
            default:
                System.out.println("No se donde fue hecho el carro.");
        }
        
    }
}
