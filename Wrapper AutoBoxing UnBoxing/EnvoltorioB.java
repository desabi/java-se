
public class EnvoltorioB {
	public static void main (String[] args) {
		
		String numeroString = "9";
		
		Integer numeroInteger = new Integer(numeroString);
		
		/* Convertir un tipo objeto a primitivo */
		int numeroPrimitivo = numeroInteger.intValue();
		int numeroPrimitivoX = numeroInteger;
		
		System.out.println(numeroPrimitivo);
		System.out.println(numeroPrimitivoX);
		
    }
    
}
