
package classes;

public class VarArgs {
    
    public static void imprimirValores(int ... valores){
    	System.out.println("\nNumero de argumentos: " + valores.length);
    	System.out.println("Los valores son:");
    	for(int valor : valores){
    		System.out.println("valor: " + valor);
    	}
    }
    
    public static void main (String[] args) {
    	imprimirValores(7, 8, 12, 32);
    	imprimirValores();
    	imprimirValores(2, 3);
    }
    
    
}