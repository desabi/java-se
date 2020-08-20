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
public class RefDemo {

    public static void main(String[] args) {

        // A SuperClass Variable can Reference a Subclass Object
        BoxWeigth weightbox = new BoxWeigth(3, 5, 7, 8.37);        
        Box plainbox = new Box();
        
        Box mybox = new BoxWeigth(8, 9, 10, 9.8);
        
        double vol;
        
        vol = weightbox.volume();
        System.out.println("Volume of weightbox is: " + vol);
        System.out.println("Weight of weightbox is: " + weightbox.weigth);
        System.out.println("");
        
        // assign BoxWeight reference to Box reference
        plainbox = weightbox;
        
        vol = plainbox.volume();
        System.out.println("Volume of plainbox is: " + vol);
        
        /* The following statement is invalid because plainbox
        does not define a weight member*/
        //System.out.println("Weight of plainbox is: " + plainbox.weight);
        
        System.out.println(mybox.toString());
        
    }
}
