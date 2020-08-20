
package f_alumno;

/**
 * Autor: Abi
 * Fecha: 26/04/2016
 * Hora: 04:23:18 PM
 */

public class AlumnoSistemas extends Alumno {

    private int horasProgramacion;
    private int horasBasesDeDatos;

    public int getHorasProgramacion() {
        return horasProgramacion;
    }

    public void setHorasProgramacion(int horasProgramacion) {
        this.horasProgramacion = horasProgramacion;
    }

    public int getHorasBasesDeDatos() {
        return horasBasesDeDatos;
    }

    public void setHorasBasesDeDatos(int horasBasesDeDatos) {
        this.horasBasesDeDatos = horasBasesDeDatos;
    }
    
    @Override
    public int getHorasPorSemana() {
        int totalHoras = horasProgramacion + horasBasesDeDatos;
        return totalHoras;
    }
    
    
}
