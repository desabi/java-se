package ejemplo_01_persona_direccion;

/**
 *
 * Autor: Abi
 */
public class Ejecutable {

    public static void main(String[] args) {

        /* 1ro: Crear las instancias de las clases */
        Persona laPersona = new Persona();
        Direccion laDireccion = new Direccion();

        /* 2do: Colocar datos */
        laPersona.setNombre("ABI DS");
        laPersona.setEdad(29);

        laDireccion.setCiudad("Tlapa");
        laDireccion.setColonia("Tepeyac");

        /* 3ro: Imprimir los datos */
        laPersona.imprimir();
        laDireccion.imprimir();
    }

}
