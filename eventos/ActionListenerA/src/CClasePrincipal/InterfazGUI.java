
package CClasePrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Abi
 */

// hacer que la clase principal implemente la interface listener

public class InterfazGUI extends javax.swing.JFrame implements ActionListener {

    public InterfazGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonUno = new javax.swing.JButton();
        botonDos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonUno.setText("boton1");
        botonUno.addActionListener(this);
        getContentPane().add(botonUno);
        botonUno.setBounds(110, 70, 170, 40);

        botonDos.setText("boton2");
        botonDos.addActionListener(this);
        getContentPane().add(botonDos);
        botonDos.setBounds(110, 180, 170, 40);

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
    private javax.swing.JButton botonDos;
    private javax.swing.JButton botonUno;
    // End of variables declaration//GEN-END:variables

    // la clase principal sobre escribe el metodo del listener (ActionListener)
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // para agregar el evento: boton.addActionListener(this);
        // porque el evento ya se encuentra dentro de la clase principal
        
        String etiqueta = e.getActionCommand();
        System.out.println("ETIQUETA: " + etiqueta);
        
        Object fuente = e.getSource();
        
        if (fuente.equals(botonUno)) {
            System.out.println("Has presionado el primero boton....\n");
        }
        
        if (fuente.equals(botonDos)) {
            System.out.println("Has presionado el segundo boton..\n");
        }
    }

}
