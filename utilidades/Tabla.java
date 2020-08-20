
package util;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 * @author www.facebook.com/abidesa
 */
public class Tabla {
    
    /**
     * @author www.facebook.com/abidesa
     * 
     * El método modifica el ancho de una columna de una tabla JTable.
     * 
     * @param tabla Especificar el nombre de la tabla JTable.
     * @param nombreColumna Especificar el nombre de la columna.
     * @param ancho  Especificar el ancho que tendra la columna.
     */
    public static void anchoDeColumna(JTable tabla, String nombreColumna, int ancho) {
        TableColumn columna = tabla.getColumn(nombreColumna);
        columna.setMinWidth(ancho);
        columna.setMaxWidth(ancho);
    }
    
    /**
     * @author www.facebook.com/abidesa
     * 
     * El método centra el contenido de una columna en específico.
     * 
     * @param tabla Especificar el nombre de la tabla JTable.
     * @param columna Especificar la posicion de la columna, empieza en 0.
     */
    public static void centrarContenido(JTable tabla, int columna){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tabla.getColumnModel().getColumn(columna).setCellRenderer(tcr);
    }
    
    /**
     * @author www.facebook.com/abidesa
     * 
     * El método centra todos los títulos de las columnas de una tabla JTable.
     * 
     * @param tabla Especificar el nombre de la tabla JTable
     */
    public static void centrarTitulos(JTable tabla){
        TableCellRenderer tcr = tabla.getTableHeader().getDefaultRenderer();
        JLabel titulo = (JLabel)tcr;  
        titulo.setHorizontalAlignment(JLabel.CENTER);
    }
    
    /**
     * @author www.facebook.com/abidesa
     * 
     * El método centra el contenido de todas las filas de una tabla JTable
     * 
     * @param tabla Especificar el nombre de la tabla Jtable
     */
    public static void centrarTodoElContenido(JTable tabla){
        int totalColumnas = tabla.getColumnCount();
        
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        
        for(int columna=0; columna<totalColumnas; columna++){
            tabla.getColumnModel().getColumn(columna).setCellRenderer(tcr);
        }        
    }
    
    /**
     * El método llena una tabla JTable de acuerdo a una consulta sql.
     * Es necesario tener la clase BaseDeDatos.java en el mismo paquete.
     * 
     * @param tabla Especificar el nombre de la tabla JTable que se va llenar.
     * @param sql Especificar la consulta sql con la que se llenará la tabla JTable.
     * 
     * @author www.facebook.com/abidesa
     */
    public static void llenar(JTable tabla, String sql){
        BaseDeDatos.llenarTabla(tabla, sql);
    }
    
    /**
     * @author www.facebook.com/abidesa
     * 
     * El método obtiene el ancho de una tabla JTable
     * 
     * @param scrollDeLaTabla Especificar el JScrollPane de la tabla JTable
     * @return el método retorna el ancho de la tabla JTable y se debe guardar
     * en una variable de tipo int.
     */
    public static double obtenerAncho(JScrollPane scrollDeLaTabla){
        double ancho = scrollDeLaTabla.getSize().getWidth();
        return ancho;
    }
    
    /**
     * @author www.facebook.com/abidesa
     * 
     * El método obtiene la altura de una tabla JTable
     * 
     * @param scrollDeLaTabla Especificar el JScrollPane de la tabla JTable
     * @return el método retorna la altura de la tabla JTable y se debe guardar
     * en una variable de tipo int.
     */
    public static double obtenerAlto(JScrollPane scrollDeLaTabla){
        double alto = scrollDeLaTabla.getSize().getHeight();
        return alto;
    }
    
    /**
     * @author www.facebook.com/abidesa
     * 
     * El método obtiene el id de la fila seleccionada en una tabla JTable
     * 
     * @param tabla Especificar el nombre de la tabla JTable
     * @return el método retorna el id de la fila seleccionada, debe guardarse
     * en una variable de tipo int.
     */
    public static int getId(JTable tabla){
        int id = 0;
        int fila = tabla.getSelectedRow();
        if( fila < 0){
            String mensaje = "Error al obtener id.\n";
            String error = "No has seleccionado ninguna fila.";
            
            JOptionPane.showMessageDialog(null, mensaje + error, 
                    "Tabla.obtenerId()", JOptionPane.ERROR_MESSAGE);
            return id;
        }else{
            id = Integer.parseInt(tabla.getValueAt(fila, 0)+"");
            return id;
        }
    }
    
}