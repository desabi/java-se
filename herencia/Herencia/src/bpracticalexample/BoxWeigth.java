package bpracticalexample;

/**
 * @author abi Fecha: 2/07/2019
 */
public class BoxWeigth extends Box {
    
    double weigth; // peso de la caja

    BoxWeigth(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weigth = m;
    }

    @Override
    public String toString() {
        return super.toString() + "BoxWeigth{" + "weigth=" + weigth + '}';
    }
    
    
}
