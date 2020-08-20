
package listar;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class Seleccionar_Dos_Tablas {
    public static void main(String[] args) {
        
        
        String consulta = "{CALL listarAlumnoInformacion()}";
        
        try {
            
            CallableStatement cs = ConexionMySQL.getConexion().prepareCall(consulta);
            
            ResultSet resultados = cs.executeQuery();
            
            while (resultados.next()) {                
                
                int persona_idpersona = resultados.getInt("idpersona");
                String persona_nombre = resultados.getString("nombre");
                int informacion_edad = resultados.getInt("edad");
                double informacion_estatura = resultados.getDouble("estatura");
                int informacion_idpersona = resultados.getInt("idpersona");
                
                System.out.println(persona_idpersona + " " + persona_nombre + " " + informacion_edad + " " + informacion_estatura + " " + informacion_idpersona);
            }
            
            resultados.close();
            cs.close();
            
        } catch (SQLException e) {
            System.out.println("e = " + e);
        }
    }
}
