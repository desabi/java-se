package f_producto_if;

public class ProductoEjecutable {
	public static void main(String[] args) {
		
		Producto elProducto = new Producto();
		
		elProducto.setNombre("Lapiz");
		elProducto.setPrecio(5.00);
		
		elProducto.imprimir();
		
		elProducto.comprar(51);
	}
}