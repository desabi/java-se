
package f_alumno;

/**
 * Autor: Abi
 * Fecha: 26/04/2016
 * Hora: 04:28:31 PM
 */

public class AlumnoInformatica extends Alumno {

    private int horasAlgoritmos;
    private int horasHardware;
    private int horasTelecomunicaciones;

    public int getHorasAlgoritmos() {
        return horasAlgoritmos;
    }

    public void setHorasAlgoritmos(int horasAlgoritmos) {
        this.horasAlgoritmos = horasAlgoritmos;
    }

    public int getHorasHardware() {
        return horasHardware;
    }

    public void setHorasHardware(int horasHardware) {
        this.horasHardware = horasHardware;
    }

    public int getHorasTelecomunicaciones() {
        return horasTelecomunicaciones;
    }

    public void setHorasTelecomunicaciones(int horasTelecomunicaciones) {
        this.horasTelecomunicaciones = horasTelecomunicaciones;
    }
    
    @Override
    public int getHorasPorSemana() {
        int totalHoras = horasAlgoritmos + horasHardware + horasTelecomunicaciones;
        return totalHoras;
    }
    
}
