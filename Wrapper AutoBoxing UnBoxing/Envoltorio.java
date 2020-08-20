
public class Main {
    public static void main(String[] args) {
        
        /* boxing: encapsular un valor dentro de un Objeto */
        // boxes the value 100 into an Integer
        Integer enteroObjeto = new Integer(100);
        
        /* unboxing: extraer el valor de un tipo envoltorio(wrapper) */
        // unboxes the value in iObj
        int enteroPrimitivo = enteroObjeto.intValue();
        
        System.out.println(enteroPrimitivo + " : " + enteroObjeto);
        
        /* java 5 simplifico la conversion entre valores primitivos y los
         * objetos de envoltura de tipo, al no requerir codigo adicional:
         * new integer e intvalue
         */ 
        Integer entero = 10;
        int valor = entero;
    }    
}
/*
 * Clases Envoltorias:
 * Boolean, Byte, Character, Double, Float, Integer, Long, y Short
 *
 * Nos permiten manipular los valores primitivos como objetos.
 */