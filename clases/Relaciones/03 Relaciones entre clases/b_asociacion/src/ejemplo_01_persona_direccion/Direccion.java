
package ejemplo_01_persona_direccion;

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

    public void imprimir() {
        System.out.println("DIRECCION");
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Colonia: " + colonia) ;
    }
    
}
