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
public class Hilo extends Thread {

    public Hilo(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + ". "+ this.getName());
                Thread.sleep(1000);
            }
            
        } catch (InterruptedException e) {
            System.out.println("InterrumpedException = " + e);
        }
    }
}
