class AbstractTipoDato {        
    public static void main(String[] args) {
    	
        ObjetoGeometrico[] objetos = new ObjetoGeometrico[10];
        
        objetos[0] = new Circulo();
        objetos[1] = new Circulo(7);
        objetos[2] = new Rectangulo(10, 20);
        
    }
}