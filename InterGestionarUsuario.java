package vista;

import conexion.Conexion;
import controlador.Ctrl_Usuario;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

/**
 *
 * @author Héctor Sifuentes
 */
public class InterGestionarUsuario extends javax.swing.JInternalFrame {

    private int Id_Usuario = 0;

    public InterGestionarUsuario() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("GESTIONAR USUARIOS.");
        //carga tabla    
        this.CargarTablaUsuarios();

        //insertar imagen en el JLabel_walpaper
        ImageIcon wallpaper = new ImageIcon("src/img/fondoPantalla.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(900, 500, WIDTH));
        jLabel_walpaper.setIcon(icono);
        this.repaint(); //se guardan los cambios para la imagen        
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Usuarios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        txt_Password = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jLabel_walpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRAR EMPLEADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 300, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_Usuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 710, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre(s):");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        txt_Usuario.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jPanel3.add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 160, -1));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password:");
        jLabel3.setToolTipText("");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellido(s):");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 90, -1));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Teléfono:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 80, -1));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Usuario:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 70, -1));

        txt_Telefono.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jPanel3.add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 190, -1));

        txt_Password.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });
        jPanel3.add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 200, -1));

        txt_Apellido.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jPanel3.add(txt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 190, -1));

        txt_Nombre.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        jPanel3.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 200, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Actualizar.setBackground(new java.awt.Color(0, 204, 102));
        jButton_Actualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_Actualizar.setText("ACTUALIZAR");
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        jButton_Eliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Eliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_Eliminar.setText("ELIMINAR");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 140, 270));
        getContentPane().add(jLabel_walpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, 900, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed

       Usuario usuario = new Usuario();
       Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
       
       if(Id_Usuario == 0){
           JOptionPane.showMessageDialog(null, "¡SELECCIONE UN EMPLEADO!");
       }else{
           
           if(txt_Nombre.getText().isEmpty() || txt_Apellido.getText().isEmpty() || txt_Usuario.getText().isEmpty()
                   || txt_Password.getText().isEmpty() || txt_Telefono.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "COMPLETA TODOS LOS CAMPOS");
           }else{
               usuario.setNombre(txt_Nombre.getText().trim());
               usuario.setApellido(txt_Apellido.getText().trim());
               usuario.setUsuario(txt_Usuario.getText().trim());
               usuario.setPassword(txt_Password.getText().trim());
               usuario.setTelefono(txt_Telefono.getText().trim());
               usuario.setEstado(1);
               if(controlUsuario.actualizar(usuario, Id_Usuario)){
                    JOptionPane.showMessageDialog(null, "¡ACTUALIZACIÓN DE DATOS DEL EMPLEADO EXITOSA!");
                    this.Limpiar();
                    this.CargarTablaUsuarios();
                    Id_Usuario = 0;
               }else{
                    JOptionPane.showMessageDialog(null, "¡ERROR AL ACTUALIZAR DATOS DEL EMPLEADO!");
               }
               
           }
           
       }        

    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
           
        Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
        
        if(Id_Usuario == 0){
             JOptionPane.showMessageDialog(null, "¡SELECCIONE UN EMPLEADO!");
        }else{
            
            if(!controlUsuario.eliminar(Id_Usuario)){
            JOptionPane.showMessageDialog(null, "¡EMPLEADO ELIMINADO!");
            this.CargarTablaUsuarios();
            this.Limpiar();
            Id_Usuario = 0;
            }
            else{
            JOptionPane.showMessageDialog(null, "¡ERROR AL ELIMINAR EMPLEADO!");   
            this.Limpiar();
            }
        }
    }//GEN-LAST:event_jButton_EliminarActionPerformed

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordActionPerformed

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_walpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_Usuarios;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables

    /* METODO PARA LIMPIAR CAMPOS */
    private void Limpiar() {
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Usuario.setText("");
        txt_Password.setText("");
        txt_Telefono.setText("");
    }


    /*  
    ** Método para mostrar los usuarios registrados **
     */
    private void CargarTablaUsuarios() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select * from tb_Usuario";
        Statement st;

        try {

            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarUsuario.jTable_Usuarios = new JTable(model);
            InterGestionarUsuario.jScrollPane1.setViewportView(InterGestionarUsuario.jTable_Usuarios);

            model.addColumn("N°"); //Id_Usuario (empleado)
            model.addColumn("Nombre(s)"); // Nombre_Usuario (empleado)
            model.addColumn("Apellido(s)"); // Apellido_Usuario (empleado)
            model.addColumn("Usuario"); // Usuario (empleado)
            model.addColumn("Password"); // Password_Usuario (empleado)
            model.addColumn("Teléfono"); // Telefono_Usuario (empleado)         
            model.addColumn("Estado"); // estado

            while (rs.next()) {

                Object fila[] = new Object[7];

                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error en el llenado de la tabla Usuario (empleado): " + e);
        }
        //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        jTable_Usuarios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_Usuarios.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    Id_Usuario = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosUsuarioSeleccionado(Id_Usuario);
                }
            }
        });
    }

    /* Metodo que envia datos seleccionados */
    private void EnviarDatosUsuarioSeleccionado(int Id_usuario) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from tb_Usuario where Id_Usuario = '" + Id_usuario + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_Nombre.setText(rs.getString("nombre"));
                txt_Apellido.setText(rs.getString("apellido"));
                txt_Usuario.setText(rs.getString("usuario"));
                txt_Password.setText(rs.getString("password"));
                txt_Telefono.setText(rs.getString("telefono"));
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al seleccionar usuario (empleado): " + e);
        }
    }

}
