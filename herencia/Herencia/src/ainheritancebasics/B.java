package ainheritancebasics;

/**
 * @author abi Fecha: 2/07/2019 Hora: 10:10:35 AM
 */
public class B extends A {

    int k;

    void showk() {
        System.out.println("k = " + k);
    }

    void sum() {
        System.out.println("i+j+k = " + (i+j+k));
    }
}
