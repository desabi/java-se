
package ejemplo_01_persona;

/**
 *
 * Autor:    Abi
 */

public class Direccion {
    
    private String ciudad;
    private String colonia; 

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
    
    /* No tiene el metodo imprimir */
    /* El metodo imprimir para esta clase esta en la otra clase, Persona*/
}
