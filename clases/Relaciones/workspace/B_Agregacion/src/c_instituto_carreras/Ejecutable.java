package c_instituto_carreras;

import java.util.ArrayList;

public class Ejecutable {
	public static void main(String[] args) {
		
		Instituto elInstituto = new Instituto();
		
		Carrera sistemas = new Carrera();
		Carrera informatica = new Carrera();
		Carrera contabilidad = new Carrera();
		Carrera psicologia = new Carrera();
		Carrera derecho = new Carrera();
		
		ArrayList<Carrera> lasCarreras = new ArrayList<>();
				
		elInstituto.setNombre("Instituto de Tlapa");
		elInstituto.setClave(83435);
		
		sistemas.setNombre("Ingenieria en Sistemas Computacionales");
		sistemas.setAnios(4);
		
		informatica.setNombre("Informatica");
		informatica.setAnios(4);
		
		contabilidad.setNombre("Contabilidad Financiera");
		contabilidad.setAnios(5);
		
		psicologia.setNombre("Psicologia");
		psicologia.setAnios(5);
		
		derecho.setNombre("Derecho");
		derecho.setAnios(4);
		
		lasCarreras.add(sistemas);
		lasCarreras.add(informatica);
		lasCarreras.add(contabilidad);
		lasCarreras.add(psicologia);
		lasCarreras.add(derecho);
		
		elInstituto.setLasCarreras(lasCarreras);
		
		elInstituto.imprimir();
	}
}
