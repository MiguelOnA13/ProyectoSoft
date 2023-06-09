package vista;

import controlador.Ctrl_Cliente;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author Héctor Sifuentes
 */
public class InterCliente extends javax.swing.JInternalFrame {
    
    public InterCliente() {
        initComponents();
        this.setSize(new Dimension(460, 380));
        this.setTitle("NUEVO CLIENTE");
     
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
        txt_Cedula = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        txt_Direccion = new javax.swing.JTextField();
        jButton_guardar = new javax.swing.JButton();
        txt_Apellidos = new javax.swing.JTextField();
        jLabel_walpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(472, 380));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("NUEVO CLIENTE");
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
        jLabel5.setText("DNI:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, -1));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Teléfono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Dirección:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 110, -1));

        txt_Nombres.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_Nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombresActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 270, -1));

        txt_Cedula.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 270, -1));

        txt_Telefono.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 270, -1));

        txt_Direccion.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 270, -1));

        jButton_guardar.setBackground(new java.awt.Color(102, 0, 102));
        jButton_guardar.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jButton_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_guardar.setText("GUARDAR");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 140, 40));

        txt_Apellidos.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApellidosActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 270, -1));

        jLabel_walpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoCliente.png"))); // NOI18N
        jLabel_walpaper.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel_walpaper.setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel_walpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -80, 470, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombresActionPerformed

    private void txt_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CedulaActionPerformed

    private void txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoActionPerformed

    private void txt_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DireccionActionPerformed

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
            
        Cliente cliente = new Cliente();
        Ctrl_Cliente controlCliente = new Ctrl_Cliente();
        
        if(!txt_Nombres.getText().isEmpty() && !txt_Apellidos.getText().isEmpty() && !txt_Cedula.getText().isEmpty()){
            //JOptionPane.showMessageDialog(null, "CORRECTO");
            if(!controlCliente.existeCliente(txt_Cedula.getText().trim())){
                
                cliente.setNombre(txt_Nombres.getText().trim());
                cliente.setApellido(txt_Apellidos.getText().trim());
                cliente.setCedula(txt_Cedula.getText().trim());
                cliente.setTelefono(txt_Telefono.getText().trim());
                cliente.setDireccion(txt_Direccion.getText().trim());
                cliente.setEstado(1);
               
                if(controlCliente.guardar(cliente)){
                    JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO");
                      txt_Nombres.setBackground(Color.green);
                      txt_Apellidos.setBackground(Color.green);
                      txt_Cedula.setBackground(Color.green);
                      txt_Telefono.setBackground(Color.green);
                      txt_Direccion.setBackground(Color.green);
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR REGISTRO"); 
                }
                
                
            }else{
               JOptionPane.showMessageDialog(null, "YA EXISTE EL CLIENTE EN LA BASE DE DATOS"); 
                 txt_Nombres.setBackground(Color.white);
                 txt_Apellidos.setBackground(Color.white);
                 txt_Cedula.setBackground(Color.white);
                 txt_Telefono.setBackground(Color.white);
                 txt_Direccion.setBackground(Color.white);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "COMPLETA TODOS LOS CAMPOS");
            txt_Nombres.setBackground(Color.red);
            txt_Apellidos.setBackground(Color.red);
            txt_Cedula.setBackground(Color.red);
            txt_Telefono.setBackground(Color.red);
            txt_Direccion.setBackground(Color.red);
        }
        //Metodo limpiar registros
        this.Limpiar();
    }//GEN-LAST:event_jButton_guardarActionPerformed

    private void txt_ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApellidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_walpaper;
    private javax.swing.JTextField txt_Apellidos;
    private javax.swing.JTextField txt_Cedula;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Nombres;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables


      /* METODO PARA LIMPIAR CAMPOS */
    private void Limpiar(){
        txt_Nombres.setText("");
        txt_Apellidos.setText("");
        txt_Cedula.setText("");
        txt_Telefono.setText("");
        txt_Direccion.setText("");
    }
    
    
    
    
}
