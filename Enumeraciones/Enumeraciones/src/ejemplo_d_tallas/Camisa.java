package ejemplo_d_tallas;

/**
 *
 * @author abi
 */
public class Camisa {
    
    private String color;
    private Talla talla;

    public Camisa(String color, Talla talla) {
        this.color = color;
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    // obtiene la talla: CH, M, G
    public Talla getTalla() {
        return talla;
    }
    
    // Obtiene la descripcion de la talla:
    // chica, mediana, grande
    public String getTallaDescripcion() {
        return talla.getDescripcion();
    }
}
