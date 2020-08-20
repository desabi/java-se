
package g_figuras;

/**
 * Autor: Abi
 * Fecha: 27/04/2016
 * Hora: 12:12:21 PM
 */

public class Circulo extends FiguraGeometrica {
    
    private final double PI = 3.1416;
    
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double getArea() {
        double area = PI * (radio*radio);
        return area;
    }

}