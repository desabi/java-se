
package f_alumno;

/**
 * Autor: Abi
 * Fecha: 26/04/2016
 * Hora: 04:32:31 PM
 */

public class Main {
    public static void main(String[] args) {
        
        AlumnoSistemas alumnoSistemas = new AlumnoSistemas();
        
        alumnoSistemas.setNombre("Abi");
        alumnoSistemas.setCarrera("Ingenieria en Sistemas");
        alumnoSistemas.setCuatrimestre(4);
        alumnoSistemas.setHorasBasesDeDatos(5);
        alumnoSistemas.setHorasProgramacion(6);
        
        System.out.println("alumnoSistemas = " + alumnoSistemas.getHorasPorSemana());
    }
}
