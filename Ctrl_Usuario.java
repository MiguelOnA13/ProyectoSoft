package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Héctor Sifuentes
 */
public class Ctrl_Usuario {
    
     //metodo para guardar un nuevo usuario(empleado)
    public boolean guardar(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_Usuario values (?,?,?,?,?,?,?)");
            consulta.setInt(1, 0); //Id_usuario
            consulta.setString(2, objeto.getNombre()); //nombres del empleado
            consulta.setString(3, objeto.getApellido()); //apellidos del empleado
            consulta.setString(4, objeto.getUsuario()); //usuario del empleado
            consulta.setString(5, objeto.getPassword()); //contraseña del empleado
            consulta.setString(6, objeto.getTelefono()); //telefono del empleado
            consulta.setInt(7, objeto.getEstado()); //direccion
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar usuario(empleado): " + e);
        }

        return respuesta;
    }

    //metodo para consultar la existencia de un usuario(empleado)
    public boolean existeUsuario(String usuario) {
        boolean respuesta = false;

        String sql = "select usuario from tb_Usuario where usuario = '" + usuario + "';";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar usuario(empleado): " + e);
        }
        return respuesta;
    }

    //metodo para Actualizar usuario (empleado)
    public boolean actualizar(Usuario objeto, int Id_Usuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_Usuario set nombre = ?, apellido = ?, usuario = ?, password = ?, telefono = ?, estado = ?  where Id_Usuario='" + Id_Usuario + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getUsuario());
            consulta.setString(4, objeto.getPassword());
            consulta.setString(5, objeto.getTelefono());
            consulta.setInt(6, objeto.getEstado());                   

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario (empleado): " + e);
        }

        return respuesta;
    }

    //metodo para Eliminar usuario (empleado)
    public boolean eliminar(int Id_Usuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_Usuario where Id_Usuario='" + Id_Usuario + "'");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario (empleado): " + e);
        }
        return respuesta;
    }

    
    //metodo para Iniciar_Sesion
    public boolean loginUser(Usuario objeto) {

        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "select usuario, password from tb_Usuario where usuario = '" + objeto.getUsuario() + "' and password = '" + objeto.getPassword() + "'";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión ");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión ");
        }
        return respuesta;
    }
}
