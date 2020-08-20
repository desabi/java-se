package com.abi;

/**
 *
 * @author abi
 */
public class Demo {
    
    /* Este metodo implementa polimorfismo */
    public static void method(Object x) {
        /* esta linea de codigo implementa Dynamic Binding */
        System.out.println(x.toString());
    }
    
    public static void main(String[] args) {
        method(new GraduateStudent());
        method(new Student());
        method(new Person());
        method(new Object());
        
        System.out.println("-----------------------------------------");
        // Lo anterior es equivalente a:
        
        // DECLARED TYPE = ACTUAL TYPE
        // Which toString() method is invoked by o is determined by the ACTUAL TYPE.
        
        Object objeto1 = new GraduateStudent();
        method(objeto1);
        
        Object objeto2 = new Student();
        method(objeto2);
        
        Object objeto3 = new Person();
        method(objeto3);
        
        Object objeto4 = new Object();
        method(objeto4);
    }
}
