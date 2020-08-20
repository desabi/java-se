
package classes;

/**
 * @author   Abi
 * @proyecto FocusListener
 * @archivo  AEventoFocusMain.java
 * @fecha    30/06/2014 09:34:52 PM
 */

public class AFocusListenerImpMain extends javax.swing.JFrame {

    public AFocusListenerImpMain() {
        initComponents();
    }

    private final AFocusListenerImp ef = new AFocusListenerImp();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonUno = new javax.swing.JButton();
        botonDos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonUno.setText("boton 1");
        botonUno.setName("unoboton"); // NOI18N
        botonUno.addFocusListener(ef);
        getContentPane().add(botonUno);
        botonUno.setBounds(30, 40, 130, 30);

        botonDos.setText("boton 2");
        botonDos.setName("dosboton"); // NOI18N
        getContentPane().add(botonDos);
        botonDos.setBounds(190, 40, 160, 30);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {   
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AFocusListenerImpMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDos;
    private javax.swing.JButton botonUno;
    // End of variables declaration//GEN-END:variables
}