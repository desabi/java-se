package libro_a;

/**
 *
 * @author abi
 */
public class Carro {
    
    private CarroTipo tipo;
    private CarroColor color;
    private double precio;

    public Carro(CarroTipo tipo, CarroColor color, double precio) {
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
    }

    public CarroTipo getTipo() {
        return tipo;
    }

    public CarroColor getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Carro{" + "tipo=" + tipo + ", color=" + color + ", precio=" + precio + '}';
    }
    
}
