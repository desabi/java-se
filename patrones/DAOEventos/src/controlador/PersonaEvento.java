 
package controlador;

import modelo.PersonaDAO;
import modelo.PersonaDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Abi
 */
public class PersonaEvento implements ActionListener {

    private JTextField campoNombre;
    private JTextField campoEdad;
    private JTextField campoEstatura;
    private JTextField campoDatos;
    private JButton botonAceptar;

    public PersonaEvento(JTextField campoNombre, JTextField campoEdad, JTextField campoEstatura, JTextField campoDatos, JButton botonAceptar) {
        this.campoNombre = campoNombre;
        this.campoEdad = campoEdad;
        this.campoEstatura = campoEstatura;
        this.campoDatos = campoDatos;
        this.botonAceptar = botonAceptar;
        
        this.botonAceptar.addActionListener(this);
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String nombre = campoNombre.getText();
        int edad = Integer.parseInt(campoEdad.getText());
        double estatura = Double.parseDouble(campoEstatura.getText());
        
        PersonaDTO laPersonaDTO = new PersonaDTO(nombre, edad, estatura);
        
        PersonaDAO laPersonaDAO = new PersonaDAO();
        
        String imprimir =laPersonaDAO.imprimir(laPersonaDTO);
        campoDatos.setText(imprimir);
    }
            
}
