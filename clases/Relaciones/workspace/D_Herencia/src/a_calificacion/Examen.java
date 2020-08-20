package a_calificacion;

public class Examen extends Calificacion {

	private int totalPreguntas;
	private double puntosPorPregunta;
	private int preguntasFalladas;

	public Examen(int totalPreguntas, int preguntasFalladas) {
		double puntuacion;

		this.totalPreguntas = totalPreguntas;
		this.preguntasFalladas = preguntasFalladas;

		puntosPorPregunta = 10.0 / totalPreguntas;
		puntuacion = 10.0 - (preguntasFalladas * puntosPorPregunta);

		setPuntuacion(puntuacion);
	}

	public double getPuntosPorPregunta() {
		return puntosPorPregunta;
	}

	public int getPreguntasFalladas() {
		return preguntasFalladas;
	}

}