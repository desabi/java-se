
package ejemplo_05_cuenta;

/**
 *
 * Autor:    Abi
 */

public class Cuenta {
    
    private int numero;
    private double saldo;
    
    /* Instancia de una clase como atributo */
    private Propietario elPropietario;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Propietario getElPropietario() {
        return elPropietario;
    }

    public void setElPropietario(Propietario elPropietario) {
        this.elPropietario = elPropietario;
    }
    
    public void imprimir() {
        System.out.println("CUENTA");
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
        
        /* utilizamos la instancia: elPropietario y sus metodos get */
        /* para obtener los datos de el propietario */
        System.out.println("PROPIETARIO");
        System.out.println("Nombre: " + elPropietario.getNombre());
        System.out.println("Telefono: " + elPropietario.getTelefono() );
    }
}
