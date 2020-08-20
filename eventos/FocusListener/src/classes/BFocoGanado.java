
package classes;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * @author   Abi
 * @proyecto FocusListener
 * @archivo  BFocoGanado.java
 * @fecha    30/06/2014 09:58:51 PM
 */

public class BFocoGanado extends javax.swing.JFrame {

    public BFocoGanado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoUno = new javax.swing.JTextField();
        campoDos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        /*
        Si queremos capturar solo la ganancia o la perdida,
        solo uno de ambos, se utiliza un adaptatos: focusadapter,
        y solamente se sobreescribe el metodo que queramos
        utilizar, ya sea focusgained o focuslost
        */

        campoUno.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e){
                System.out.println("campoUno: foco ganado");
            }
        }
    );
    getContentPane().add(campoUno);
    campoUno.setBounds(30, 30, 130, 30);
    getContentPane().add(campoDos);
    campoDos.setBounds(190, 30, 140, 30);

    setSize(new java.awt.Dimension(416, 339));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BFocoGanado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoDos;
    private javax.swing.JTextField campoUno;
    // End of variables declaration//GEN-END:variables

}
