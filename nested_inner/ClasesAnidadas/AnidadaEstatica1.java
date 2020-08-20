
package Principal;

/*
 * @autor:    abi
 * @fecha:    13/08/2012
 * @hora:     01:39:15 PM
 * @proyecto: AnidadasEstaticas
 * @paquete:  Principal
 * @archivo:  AnidadaEstatica1.java
 */

class _externa1{
    int i;
    static class _anidada_estatica{
        _externa1 ext = new _externa1();
        {
            ext.i = 8; /* Acceso a la variable a traves de una 
                        * instancia de clase externa*/
        }
        void VerVariable(){
            System.out.println(ext.i);
        }
    }
}
public class AnidadaEstatica1 {
    public static void main(String[] args) {
        _externa1._anidada_estatica ae = new _externa1._anidada_estatica();
        ae.VerVariable();
    }
}
