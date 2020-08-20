package c_producto;

import java.util.ArrayList;

/**
 *
 * @author Abi
 */
public class ProductoObservableConcreto implements ProductoObservable {

    private ArrayList<Observador> observadores = new ArrayList<>();
    private String descripcion;
    private double precio;
    private boolean disponible;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
        notificarObseradores();
    }
    
    @Override
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void quitarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void notificarObseradores() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }

}
