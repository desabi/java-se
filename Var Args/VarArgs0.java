
package classes;

public class VarArgs0 {

	// un metodo puede contener un parametro normal junto con parametros variables 
	// puede ser mas de un parametro normal, en este ejemplo se utiliza uno solamente.
	// el parametros varargs debe ir al ultimo
	// debe hacer solamente un parametro varargs
    static void imprimirValores(String mensaje, int ... valores){
    	System.out.println("\n"+mensaje);
    	
    	int contador = 0;
    	for (int valor : valores){
    		System.out.printf("Valor[%d] = %d \n", contador, valor);
    		contador++;
    	}
    }
    
    public static void main (String[] args) {
    	imprimirValores("Utilizando varargs", 3, 8, 91, 77);
    	imprimirValores("Hola", 8, 2);
    }
}