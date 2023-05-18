package vista;

import controlador.Ctrl_Usuario;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Héctor Sifuentes
 */
public class InterUsuario extends javax.swing.JInternalFrame {

    public InterUsuario() {
        initComponents();
        this.setSize(new Dimension(460, 380));
        this.setTitle("NUEVO EMPLEADO.");
        //INICIALIZANDO ESTADOS DEL PASSWORD
        txt_password.setVisible(true);
        txt_passwordVisible.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Nombres = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jButton_guardar = new javax.swing.JButton();
        txt_Apellidos = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jCheckBox_VerPassword = new javax.swing.JCheckBox();
        txt_passwordVisible = new javax.swing.JTextField();
        jLabel_walpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(472, 380));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("NUEVO EMPLEADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 180, 20));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre(s):");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 90, -1));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellidos(s):");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, -1));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Usuario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, -1));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Password:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Teléfono:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 110, -1));

        txt_Nombres.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_Nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombresActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 240, -1));

        txt_usuario.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 240, -1));

        txt_telefono.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 240, -1));

        jButton_guardar.setBackground(new java.awt.Color(102, 0, 102));
        jButton_guardar.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jButton_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_guardar.setText("GUARDAR");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 140, 40));

        txt_Apellidos.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApellidosActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 240, -1));

        txt_password.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 240, -1));

        jCheckBox_VerPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_VerPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox_VerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 30, 30));

        txt_passwordVisible.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_passwordVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordVisibleActionPerformed(evt);
            }
        });
        getContentPane().add(txt_passwordVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 240, -1));

        jLabel_walpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoCliente.png"))); // NOI18N
        jLabel_walpaper.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel_walpaper.setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel_walpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -80, 470, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombresActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        //validando espacio vacio
        if (txt_Nombres.getText().isEmpty() || txt_Apellidos.getText().isEmpty() || txt_usuario.getText().isEmpty()
                || txt_password.getText().isEmpty() || txt_telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "COMPLETE TODOS LOS CAMPOS");
        } else {
            //validando registro del empleado
            Usuario usuario = new Usuario();
            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
            if (!controlUsuario.existeUsuario(txt_usuario.getText().trim())) {
                //enviando datos del empleado
                usuario.setNombre(txt_Nombres.getText().trim());
                usuario.setApellido(txt_Apellidos.getText().trim());
                usuario.setUsuario(txt_usuario.getText().trim());
                usuario.setPassword(txt_password.getText().trim());
                usuario.setTelefono(txt_telefono.getText().trim());
                usuario.setEstado(1);

                if (controlUsuario.guardar(usuario)) {
                    JOptionPane.showMessageDialog(null, "¡EMPLEADO REGISTRADO!");
                    this.Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR EMPLEADO");
                }

            } else {
                JOptionPane.showMessageDialog(null, "¡¡EL EMPLEADO YA EXISTE, INGRESE OTRO!!");
            }

        }

    }//GEN-LAST:event_jButton_guardarActionPerformed

    private void txt_ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApellidosActionPerformed

    private void txt_passwordVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordVisibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordVisibleActionPerformed

    private void jCheckBox_VerPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_VerPasswordMouseClicked

        if (jCheckBox_VerPassword.isSelected() == true) { //SI LA CASILLA ES SELECCIONADA
            String pass = "";
            char[] passwordIngresado = txt_password.getPassword(); //ALMACENAMOS EN UN ARREGLO CHAR LO QUE HAY EN LA CAJA DE TEXTO
            for (int i = 0; i < passwordIngresado.length; i++) {
                pass += passwordIngresado[i];             //RECORREMOS EL ARREGLO Y SE LO PASAMOS AL STRING PASS
            }
            txt_passwordVisible.setText(pass); //SE TRANSCRIBE A LA CAJA DE TEXTO SIN ASTERISCOS LO QUE HAY EN LA VARIABLE PASS
            txt_password.setVisible(false); //SE DESACTIVA LA CAJA CON ASTERISCOS 
            txt_passwordVisible.setVisible(true); //SE HABILITA LA CAJA DE TEXTO SIN ASTERISCOS MOSTRANDO LA CONTRASEÑA
        } else {
            //SE INVIERTE 
            String passwordIngresado = txt_passwordVisible.getText().trim(); //SE PASA LO QUE HAY EN LA CAJA DE TEXTO SIN ASTERISCOS
            txt_password.setText(passwordIngresado); //SE ALMACENA LO DE LA VARIABLE A LA CAJA DE TEXTO CON ASTERISCOS
            txt_password.setVisible(true);  //SE ACTIVA LA CAJA CON ASTERISCOS
            txt_passwordVisible.setVisible(false); // SE DESACTIVA LA CAJA DE TEXTO passwordVisible con la contraseña MOSTRANDO ASTERISCOS
        }

    }//GEN-LAST:event_jCheckBox_VerPasswordMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JCheckBox jCheckBox_VerPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_walpaper;
    private javax.swing.JTextField txt_Apellidos;
    private javax.swing.JTextField txt_Nombres;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_passwordVisible;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables


    /* METODO PARA LIMPIAR CAMPOS */
    private void Limpiar() {
        txt_Nombres.setText("");
        txt_Apellidos.setText("");
        txt_usuario.setText("");
        txt_password.setText("");
        txt_telefono.setText("");

    }

}
