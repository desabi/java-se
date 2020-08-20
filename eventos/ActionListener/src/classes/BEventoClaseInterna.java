
package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author   Abi
 * @proyecto ActionListener
 * @archivo  EventoClaseInterna.java
 * @fecha    30/06/2014 07:36:42 PM
 */

public class BEventoClaseInterna extends javax.swing.JFrame {

    public BEventoClaseInterna() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        miBoton.setText("Boton con ActionListener Interno");
        EventoInterno ei = new EventoInterno();
        miBoton.addActionListener(ei);
        getContentPane().add(miBoton);
        miBoton.setBounds(30, 43, 330, 50);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BEventoClaseInterna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton miBoton;
    // End of variables declaration//GEN-END:variables

}

class EventoInterno implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento como clase interna.");
        System.out.println("Evento dentro del jframe.");
    }
    
}
