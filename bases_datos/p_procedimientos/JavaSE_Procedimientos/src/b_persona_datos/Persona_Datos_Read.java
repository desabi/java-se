
package b_persona_datos;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilidades.ConexionMySQL;

/**
 *
 * @author abi
 */
public class Persona_Datos_Read {
    public static void main(String[] args) {
        
        String consulta = "{CALL persona_datos_read()}";
        
        try {
            CallableStatement cs = ConexionMySQL.getCallableStatement(consulta);
            
            ResultSet resultados = cs.executeQuery();
            
            System.out.println("id_persona  nombre  apellidos  edad  estatura");
            
            while(resultados.next()) {
                System.out.print(resultados.getInt("id_persona") + " ");
                System.out.print(resultados.getString("nombre") + " ");
                System.out.print(resultados.getString("apellidos") + " ");
                System.out.print(resultados.getInt("edad") + " ");
                System.out.println(resultados.getDouble("estatura"));
            }
            
            resultados.close();
            cs.close();
            
        } catch (SQLException e) {
            System.out.println("e = " + e);
        }
    }
}
