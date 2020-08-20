
package c_venta;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * Autor:    Abi
 */

public class Venta {
    
    private int idVenta;
    private String producto;
    private String pedido;
    private String entregado;

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getEntregado() {
        return entregado;
    }

    public void setEntregado(String entregado) {
        this.entregado = entregado;
    }
    
    public void listar() {
        
        /* 1ro: Crear la consulta */
        String consultaSELECT = "SELECT idventa, producto, pedido, entregado FROM venta";
        
        /* 2do: Obtener los registros */
        ResultSet registros = ConexionMySQL.getRegistros(consultaSELECT);
        
        
        try {
            
            /* 3ro: Recorrer los registros */
            while (registros.next()) {
                
                /* 4to: Obtener los datos */
                idVenta = registros.getInt("idventa");
                producto = registros.getString("producto");
                pedido = registros.getString("pedido");
                entregado = registros.getString("entregado");
                
                /* 5to: Imprimir los registros */
                System.out.print(idVenta + " * ");
                System.out.print(producto + " * ");
                System.out.print(pedido + " * ");
                System.out.println(entregado + " * ");
                System.out.println("");
            }
            
            /* 6o: Cerrar los registros */
            registros.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al obtener los registros.\n\n");
            System.out.println("El error es:\n\n"+e);
            
        }
    }
    
    public void insertar() {
        
        /* 1ro: Crear la consulta */
        String consultINSERT = "INSERT INTO venta VALUES (?, ?, ?, ?)";
        
        /* 2do: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultINSERT);
        
        try {
            
            /* 3ro: Colocar datos a la sentencia preparada */
            sentenciaPreparada.setString(1, null);            // id de la venta
            sentenciaPreparada.setString(2, this.producto);   // nombre del producto
            sentenciaPreparada.setString(3, pedido);          // fecha del pedido
            sentenciaPreparada.setString(4, this.entregado);  // fecha de entrega
            
            /* 4to: Ejecutar la sentencia preparada */
            int insercion = sentenciaPreparada.executeUpdate();
            
            /* 5to: Imprimir el resultado de la insercion */
            System.out.println("insercion = " + insercion);
            
            /* 6to: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al insertar la venta");
            System.out.println("El error es:\n\n"+e);
            
        }
    }
    
    public void actualizar() {
        
        /* 1ro: Crear la consulta */
        String consultaUPDATE = "UPDATE venta SET producto = ?, pedido = ?, entregado = ? WHERE idventa = ?";
        
        /* 2do: Obtener la sentencia prepada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaUPDATE);
        
        
        try {
            
            /* 3ro: Colocar datos a la sentencia preparada */
            sentenciaPreparada.setString(1, producto);  // nuevo producto 
            sentenciaPreparada.setString(2, pedido);    // nueva fecha de pedido
            sentenciaPreparada.setString(3, entregado); // nueva decha de entreda
            sentenciaPreparada.setInt(4, idVenta);   // id del producto a actualizar
            
            /* 4to: Ejecutar la sentencia preparada */
            int actualizacion = sentenciaPreparada.executeUpdate();
            
            /* 5to: Imprimir el resultado de la actualizacion */
            System.out.println("actualizacion = " + actualizacion);
            
            /* 6to: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al actualizar el producto.\n\n");
            System.out.println("El error es:\n\n"+e);
            
        }
    }
    
    public void eliminar() {
        
        /* 1ro: Crear la consulta */
        String consultaDELETE = "DELETE FROM venta WHERE idventa = ?";
        
        /* 2do: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaDELETE);
        
        try {
            
            /* 3ro: Colocaar datos a la sentencia preparada */
            sentenciaPreparada.setInt(1, idVenta);   // id de la venta a eliminar
            
            /* 4to: Ejecutar la sentencia preparada */
            int eliminacion = sentenciaPreparada.executeUpdate();
            
            /* 5to: Imprimir el resultado de la eliminacion */
            System.out.println("eliminacion = " + eliminacion);
            
            /* 6to: Cerra la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al eliminar la venta.\n\n");
            System.out.println("El error es:\n\n" + e);
            
        }
    }
    
}
