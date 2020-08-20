package edu.abi;

/**
 *
 * @author abi
 */
public class Outer {
    
    static double tasa = 1.16;
    
    static class Inner {
        
        public double calculoNeto(double precio) {
            return precio * tasa;
        }
    }
}
