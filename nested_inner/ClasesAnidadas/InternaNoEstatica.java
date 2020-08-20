
package Mains;

/*
 * @autor:    abi
 * @fecha:    13/08/2012
 * @hora:     12:33:24 PM
 * @proyecto: ClasesAnidadas
 * @paquete:  Mains
 * @archivo:  InternaNoEstatica.java
 */

class externa{
    
    void imprime(){
        interna min = new interna();
        min.muestra();
    }
    
    class interna{
        public void muestra(){
            System.out.println("Objeto interno");
        }
    }   
}
public class InternaNoEstatica {
    public static void main(String[] args) {
        externa objExter = new externa();
        objExter.imprime();
    }
}

/* Clase interna no estatica:
 * Tiene accesoa  todas las variables y metodos de la clase que la
 * contiene
 */