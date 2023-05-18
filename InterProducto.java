package vista;

import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;

/**
 *
 * @author Héctor Sifuentes
 */
public class InterProducto extends javax.swing.JInternalFrame {

    int obtenerIdCategoriaCombo = 0;
    int obtenerIdProveedorCombo = 0;
    
    public InterProducto() {
        initComponents();
        this.setSize(new Dimension(460, 460));
        this.setTitle("NUEVO PRODUCTO");

        this.CargarComboCategorias();
        this.CargarComboMarca();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        jComboBox_Marca = new javax.swing.JComboBox<>();
        jComboBox_iva = new javax.swing.JComboBox<>();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        jButton_guardar = new javax.swing.JButton();
        jLabel_walpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUEVO PRODUCTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 190, 20));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 90, -1));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Marca:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, -1));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cantidad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, -1));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Precio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Descripción:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 110, -1));

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("IVA:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 90, -1));

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Categorías:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 90, -1));

        txt_nombre.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 210, -1));

        txt_cantidad.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 210, -1));

        txt_precio.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 210, -1));

        txt_descripcion.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        txt_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 210, -1));

        jComboBox_Marca.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        jComboBox_Marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE MARCA", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 220, -1));

        jComboBox_iva.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        jComboBox_iva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE IVA", "SIN IVA", "8%", "16%" }));
        getContentPane().add(jComboBox_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 210, -1));

        jComboBox_categoria.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE CATEGORÍA", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jButton_guardar.setBackground(new java.awt.Color(0, 102, 255));
        jButton_guardar.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jButton_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_guardar.setText("GUARDAR");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 140, 40));

        jLabel_walpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoCategoria.png"))); // NOI18N
        jLabel_walpaper.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel_walpaper.setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel_walpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -80, 470, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed

    private void txt_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionActionPerformed

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        Producto producto = new Producto();
        Ctrl_Producto controlProducto = new Ctrl_Producto();
        String marca = "";
        String iva = "";
        String categoria = "";
        marca = jComboBox_Marca.getSelectedItem().toString().trim();
        iva = jComboBox_iva.getSelectedItem().toString().trim();
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();

        //validar campos
        if (txt_nombre.getText().equals("") || txt_cantidad.getText().equals("") || txt_precio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "COMPLETA TODOS LOS CAMPOS");
            txt_nombre.setBackground(new Color(250, 70, 70));
            txt_cantidad.setBackground(new Color(250, 70, 70));
            txt_precio.setBackground(new Color(250, 70, 70));
        } else {
            //consulta para comprobar la existencia del producto
            if (!controlProducto.existeProducto(txt_nombre.getText().trim())) {
               
                if(marca.equals("--SELECCIONE MARCA")) {
                   JOptionPane.showMessageDialog(null, "SELECCIONE MARCA.");  }
                    else { if (iva.equals("--SELECCIONE IVA")) {
                      JOptionPane.showMessageDialog(null, "SELECCIONE IVA."); }
                       else { if (categoria.equalsIgnoreCase("--SELECCIONE CATEGORÍA")) {
                        JOptionPane.showMessageDialog(null, "SELECCIONE CATEGORIA."); }                   
                           else {
                               try {                            
                              producto.setNombre(txt_nombre.getText().trim());
                              
                             //Id_Proveedor--> metodo que obtiene la id del proveedor 
                             this.IdProveedor();
                             producto.setId_Proveedor(obtenerIdProveedorCombo);
                                                          
                              producto.setCantidad(Integer.parseInt(txt_cantidad.getText().trim()));
                              String precioTxt = "";
                              double precio = 0.0;
                              
                              precioTxt = txt_precio.getText().trim();
                              boolean aux = false;
                              
                              /* Si el usuario ingresa , como punto decimal,
                                    lo transformamos a punto (.)
                              */
                              for (int i = 0; i < precioTxt.length(); i++) {
                                  if(precioTxt.charAt(i) == ','){
                                       String precioNuevo = precioTxt.replace(",", ".");
                                       precio = Double.parseDouble(precioNuevo);
                                       aux = true;
                                  }
                              }                          
                             /*evaluar la condicion*/ 
                             if(aux == true){
                                 producto.setPrecio(precio);
                             } else{
                                 precio = Double.parseDouble(precioTxt);
                                 producto.setPrecio(precio);
                             }
                             
                            producto.setDescripcion(txt_descripcion.getText().trim());
                            //PORCENTAJE DE IVA
                            if(iva.equalsIgnoreCase("SIN IVA")){
                                producto.setPorcentajeIva(0);
                            }
                            else if(iva.equalsIgnoreCase("8%")){
                                producto.setPorcentajeIva(8); 
                            }
                            else if(iva.equalsIgnoreCase("16%")){
                                 producto.setPorcentajeIva(16);
                            }
                            
                            //Id_Categoria--> metodo que obtiene la id de la categoria
                            this.IdCategoria();
                            producto.setId_Categoria(obtenerIdCategoriaCombo);
                            producto.setEstado(1);
                            
                            if(controlProducto.guardar(producto)){
                         JOptionPane.showMessageDialog(null, "PRODUCTO GUARDADO."); 
                          txt_nombre.setBackground(new Color(46, 255, 59));
                          this.CargarComboMarca();
                          this.jComboBox_Marca.setSelectedItem("--SELECCIONE MARCA");
                                  
                          txt_cantidad.setBackground(new Color(46, 255, 59));
                          txt_precio.setBackground(new Color(46, 255, 59)); 
                          txt_descripcion.setBackground(new Color(46, 255, 59));
                          
                          this.CargarComboCategorias();
                          this.jComboBox_iva.setSelectedItem("--SELECCIONE IVA");
                          this.Limpiar();
                            }else{
                         JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR PRODUCTO.");       
                            }                                                       
                          }
                          
                          catch(Exception e){
                              System.out.println("Error en: "+e);
                          }
                       }  
                    }  
                }
            } else {
                JOptionPane.showMessageDialog(null, "YA EXISTE EL PRODUCTO EN LA BASE DE DATOS");
            }
        }
    }//GEN-LAST:event_jButton_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JComboBox<String> jComboBox_Marca;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JComboBox<String> jComboBox_iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_walpaper;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables


      /* METODO PARA LIMPIAR CAMPOS */
    private void Limpiar(){
        txt_nombre.setText("");
        txt_cantidad.setText("");
        txt_precio.setText("");
        txt_descripcion.setText("");
    }
    
    /* METODO PARA CARGAR LAS CATEGORIAS */
    private void CargarComboCategorias() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_Categoria";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_categoria.removeAllItems(); //quita los Items por defecto
            jComboBox_categoria.addItem("--SELECCIONE CATEGORÍA");
            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("descripcion"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar categorias: " + e);
        }
    }
    
    /* METODO PARA OBTENER ID_CATEGORIA */
    private int IdCategoria(){
        String sql = "select * from tb_Categoria where descripcion = '" + this.jComboBox_categoria.getSelectedItem() + "'";
        Statement st;
        
        try{
           
           Connection cn = Conexion.conectar();
           st = cn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           
           while(rs.next()){
               obtenerIdCategoriaCombo = rs.getInt("Id_Categoria");
           }
            
        }catch(SQLException e){
            System.out.println("Error al obtener las categorias: "+e);
        }
     return obtenerIdCategoriaCombo;    
    }

     /* METODO PARA CARGAR LAS MARCAS DE LOS PRODUCTOS */
    private void CargarComboMarca() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_Proveedor";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_Marca.removeAllItems(); //quita los Items por defecto
            jComboBox_Marca.addItem("--SELECCIONE MARCA");
            while (rs.next()) {
                jComboBox_Marca.addItem(rs.getString("empresa"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar marcas de productos: " + e);
        }
    }
   
   /* METODO PARA OBTENER ID_PROVEEDOR */
    private int IdProveedor(){
        String sql = "select * from tb_Proveedor where empresa = '" + this.jComboBox_Marca.getSelectedItem() + "'";
        Statement st;
        
        try{
           
           Connection cn = Conexion.conectar();
           st = cn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           
           while(rs.next()){
               obtenerIdProveedorCombo = rs.getInt("Id_Proveedor");
           }
            
        }catch(SQLException e){
            System.out.println("Error al obtener las marcas de los productos: "+e);
        }
     return obtenerIdProveedorCombo;    
    }  
    
    
}