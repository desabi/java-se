package c_producto;

/**
 *
 * @author Abi
 */
public class ObservadorConcreto implements Observador {
    
    private ProductoObservableConcreto productoObservableConcreto;
    private String nombre;

    public ObservadorConcreto(ProductoObservableConcreto producto) {
        this.productoObservableConcreto = producto;
        producto.agregarObservador(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void actualizar() {
        String descripcion = productoObservableConcreto.getDescripcion();
        boolean disponible = productoObservableConcreto.isDisponible();
        
        System.out.println("Hola : " + nombre);
        
        if (disponible==true) {
            System.out.println("El producto " + descripcion + " esta disponible");
        } else {
            System.out.println("El producto " + descripcion + " NO ESTA DISPONIBLE");
        }
    }
    
    
}
