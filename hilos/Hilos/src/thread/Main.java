/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author desab
 */
public class Main {
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo("A");
        Hilo hilo2 = new Hilo("B");
        Hilo hilo3 = new Hilo("C");
                        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
