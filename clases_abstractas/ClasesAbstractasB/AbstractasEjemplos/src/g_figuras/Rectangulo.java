
package g_figuras;

/**
 * Autor: Abi
 * Fecha: 27/04/2016
 * Hora: 11:41:13 AM
 */

public class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double getArea() {
        double area = base * altura;
        return area;
    }

}