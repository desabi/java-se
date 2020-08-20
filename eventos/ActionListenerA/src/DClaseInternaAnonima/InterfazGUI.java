
package DClaseInternaAnonima;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Abi
 */
public class InterfazGUI extends javax.swing.JFrame {

    public InterfazGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSuma = new javax.swing.JButton();
        botonResta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonSuma.setText("Sumar");
        botonSuma.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String etiqueta = e.getActionCommand();
                System.out.println("etiqueta: " + etiqueta);
            }
        });
        getContentPane().add(botonSuma);
        botonSuma.setBounds(90, 30, 170, 30);

        botonResta.setText("Restar");
        botonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestaActionPerformed(evt);
            }
        });
        getContentPane().add(botonResta);
        botonResta.setBounds(100, 140, 180, 30);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestaActionPerformed
        String etiqueta = evt.getActionCommand();
        System.out.println("La etiqueta dice: " + etiqueta);
    }//GEN-LAST:event_botonRestaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonResta;
    private javax.swing.JButton botonSuma;
    // End of variables declaration//GEN-END:variables

}
