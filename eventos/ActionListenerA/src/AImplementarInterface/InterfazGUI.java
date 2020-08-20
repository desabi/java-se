
package AImplementarInterface;

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

        cl = new ClaseListener();
        botonA = new javax.swing.JButton();
        botonB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonA.setText("primero");
        botonA.addActionListener(cl);
        getContentPane().add(botonA);
        botonA.setBounds(90, 50, 190, 40);

        botonB.setText("segundo");
        botonB.addActionListener(cl);
        getContentPane().add(botonB);
        botonB.setBounds(90, 140, 200, 40);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonA;
    private javax.swing.JButton botonB;
    // End of variables declaration//GEN-END:variables
    private ClaseListener cl;
}
