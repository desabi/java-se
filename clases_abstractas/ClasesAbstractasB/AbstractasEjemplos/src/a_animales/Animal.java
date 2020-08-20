
package a_animales;

/**
 *
 * @author Abi
 */

public abstract class Animal {
    
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract void comer();
    
}
