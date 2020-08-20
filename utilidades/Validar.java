
package util;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author www.facebook.com/abidesa
 * 
 */

public class Validar {
    
    /**
     * @author www.facebook.com/abidesa
     * 
     * El método devuelve los datos vacios de un arreglo String que se le pasa 
     * entre los parentesis.
     * 
     * @param datos Especificar el arreglo de Strings.
     * @return devuelve el numero de campos vacios, se debe guardar en una variable
     * de tipo int
     */
    public static int contarVacios(String datos[]){        
        Boolean vacios[] = new Boolean[datos.length];
        
        int posicion = 0;
        for (String d : datos) {
            vacios[posicion] = d.equals("");
            posicion++;
        }
        
        int camposVacios = 0;
        for (Boolean b : vacios) {
            if( b == true){
                camposVacios++;
            }
        }
        
        if (camposVacios > 0) {
            String mensaje = "Hay campos vacios, llena todos los campos.";
            String titulo = "Campos Vacios";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);    
        }
        
        return camposVacios;
    }
    
    public static int getDatosVacios(ArrayList<String> datos) {
        
        Boolean[] vacios = new Boolean[datos.size()];
        
        int posicion = 0;
        for (String d : datos) {
            vacios[posicion] = d.equals("");
            posicion++;
        }
        
        int datosVacios = 0;
        for (Boolean b : vacios) {
            if (b == true) {
                datosVacios++;
            }
        }
        
        if (datosVacios > 0) {
            String mensaje = "Hay "+datosVacios+" campos vacios, llena todos los campos.";
            String titulo = "Campos Vacios";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);    
        }
        
        return datosVacios;
    }
    
    /**
     * @author www.facebook.com/abidesa
     * 
     * El metodo limita el numero de caracteres que se pueden introducir en un
     * campo de texto JTextFiel.
     * <br><br> Utilizar el evento: KeyTyped
     * 
     * @param campo Especificar el nombre del campo que vamos a limitar
     * @param evento Especificar el evento KeyEvent
     * @param longitud escribir el numero que sera el limite de los caracteres.
     */
    public static void limitarCaracteres(JTextField campo, KeyEvent evento, int longitud){
        int totalCaracteres = campo.getText().length();
        if(totalCaracteres == longitud){
            evento.consume();
        }
    }

    /**
     * @author www.facebook.com/abidesa
     * 
     * El método hace que un campo de texto JTextField solo admita numeros.
     * <br><br> Utilizar el evento: KeyTyped
     * 
     * @param evento Especificar el evento KeyEvent
     */
    public static void soloNumeros(KeyEvent evento){
        char caracter = evento.getKeyChar();
        if(Character.isLetter(caracter)){
            evento.consume();
        }
    }
    
    /**
     * @author www.facebook.com/abidesa
     * 
     * El método hace que un campo de texto JTextField solo admita lettras.
     * <br><br> Utilizar el evento: KeyTyped
     * 
     * @param evento Especificar el evento KeyEvent
     */
    public static void soloTexto(KeyEvent evento){
        char caracter = evento.getKeyChar();
        if(Character.isDigit(caracter)){
            evento.consume();
        }
    }
    
    /**
     * @author www.facebook.com/abidesa
     * 
     * El método hace que un campo de texto JTextField no admita caracteres 
     * especiales como; , . - _ { } ´+ ¿ ' etc...
     * <br><br> Utilizar el evento: KeyTyped
     * 
     * @param evento Especificar el evento KeyEvent
     */
    public static void noCaracteresEspeciales(KeyEvent evento){
        char caracter = evento.getKeyChar();
        if(!Character.isLetterOrDigit(caracter)){
            evento.consume();
        }
    }
    
    /*
    Si se presiona enter utilizar keypressed o keyreleased
    luego validar con nocaracteresespeciales
    
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            System.out.println("Enter presionado keypressed");
    }
         
    */
}
