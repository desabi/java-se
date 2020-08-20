
package classes;

public class Boxing {
    public static void main(String[] args) {
 
        // La conversion boxing convierte un valor primitivo en un objeto
        Integer enteroObjeto = 10;
     
        // La conversion unboxing convierte un objeto en un valor primitivo
        int enteroPrimitivo = enteroObjeto;
        
        System.out.println(enteroObjeto.getClass());
        System.out.println(enteroPrimitivo);
    }
}
