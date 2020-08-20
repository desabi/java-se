package d_producto;

/**
 *
 * @author Abi
 */
public class Main {
    public static void main(String[] args) {
        
        ProductoObservableConcreto producto = new ProductoObservableConcreto();
        producto.setDescripcion("Laptop");
        producto.setPrecio(12000);
        
        ObservadorConcreto clienteA = new ObservadorConcreto(producto);
        clienteA.setNombre("Abi");
        
        ObservadorConcreto clienteB = new ObservadorConcreto(producto);
        clienteB.setNombre("Berna");
        
        ObservadorConcreto clienteC = new ObservadorConcreto(producto);
        clienteC.setNombre("Carlos");
        
        ObservadorConcreto clienteD = new ObservadorConcreto(producto);
        clienteD.setNombre("Daniel");
        
        ObservadorConcreto clienteE = new ObservadorConcreto(producto);
        clienteE.setNombre("Eduardo");
        
        //producto.setDisponible(true);
        
        producto.quitarObservador(clienteA);
        producto.quitarObservador(clienteB);
        
        producto.setDisponible(true);
        
    }
}
