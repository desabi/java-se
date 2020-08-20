package d_producto;

import java.util.ArrayList;

/**
 *
 * @author Abi
 */
public class ObservadorConcreto implements Observador {

    private ProductoObservableConcreto productoObservableconcreto;
    private String nombre;

    public ObservadorConcreto(ProductoObservableConcreto productoObservableConcreto) {
        this.productoObservableconcreto = productoObservableConcreto;
        this.productoObservableconcreto.agregarObservador(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void actualizar() {
        String descripcion = productoObservableconcreto.getDescripcion();
        boolean disponible = productoObservableconcreto.isDisponible();
        
        System.out.println("Hola: " + nombre);
        
        if (disponible == true) {
            System.out.println("El producto " + descripcion + " esta disponible");
        } else {
            System.out.println("El producto " + descripcion + " NO esta disponible");
        }
    }

}
