package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Producto;

/**
 *
 * @author Héctor Sifuentes
 */
public class Ctrl_Producto {

    //metodo para registrar un nuevo producto
    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_Producto values (?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0); //Id_Producto
            consulta.setString(2, objeto.getNombre()); //nombre
            consulta.setInt(3, objeto.getId_Proveedor()); //Id_proveedor
            consulta.setInt(4, objeto.getCantidad()); //cantidad
            consulta.setDouble(5, (double) objeto.getPrecio()); //precio
            consulta.setString(6, objeto.getDescripcion()); //descripcion
            consulta.setInt(7, objeto.getPorcentajeIva()); //Iva
            consulta.setInt(8, objeto.getId_Categoria()); //Id_categoria
            consulta.setInt(9, objeto.getEstado()); //estado

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }

        return respuesta;
    }

    //metodo para consultar la existencia del producto
    public boolean existeProducto(String producto) {
        boolean respuesta = false;

        String sql = "select nombre from tb_Producto where nombre = '" + producto + "';";
        Statement st;

        try {

            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar producto: " + e);
        }
        return respuesta;
    }

    //metodo para Actualizar producto
    public boolean actualizar(Producto objeto, int Id_Producto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_Producto set nombre = ?, Id_Proveedor = ?, cantidad = ?, precio = ?, descripcion = ?, porcentajeIva = ?, Id_Categoria = ?, estado = ?  where Id_Producto='" + Id_Producto + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getId_Proveedor());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getPorcentajeIva());
            consulta.setInt(7, objeto.getId_Categoria());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e);
        }

        return respuesta;
    }

    //metodo para Eliminar producto
    public boolean eliminar(int Id_Producto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_Producto where Id_Producto='" + Id_Producto + "'");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e);
        }
        return respuesta;
    }

    //metodo para actualizar stock de un producto
    public boolean actualizarStock(Producto objeto, int Id_Producto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_Producto set cantidad = ? where Id_Producto='" + Id_Producto + "'");
            consulta.setInt(1, objeto.getCantidad());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar stock del producto: " + e);
        }
        return respuesta;
    }
}
