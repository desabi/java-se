package listar;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class Selecionar_Una_Tabla {

    public static void main(String[] args) {

        String consulta = "{CALL listarPersona()}";

        try {
            
            CallableStatement cs = ConexionMySQL.getConexion().prepareCall(consulta);

            ResultSet resultados = cs.executeQuery();
            
            while (resultados.next()) {
                int id = resultados.getInt("idpersona");
                String nombre = resultados.getString("nombre");
                
                System.out.println(id + " - " + nombre);
                
            }
            
            resultados.close();
            cs.close();
            
        } catch (SQLException e) {
            System.out.println("e = " + e);
        }

    }
}
