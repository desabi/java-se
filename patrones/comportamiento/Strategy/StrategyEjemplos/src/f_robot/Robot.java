package f_robot;

/**
 *
 * @author desab
 */
public class Robot {
    
    private Comportamiento comportamiento;
    private String nombre;

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public Comportamiento getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(Comportamiento comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void mover() {
        System.out.println(this.getNombre() +": basado en la posicion actual");
        System.out.println("El comportamiento objeto decide el siguiente movimiento");
        int movimiento = comportamiento.movimiento();
        System.out.println("Sen the comand to mechanism");
        System.out.println("El resultado retornado por el comportamiento del objeto es"
                + " enviado al mecanismo de movimiento para el robot " + this.getNombre() );
    }
}
