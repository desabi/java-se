package bpracticalexample;

/**
 * @author abi Fecha: 2/07/2019
 */
public class Box {

    double width; // anchura
    double height; // altura
    double depth; // profundidad

    // construct clone of an objet
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimension specified
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // constructor when no dimension specified
    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    
    //contructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }
    
    // compute and return volume
    double volume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Box{" + "width=" + width + ", height=" + height + ", depth=" + depth + '}';
    }
        

}
