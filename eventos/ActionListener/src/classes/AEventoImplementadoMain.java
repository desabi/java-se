
package classes;

/**
 * @author   Abi
 * @proyecto ActionListener
 * @archivo  Ventana.java
 * @fecha    30/06/2014 06:56:36 PM
 */

public class AEventoImplementadoMain extends javax.swing.JFrame {

    public AEventoImplementadoMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classes.AEventoImplementado ca = new classes.AEventoImplementado();
        miBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        miBoton.setText("Boton con ActionListener");
        miBoton.addActionListener(ca);
        getContentPane().add(miBoton);
        miBoton.setBounds(20, 40, 330, 40);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AEventoImplementadoMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton miBoton;
    // End of variables declaration//GEN-END:variables
}