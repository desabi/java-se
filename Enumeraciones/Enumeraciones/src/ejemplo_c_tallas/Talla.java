
package ejemplo_c_tallas;

/**
 *
 * @author abi
 */
public enum Talla {
    
    CH ("Chica"),
    M ("Mediana"),
    G ("Grande");
    
    private final String descripcion;

    private Talla(String descripcion) {
        this.descripcion = descripcion;
    }    

    public String getDescripcion() {
        return descripcion;
    }    
    
}
