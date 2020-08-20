
package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author   Abi
 * @proyecto ActionListener
 * @archivo  DEventoClaseAnonima.java
 * @fecha    30/06/2014 07:47:35 PM
 */

public class DEventoClaseAnonima extends javax.swing.JFrame {

    public DEventoClaseAnonima() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        miBoton.setText("Boton con un ActionListener como Clase Anonima");
        miBoton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Evento como clase anonima.");
            }
        }
    );
    getContentPane().add(miBoton);
    miBoton.setBounds(0, 50, 390, 40);

    setSize(new java.awt.Dimension(416, 339));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DEventoClaseAnonima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton miBoton;
    // End of variables declaration//GEN-END:variables

}
