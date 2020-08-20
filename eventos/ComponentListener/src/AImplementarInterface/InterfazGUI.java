
package AImplementarInterface;

/**
 * @author Abi
 */
public class InterfazGUI extends javax.swing.JFrame {

    private static final ClaseListener cl = new ClaseListener();
    
    public InterfazGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miboton = new javax.swing.JButton();
        miEtiqueta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        miboton.setText("Aceptar");
        //miboton.addComponentListener(cl);
        miboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mibotonActionPerformed(evt);
            }
        });
        getContentPane().add(miboton);
        miboton.setBounds(113, 170, 120, 30);

        miEtiqueta.setText("hola");
        miEtiqueta.addComponentListener(cl);
        getContentPane().add(miEtiqueta);
        miEtiqueta.setBounds(130, 40, 80, 40);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mibotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mibotonActionPerformed
        miEtiqueta.setVisible(false);
    }//GEN-LAST:event_mibotonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InterfazGUI ig = new InterfazGUI();
                ig.setVisible(true);
                //ig.addComponentListener(cl);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel miEtiqueta;
    private javax.swing.JButton miboton;
    // End of variables declaration//GEN-END:variables

}
