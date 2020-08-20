package org.abi;

/**
 *
 * @author abi
 */
public class B extends A{
    
    /* Sobre escribe el de la superclase */
    public void setI(int i){
        this.i = 3 * i;
    }
    
    public B() {        
        // super()  llama al constructor de la superclase 
        
        // setI(20)  3 * 20
        
        // ¿por que 3? porque el metodo setI de esta subclase sobre escribe al de la
        // superclase
        
        // y luego llama a: System.out.println("i from A is " + i);
        // imprime i from A is 60
        
        // y despues ejecuta la siguiente linea de codigo
        // i tiene el mismo valor que arriba: 60
        System.out.println("i from B is: " + i);
    }
}
