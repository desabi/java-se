import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.BigInteger;

public class NumeroMayor {
	
	public static Number getNumeroMayor(ArrayList<Number> lista){
		
		if ( (lista == null) || (lista.size() == 0)) {
			return null;
		}
		
		Number numero = lista.get(0);
		for (int i=1; i<lista.size(); i++) {
			if( numero.doubleValue() < lista.get(i).doubleValue() ){
				numero = lista.get(i);
			}
		}	
		return numero;	
	}
	
	public static void main (String[] args) {
		ArrayList<Number> lista = new ArrayList<>();
		lista.add(45);
		lista.add(3445.53);
		lista.add(new BigInteger("3432323234344343101"));
		lista.add(new BigDecimal("2.0909090989091343433344343"));
		
		Number mayor = getNumeroMayor(lista);
		System.out.println("EL mayor es: " + mayor);
	}
}