class EnvoltorioD {
	public static void main(String[] args){
		
		/* Antes de java 5 */
		
		/* Boxing: primitivo a objeto */
		int x = 8;
		Integer a = new Integer(x);
		Integer r = Integer.valueOf(x); 
		
		/* Unboxing: objeto a primitivo */
		int b = a.intValue();
		
		System.out.println("Valor de x: " + x );
		System.out.println("Valor de a: " + a );
		System.out.println("Valor de b: " + b );
		
	}
}