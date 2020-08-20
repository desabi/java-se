
package ejemplo_05_cuenta;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de las clases */
        Propietario elPropietario = new Propietario();
        Cuenta laCuenta = new Cuenta();
        
        /* 2do: Colocar los datos */
        elPropietario.setNombre("ABI DS");
        elPropietario.setTelefono(7571251798L);
        
        laCuenta.setNumero(9735);
        laCuenta.setSaldo(100);
        /* Colocar el propietario de la cuenta */
        laCuenta.setElPropietario(elPropietario);
        
        /* 3ro: Imprimir datos */
        laCuenta.imprimir();
        
    }
}
