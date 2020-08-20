
package d_agregar_b;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import a_utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class AgregarUsuarioA {
    public static void main(String[] args) throws SQLException {
        
        /* 1ro: Obtener la consulta */
        String sql ="INSERT INTO usuario VALUES(?,?,?,?,?)";
        
        /* 2do: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(sql);
        
        /* 3ro: Establecer los datos */
        sentenciaPreparada.setString(1, null);
        sentenciaPreparada.setString(2, "Luis");
        sentenciaPreparada.setString(3, "Salmeron Ramirez");
        sentenciaPreparada.setInt(4, 30);
        sentenciaPreparada.setLong(5, 7571009980L);
        
        /* 4to: Ejecutar la sentencia preparada */
        int ejecucion = sentenciaPreparada.executeUpdate();
        
        /* 5to: Imprimir si el usuario fue agregado o no */
        System.out.println("Usuario agregado: " + ejecucion);
        
        /* 6to: Cerrar la sentcia preparada */
        sentenciaPreparada.close();
        
        /* 7mo: ¿Como cerrar la conexion? */
        /*      ¿Dejar de usar static y usar un objeto? */
        
    }
}
