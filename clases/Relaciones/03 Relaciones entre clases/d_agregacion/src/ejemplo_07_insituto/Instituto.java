package ejemplo_07_insituto;

import java.util.ArrayList;

/**
 *
 * @author abi
 */
public class Instituto {

    private String nombre;
    private int clave;

    private ArrayList<Carrera> lasCarreras;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public ArrayList<Carrera> getLasCarreras() {
        return lasCarreras;
    }

    public void setLasCarreras(ArrayList<Carrera> lasCarreras) {
        this.lasCarreras = lasCarreras;
    }

    public void imprimir() {
        System.out.println(" ## DATOS DE LA INSTITUCION ## ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Clave: " + clave);
        System.out.println("");

        for (Carrera carrera : lasCarreras) {
            carrera.imprimir();
        }
    }
}
