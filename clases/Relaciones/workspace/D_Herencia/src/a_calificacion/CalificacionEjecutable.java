package a_calificacion;

import java.util.Scanner;

public class CalificacionEjecutable {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		Calificacion laCalificacion = new Calificacion();
		
		System.out.println("Escribe la puntuacion: ");
		double puntuacionLeida = leer.nextDouble();
		
		laCalificacion.setPuntuacion(puntuacionLeida);
		
		System.out.println("## DATOS DE LA CALIFICACION ##");
		System.out.println("Tu puntuacion es: " + puntuacionLeida);
		System.out.println("Tu nota es: " + laCalificacion.getNota());
		
	}
}
