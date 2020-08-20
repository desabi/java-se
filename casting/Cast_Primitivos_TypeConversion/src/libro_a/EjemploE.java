package libro_a;

/**
 *
 * @author abi
 */
public class EjemploE {
    public static void main(String[] args) {
        
        short numero1 = 10;
        short numero2 = 20;
        short numero3;
        
        int numero4;
        
        /* Operaciones aritmeticas con valores byte o short */
        /* Siempre dan como resultado un int */
        /* La siguiente linea marcara error */
        //numero3 = numero1 + numero2;
        
        /* 
          ¿por que?
          Por que el resultado de la suma puede sobrepasar el valor soportado por short
        */
        
        /* Lo guardamos en un int para que no marque error */
        numero4 = numero1 + numero2;
        
        /* Si queremos guardarlo en un short, tenemos que hacer cast */
        numero3 = (short) (numero1 + numero2);
        
    }
}
