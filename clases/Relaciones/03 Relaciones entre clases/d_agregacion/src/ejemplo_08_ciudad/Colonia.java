package ejemplo_08_ciudad;

/**
 *
 * @author abi
 */
public class Colonia {

    private String nombre;
    private String ubicacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void imprimir() {
        System.out.println("## DATOS DE LA COLONIA ##");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("");
    }

}
