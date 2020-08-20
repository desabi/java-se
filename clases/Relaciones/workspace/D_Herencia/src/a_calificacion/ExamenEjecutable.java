package a_calificacion;

import java.util.Scanner;

public class ExamenEjecutable {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		Examen elExamen = new Examen(15, 4);
		
		 System.out.println("## DATOS DEL EXAMEN ##");
		 System.out.println("Cada pregunta vale: " + elExamen.getPuntosPorPregunta() );
		 System.out.println("Tu puntuacion es: " + elExamen.getPuntuacion());
		 System.out.println("Tu nota es: " + elExamen.getNota());
		 System.out.println("");
	}
}
