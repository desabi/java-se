
package ejemplo_05_cuenta;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de las clases */
        Cuenta miCuenta = new Cuenta();
        Propietario elPropietario = new Propietario();
        
        /* 2do: Colocar datos a las instancias */
        miCuenta.setNumero(7839);
        miCuenta.setSaldo(50);
        
        elPropietario.setNombre("ABI DE SA");
        elPropietario.setTelefono(75712517098L);
        
        /* 3ro: Imprimir los datos de las instancias */
        miCuenta.imprimir();
        miCuenta.imprimirPropietario(elPropietario);
        
    }
}
