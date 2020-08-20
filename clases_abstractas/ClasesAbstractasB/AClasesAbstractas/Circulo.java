
class Circulo extends ObjetoGeometrico {        
    private double radio;
    
    public Circulo() {
    }
    
    public Circulo(double radio) {
    	this.radio = radio;
    }
    
    public double getRadio() {
    	return radio;
    }
    
    public void setRadio(double radio) {
    	this.radio = radio;
    }
    
    @Override
    public double getArea() {
    	return radio * radio * Math.PI;
    }
    
    public double getDiametro() {
    	return radio * 2;	
    }
    
    @Override
    public double getPerimetro() {
    	return 2 * radio * Math.PI;
    }
}
