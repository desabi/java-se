
public class EnvoltorioA {
   public static void main (String[] args) {
       
       String numeroString = "34";
       int numero = Integer.valueOf(numeroString);
	   /* valueOf vs parseInt */
       
       System.out.println(numeroString+3);
       System.out.println(numero + 3);
       
       /*
        * Para todas las clases es igual. 
        * Para float sería (Float.valueOf(s), etc), 
        * EXCEPTO para "Character" que no tiene este método.
        **/
   } 
}

