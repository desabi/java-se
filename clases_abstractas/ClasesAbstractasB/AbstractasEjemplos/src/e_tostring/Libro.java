
package e_tostring;

/**
 * Autor: Abi
 * Fecha: 26/04/2016
 * Hora: 04:12:55 PM
 */

public class Libro {
    
    private String titulo;
    private double precio;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", precio=" + precio + '}';
    }

}
