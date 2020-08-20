package ejemplo_b_tallas;

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

    public Camisa() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }
        
}
