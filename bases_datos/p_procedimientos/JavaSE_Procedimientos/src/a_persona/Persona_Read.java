package a_persona;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilidades.ConexionMySQL;

/**
 *
 * @author abi
 */
public class Persona_Read {

    public static void main(String[] args) {

        String consulta = "{CALL persona_read()}";

        try (CallableStatement cs = ConexionMySQL.getCallableStatement(consulta);
                ResultSet resultados = cs.executeQuery();) {

            System.out.println("id_persona  nombre  apellidos");
            while (resultados.next()) {
                int idPersona = resultados.getInt("id_persona");
                String nombre = resultados.getString("nombre");
                String apellidos = resultados.getString("apellidos");

                System.out.print(idPersona + " ");
                System.out.print(nombre + " ");
                System.out.print(apellidos + "\n");
            }

            resultados.close();
            cs.close();

        } catch (SQLException e) {
            System.out.println("e = " + e);
        }

    }
}
