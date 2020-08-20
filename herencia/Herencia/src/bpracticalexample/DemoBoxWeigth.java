/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpracticalexample;

/**
 *
 * @author desab
 */
public class DemoBoxWeigth {

    public static void main(String[] args) {

        BoxWeigth mybox1 = new BoxWeigth(10, 20, 15, 34.3);
        BoxWeigth mybox2 = new BoxWeigth(2, 3, 4, 0.076);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is: " + vol);
        System.out.println("Weigth of mybox1 is: " + mybox1.weigth);
        System.out.println("");

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is: " + vol);
        System.out.println("Weigth of mybox2 is: " + mybox2.weigth);
    }

}
