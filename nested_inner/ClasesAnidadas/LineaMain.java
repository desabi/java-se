
package classes;

import classes.Linea;

public class LineaMain {
    public static void main(String[] args) {
        
        Linea.Punto inicio = new Linea.Punto();
        Linea.Punto fin = new Linea.Punto();
        
        inicio.x = 1.0;
        inicio.y = 2.0;
        
        fin.x = 3.0;
        fin.y = 4.0;
        
        Linea line = new Linea(inicio, fin);
        line.aString();
        
    }
}
