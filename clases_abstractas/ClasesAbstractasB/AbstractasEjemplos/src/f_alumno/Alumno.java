
package f_alumno;

/**
 * Autor: Abi
 * Fecha: 26/04/2016
 * Hora: 04:21:59 PM
 */

public abstract class Alumno {
    
    private String nombre;
    private String carrera;
    private int cuatrimestre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", carrera=" + carrera + ", cuatrimestre=" + cuatrimestre + '}';
    }
    
    public abstract int getHorasPorSemana();
}
