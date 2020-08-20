
package BClaseInterna;

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

        ci = new ClaseInterna();
        botonY = new javax.swing.JButton();
        botonZ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonY.setText("penultimo");
        botonY.addActionListener(ci);
        getContentPane().add(botonY);
        botonY.setBounds(80, 40, 190, 30);

        botonZ.setText("ultimo");
        botonZ.addActionListener(ci);
        getContentPane().add(botonZ);
        botonZ.setBounds(90, 140, 190, 30);

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
    private javax.swing.JButton botonY;
    private javax.swing.JButton botonZ;
    // End of variables declaration//GEN-END:variables
    private ClaseInterna ci;
    
    
    // creamos una clase interna
    public class ClaseInterna implements ActionListener{
        int contador = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            
            String etiqueta = e.getActionCommand();
            System.out.println("etiqueta dice -> " + etiqueta);
            
            Object fuente = e.getSource();
            
            if (fuente.equals(botonY)){
                System.out.println("Has presionado el botonY.");
            }
            
            if (fuente.equals(botonZ)) {
                System.out.println("Has presionado el botonZ.");
            }
            
            System.out.println("Contador : " + contador + "\n");
            contador++;
        }
    }
    
    
}
