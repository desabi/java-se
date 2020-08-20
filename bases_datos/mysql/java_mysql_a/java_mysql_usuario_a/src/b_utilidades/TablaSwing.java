package b_utilidades;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * Autor: Abi Archivo: TablaSwing.java Paquete: b_utilidades Fecha: 11/12/2016
 * Hora: 09:23:56 PM
 *
 */
public class TablaSwing {

    /**
     *
     * Este método obtiene el id en una tabla conforme a la fila seleccionada
     * <br><br>
     *
     * @param laTabla
     * @return el id de la fila seleccionada
     */
    public static int getId(JTable laTabla) {

        /* Crear la variable id */
        int id = 0;

        /* Obtener la fila seleccionada */
        int filaSeleccionada = laTabla.getSelectedRow();

        if (filaSeleccionada < 0) {

            String mensaje = "Error al obtener id.\n";
            mensaje += "\nNo has seleccionado ninguna fila.";

            String titulo = "Error en: TablaSwing.getId()";

            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);

            return id;

        } else {

            /* Obtener el id, suele ser siempre el valor de la columna 0 */
            Object idObjeto = laTabla.getValueAt(filaSeleccionada, 0);

            /* Convertirlo a int */
            id = Integer.parseInt(idObjeto + "");

            /* retornar el id de la fila seleccionada */
            return id;
        }

    }

    /**
     * Este método llena una tabla JTable de acuerdo a una consulta sql.
     * <br><br>
     *
     * @param tabla Especificar el nombre de la tabla JTable.
     * @param consultaSQL Especificar la consulta sql con la que se llenara la
     * tabla.
     */
    public static void llenarTabla(JTable tabla, String consultaSQL) {

        ResultSet conjuntoResultados;
        ResultSetMetaData metaDatos;
        int numeroColumnas;

        try {

            //Statement sentencia = getSentencia();
            Statement sentencia = Conexion_MySQL.getSentencia();

            conjuntoResultados = sentencia.executeQuery(consultaSQL);
            metaDatos = (ResultSetMetaData) conjuntoResultados.getMetaData();
            numeroColumnas = metaDatos.getColumnCount();

            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

            while (conjuntoResultados.next()) {
                Object filas[] = new Object[numeroColumnas];
                for (int i = 0; i < numeroColumnas; i++) {
                    filas[i] = conjuntoResultados.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

            conjuntoResultados.close();
            sentencia.close();

        } catch (SQLException e) {

            String mensaje = "Ocurrio un problema al llenar la tabla:\n" + consultaSQL;
            mensaje += "\n\nEl error es:\n" + e;
            String titulo = "Error en: TablaSwing.llenarTabla(JTable tabla, String consultaSQL)";

            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * El método vacia una tabla JTable y despues la llena de conforme a la
     * consulta sql.
     *
     * @param tabla Especificar el nombre de la tabla JTable.
     * @param consultaSQL Escribir la consulta sql con la que se llenara la
     * tabla.
     */
    public static void actualizarTabla(JTable tabla, String consultaSQL) {

        ((DefaultTableModel) tabla.getModel()).setNumRows(0);
        llenarTabla(tabla, consultaSQL);

    }

}
