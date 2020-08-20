
package ejemplo_05_cuenta_propietario;

/**
 *
 * Autor:    Abi
 */

public class Cuenta {
    
    private int numero;
    private double saldo;

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
    
    public void imprimir() {
        System.out.println("CUENTA");
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
    }
    
}
