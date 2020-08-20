package ejemplo_01_persona;

/**
 *
 * @author abi
 */
public class Persona {

    private String nombre;

    private final Corazon elCorazon;

    /**
     * Se utiliza final para que nos aseguremos que el objeto(Corazon) sea creado 
     * Persona debe tener corazon para poder vivir
     *
     */
    public Persona() {
        /* Cuando se crea(concibe) la Persona, tambien se debe crear el corazon */
        elCorazon = new Corazon();
        elCorazon.setLatiendo(true);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir() {
        System.out.println("PERSONA: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("CORAZON:");
        System.out.println("Latiendo: " + elCorazon.isLatiendo());
    }
}
