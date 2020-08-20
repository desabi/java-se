
class CirculosYRectangulos {        
    public static void main(String[] args) {
		Circulo miCirculo = new Circulo(5);
		Rectangulo miRectangulo = new Rectangulo(5, 3);
		
		verInformacion(miCirculo);
		verInformacion(miRectangulo);
		
		boolean comparacionAreas = compararAreas(miCirculo, miRectangulo);
		System.out.println("\nLos dos objetos tienen areas iguales: " + comparacionAreas);		        
    }
    
    public static void verInformacion(ObjetoGeometrico objeto) {
    	System.out.println();
    	System.out.println("Area: " + objeto.getArea());
    	System.out.println("Perimetro: " + objeto.getPerimetro());
    }
    
    public static boolean compararAreas(ObjetoGeometrico primero, ObjetoGeometrico segundo) {
    	return primero.getArea() == segundo.getArea();
    }
}