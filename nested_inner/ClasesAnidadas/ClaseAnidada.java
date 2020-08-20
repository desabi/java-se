
package classes;

public class Exterior{
    
    String a = "Clase Exterior.";
    
    void verAnidada(){
        Anidada anidada = new Anidada();
        anidada.VerValores();
    }
    
    static class Anidada{
        String b = "Clase Anidada.";
        
        void VerValores(){
            System.out.println("b = " + b);
            Exterior exterior = new Exterior();
            System.out.println("a = " + exterior.a);
        }
    }
    
}


