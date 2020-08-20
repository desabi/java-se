
package ejemplo_05_cuenta_propietario;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de los objetos */
        Cuenta laCuenta = new Cuenta();
        Propietario elPropietario = new Propietario();
        
        /* 2do: Colocar datos */
        laCuenta.setNumero(12345);
        laCuenta.setSaldo(20);
        
        elPropietario.setNombre("abids");
        elPropietario.setTelefono(7571251798L);
        
        /* 3ro: Imprimir datos */
        laCuenta.imprimir();
        elPropietario.imprimir();
        
    }
}
