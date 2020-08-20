
package acarteradinero;

/**
 *
 * @author Abi
 */
public class Cartera {
    
    private String dueño;
    private String color;
    private Dinero dinero;

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dinero getDinero() {
        return dinero;
    }

    public void setDinero(Dinero dinero) {
        this.dinero = dinero;
    }
    
    public void imprimir() {
        System.out.println("---CARTERA---");
        System.out.println("Dueño: " + dueño);
        System.out.println("Color: " + color);
        System.out.println("***DINERO***");
        System.out.println("Tipo de moneda: " + dinero.getTipoMoneda() );
        System.out.println("Cantidad: " + dinero.getCantidad() );
        System.out.println("-------");
        System.out.println(dueño + " tiene " + dinero.getCantidad() + " " + dinero.getTipoMoneda() + " en su cartera " + color);
    }
    
}