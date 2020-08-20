package a_calificacion;

public class Calificacion {
	
	private double puntuacion;

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public char getNota() {		
		char nota;
		
		if (puntuacion >= 9) {
			nota = 'A';
		} else if (puntuacion >= 8) {
			nota = 'B';
		} else if (puntuacion >= 7) {
			nota = 'C';
		} else if (puntuacion >= 6) {
			nota = 'D';
		} else {
			nota = 'F';
		}
		
		return nota;
	}
}
