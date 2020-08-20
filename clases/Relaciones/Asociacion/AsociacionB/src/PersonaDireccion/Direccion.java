
package PersonaDireccion;

/**
 *
 * @author Abi
 */
public class Direccion {
    
    private String ciudad;
    private String colonia;
    private String calle;
    private int numero;

    public Direccion() {
    }

    public Direccion(String ciudad, String colonia, String calle, int numero) {
        this.ciudad = ciudad;
        this.colonia = colonia;
        this.calle = calle;
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
        
}