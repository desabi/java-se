
package classes;

/**
 * @author   Abi
 * @proyecto MouseMotionListener
 * @archivo  Ventana.java
 * @fecha    30/06/2014 11:02:01 PM
 */

public class Ventana extends javax.swing.JFrame {

    private final MouseMotion mm = new MouseMotion();
    
    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miPanel = new javax.swing.JPanel();
        miBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        miPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        miPanel.addMouseListener(mm);
        miPanel.addMouseMotionListener(mm);
        miPanel.setLayout(null);
        getContentPane().add(miPanel);
        miPanel.setBounds(10, 10, 330, 240);

        miBoton.setText("Adaptador del Ratón");
        MouseAdaptador.miMetodo(miBoton);
        getContentPane().add(miBoton);
        miBoton.setBounds(410, 50, 180, 23);

        setSize(new java.awt.Dimension(647, 420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton miBoton;
    public static javax.swing.JPanel miPanel;
    // End of variables declaration//GEN-END:variables

}
