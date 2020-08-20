
package classes;

public class BoxingA {
    public static void main(String[] args) {
        unBox ub = new unBox();
        
        //int primitivo = ub.objetoAPrimitivo(Integer.SIZE);
        int primitivo = ub.objetoAPrimitivo(200);
        System.out.println(primitivo);
        
        Integer objeto = ub.primitivoAObjeto(3);
        System.out.println(objeto);
        
    }
}

/* Toma un parametro Integer y retorna un valor int */
class unBox{
    public int objetoAPrimitivo(Integer valor){
        // unboxing convierte un objeto en un valor primitivo
        /* unboxing a int */
        return valor;
    }
    
    public Integer primitivoAObjeto(int valor){
        // boxing convierte un valor primitivo en un objeto
        /* boxing a Integer */
        return valor;
    }
}