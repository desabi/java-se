package c_alumno_if;

/**
 * @author abi
 *
 */
public class AlumnoEjecutable {

	public static void main(String[] args) {

		Alumno elAlumno = new Alumno();
		
		elAlumno.setNombre("Abi DS");
		elAlumno.setCalificacion(11);

		elAlumno.imprimir();
	}

}
