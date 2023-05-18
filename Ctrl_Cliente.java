package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Cliente;

/**
 *
 * @author Héctor Sifuentes
 */
public class Ctrl_Cliente {

    //metodo para registrar un nuevo cliente
    public boolean guardar(Cliente objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_Cliente values (?,?,?,?,?,?,?)");
            consulta.setInt(1, 0); //Id_Cliente
            consulta.setString(2, objeto.getNombre()); //nombres
            consulta.setString(3, objeto.getApellido()); //apellidos
            consulta.setString(4, objeto.getCedula()); //cedula
            consulta.setString(5, objeto.getTelefono()); //telefono_Cliente
            consulta.setString(6, objeto.getDireccion()); //direccion
            consulta.setInt(7, objeto.getEstado()); //estado          

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar cliente: " + e);
        }

        return respuesta;
    }

    //metodo para consultar la existencia de un cliente
    public boolean existeCliente(String cedula) {
        boolean respuesta = false;

        String sql = "select cedula from tb_Cliente where cedula = '" + cedula + "';";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar cliente: " + e);
        }
        return respuesta;
    }

    //metodo para Actualizar cliente
    public boolean actualizar(Cliente objeto, int Id_Cliente) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_Cliente set nombre = ?, apellido = ?, cedula = ?, telefono = ?, direccion = ?, estado = ?  where Id_Cliente='" + Id_Cliente + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getCedula());
            consulta.setString(4, objeto.getTelefono());
            consulta.setString(5, objeto.getDireccion());
            consulta.setInt(6, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cliente: " + e);
        }
        return respuesta;
    }

    //metodo para Eliminar cliente
    public boolean eliminar(int Id_Cliente) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_Cliente where Id_Cliente='" + Id_Cliente +"'");
            consulta.executeUpdate();           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e);
        }
        return respuesta;
    }
}
