package ejemplo_08_ciudad;

import java.util.ArrayList;

/**
 *
 * @author abi
 */
public class Ciudad {

    private String estado;
    private String nombre;

    private ArrayList<Colonia> lasColonias = new ArrayList<>();
    private ArrayList<Ciudadano> losCiudadanos = new ArrayList<>();

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Colonia> getLasColonias() {
        return lasColonias;
    }

    public void setLasColonias(ArrayList<Colonia> lasColonias) {
        this.lasColonias = lasColonias;
    }

    public ArrayList<Ciudadano> getLosCiudadanos() {
        return losCiudadanos;
    }

    public void setLosCiudadanos(ArrayList<Ciudadano> losCiudadanos) {
        this.losCiudadanos = losCiudadanos;
    }

    public void imprimir() {
        System.out.println("## DATOS DE LA CIUDAD ## ");
        System.out.println("Estado: " + estado);
        System.out.println("Nombre: " + nombre);
        System.out.println("");

        for (Colonia colonia : lasColonias) {
            colonia.imprimir();
        }

        for (Ciudadano ciudadano : losCiudadanos) {
            ciudadano.imprimir();
        }
    }
}
