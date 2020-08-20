
package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author   Abi
 * @proyecto ActionListener
 * @archivo  CEventoImplementadoEnPrincipal.java
 * @fecha    30/06/2014 07:43:26 PM
 */

public class CEventoImplementadoEnPrincipal extends javax.swing.JFrame implements ActionListener{

    public CEventoImplementadoEnPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        miBoton.setText("Boton con actionListener implementado en la clase principal");
        miBoton.addActionListener(this);
        getContentPane().add(miBoton);
        miBoton.setBounds(10, 40, 390, 40);

        setSize(new java.awt.Dimension(423, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CEventoImplementadoEnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton miBoton;
    // End of variables declaration//GEN-END:variables

    /* para agregar este evento a un componente swing
       componente.addActionListener(this);  
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("El evento ahora se ha implementado");
        System.out.println("En la ventana principal.");
    }

}
