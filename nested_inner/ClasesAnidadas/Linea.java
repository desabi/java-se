
package classes;

public class Linea {

    public static class Punto{
        double x;
        double y;
    }
       
    private Punto Inicio;
    private Punto Final;
    
    public Linea(Punto Inicio, Punto Final){
        this.Inicio = Inicio;
        this.Final = Final;
    }
    
    public void aString(){
        System.out.println("("+Inicio.x+","+Final.x+")");
        System.out.println("("+Inicio.y+","+Final.y+")");
    }
}
