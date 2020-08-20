
public class Pollo extends Animal implements Comestible {
    
    @Override
    public String comoComer(){
        return "Pollo: frito.";
    }
    
    @Override
    public String sonido(){
        return "Pollo: CLO-CLO-CLO";
    }
    
}
