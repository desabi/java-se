package ainheritancebasics;

/**
 * @author abi Fecha: 2/07/2019 Hora: 10:13:18 AM
 */
public class SimpleInheritance {

    public static void main(String[] args) {

        A superObj = new A();
        B subObj = new B();
        
        // the super class may be used itself
        superObj.i = 10;
        superObj.j =  20;
        System.out.println("Contents of superObj: ");
        superObj.showij();
        System.out.println("");
        
        /* The subclass has access to all public members of its superclass */
        subObj.i = 7;
        subObj.j = 8;
        subObj.k = 9;
        System.out.println("Contents of subObj");
        subObj.showij();
        subObj.showk();
        System.out.println("");
        
        System.out.println("Sum of i, j and k in subObj is: ");
        subObj.sum();
    }

}
