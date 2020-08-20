public class ComestiblePrueba {
    public static void main(String[] args) {
        
        Object[] objetos = {new Tigre(), new Pollo(), new Manzana() };

        for (int i = 0; i < objetos.length; i++) {
            
            if(objetos[i] instanceof Comestible){
                System.out.println(((Comestible)objetos[i]).comoComer());
            }
            
            if(objetos[i] instanceof Animal){
                System.out.println(((Animal)objetos[i]).sonido());
            }
        }
        
    }
}