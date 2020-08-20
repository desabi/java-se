package ejemplo_07_libro;

import java.util.ArrayList;

/**
 *
 * @author abi
 */
public class Ejecutable {
    public static void main(String[] args) {
        
        Capitulo capitulo1 = new Capitulo();
        Capitulo capitulo2 = new Capitulo();
        Capitulo capitulo3 = new Capitulo();
        
        capitulo1.setNombre("Introduccion");
        capitulo1.setPaginas(23);
        
        capitulo2.setNombre("Manejo de variables");
        capitulo2.setPaginas(40);
        
        capitulo3.setNombre("Estucturas basicas");
        capitulo3.setPaginas(59);
        
        ArrayList<Capitulo> losCapitulos = new ArrayList<>();
        
        losCapitulos.add(capitulo1);
        losCapitulos.add(capitulo2);
        losCapitulos.add(capitulo3);
                
        Libro elLibro = new Libro("Programacion en Java", 750, losCapitulos);
        
        elLibro.imprimir();
        
    }
}
