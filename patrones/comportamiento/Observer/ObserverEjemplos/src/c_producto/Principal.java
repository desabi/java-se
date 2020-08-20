package c_producto;

/**
 *
 * @author Abi
 */
public class Principal {
    public static void main(String[] args) {
        
         ProductoObservableConcreto producto = new ProductoObservableConcreto();
        producto.setDescripcion("Celular");
        producto.setPrecio(3400);
        
        ObservadorConcreto clienteA = new ObservadorConcreto(producto);
        clienteA.setNombre("Juan");
        
        ObservadorConcreto clienteB = new ObservadorConcreto(producto);
        clienteB.setNombre("Ana");
        
        producto.setDisponible(true);
    }
}
