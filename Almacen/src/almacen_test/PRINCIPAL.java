/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen_test;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yulian andres
 */
public class PRINCIPAL extends javax.swing.JFrame {
   int i=-1;
   Conexiones conectar = new Conexiones();
    private Component componentePadre;
    private int currentId;
    /**
     * Creates new form PRINCIPALKARDEX
     */
     
    public PRINCIPAL() {
            initComponents();
            this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            this.setResizable(false);
            resulTable();
            Enable(false);
                 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pentrada = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproductos = new javax.swing.JTable();
        panel_datos1 = new javax.swing.JPanel();
        PROVEEDOR = new javax.swing.JTextField();
        REFERENCIA = new javax.swing.JTextField();
        nombre1 = new javax.swing.JLabel();
        referncia1 = new javax.swing.JLabel();
        CANTIDAD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Precio1 = new javax.swing.JLabel();
        VALOR = new javax.swing.JTextField();
        NOMBRE_PRODUCT = new javax.swing.JTextField();
        nombre2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox();
        salir = new javax.swing.JButton();
        AGREGAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pentrada.setBackground(new java.awt.Color(204, 204, 255));

        tablaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablaproductosMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaproductosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaproductos);

        panel_datos1.setBackground(new java.awt.Color(204, 255, 204));

        PROVEEDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROVEEDORActionPerformed(evt);
            }
        });

        REFERENCIA.setToolTipText("");
        REFERENCIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFERENCIAActionPerformed(evt);
            }
        });

        nombre1.setText("NOMBRE PROVEEDOR");

        referncia1.setText("REFERENCIA PRODUCTO");

        CANTIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANTIDADActionPerformed(evt);
            }
        });

        jLabel2.setText("CANTIDAD");

        Precio1.setText("VALOR UNIT ($)*");

        NOMBRE_PRODUCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBRE_PRODUCTActionPerformed(evt);
            }
        });

        nombre2.setText("NOMBRE PRODUCTO");

        jLabel3.setText("CATEGORIA");

        categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Celulares", "Computadores", "Tablets", "Varios" }));
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_datos1Layout = new javax.swing.GroupLayout(panel_datos1);
        panel_datos1.setLayout(panel_datos1Layout);
        panel_datos1Layout.setHorizontalGroup(
            panel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(referncia1)
                    .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(55, 55, 55)
                .addGroup(panel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NOMBRE_PRODUCT, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addComponent(PROVEEDOR, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addGroup(panel_datos1Layout.createSequentialGroup()
                        .addComponent(CANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(Precio1)
                        .addGap(35, 35, 35)
                        .addComponent(VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(REFERENCIA, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel_datos1Layout.setVerticalGroup(
            panel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(REFERENCIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(referncia1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre1)
                    .addComponent(PROVEEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre2)
                    .addComponent(NOMBRE_PRODUCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Precio1))
                    .addGroup(panel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        salir.setText("salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        AGREGAR.setText("GUARDAR PRODUCTO");
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });

        jLabel1.setText("De doble clic sobre algun producto");

        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pentradaLayout = new javax.swing.GroupLayout(pentrada);
        pentrada.setLayout(pentradaLayout);
        pentradaLayout.setHorizontalGroup(
            pentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pentradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_datos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pentradaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(149, 149, 149)
                        .addComponent(AGREGAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(ELIMINAR)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)
                        .addGap(40, 40, 40)
                        .addComponent(salir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        pentradaLayout.setVerticalGroup(
            pentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pentradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(salir)
                        .addComponent(jButton1)
                        .addComponent(ELIMINAR))
                    .addGroup(pentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(AGREGAR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Almacen", pentrada);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
   
    
private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed
    
    int confirmado = JOptionPane.showConfirmDialog(componentePadre,"¿Lo confirmas?");
       if (JOptionPane.OK_OPTION == confirmado){
    
        String Categoria = (String)categoria.getSelectedItem();
              
        conectar.connect();
        String sql = "INSERT INTO `productos`( `idProductos`,`Nombre`,`Referencia`, `Cantidad`, `Valor`, `Categoria`, `Proveedor`) "
                + "VALUES(NULL,'" + this.NOMBRE_PRODUCT.getText()+ "','" +REFERENCIA.getText() + "','" + CANTIDAD.getText() + "','" + VALOR.getText() + "','" + Categoria + "','" + this.PROVEEDOR.getText() + "');";
            


        try {
            if(GetCurrentId() != 0){
               sql ="UPDATE productos SET Nombre = ?,Referencia = ?,Cantidad = ?,Valor = ?,Categoria = ?,Proveedor = ? WHERE idProductos = "+GetCurrentId();
               System.out.print("update =="+sql);
               PreparedStatement pst = conectar.conDB.prepareStatement(sql);// con esta sentencia se insertan los datos en la base de datos
                pst.setString(1,  this.NOMBRE_PRODUCT.getText());
                pst.setString(2, REFERENCIA.getText());
                pst.setString(3,  CANTIDAD.getText() );
                pst.setString(4, VALOR.getText());
                pst.setString(5, Categoria);
                pst.setString(6, this.PROVEEDOR.getText());
                int n = pst.executeUpdate();//valida si se guardaron los datos; si pst>0 entonces se actualizaron
                if(n > 0){
                 JOptionPane.showMessageDialog(this, "Producto Actualizado", "Almacen", 1);
                 resulTable();
                }
                SetCurrentId(0);
        }else{
            java.sql.Statement stm = conectar.conDB.createStatement();
            i=stm.executeUpdate(sql);
            if(i !=0){
               JOptionPane.showMessageDialog(this, "Nuevo Producto ingresado", "Almacen", 1);
               resulTable();
               GetCurrentId();
            }
            stm.close();
           }
            
            conectar.disconnect();
          } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "ERROR" + ex, " KARDEX", 0);
        }
      }
}//GEN-LAST:event_AGREGARActionPerformed

private void NOMBRE_PRODUCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBRE_PRODUCTActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_NOMBRE_PRODUCTActionPerformed

private void CANTIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANTIDADActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CANTIDADActionPerformed

private void REFERENCIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFERENCIAActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_REFERENCIAActionPerformed

private void PROVEEDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROVEEDORActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_PROVEEDORActionPerformed

private void tablaproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproductosMouseClicked

}//GEN-LAST:event_tablaproductosMouseClicked

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
             System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaActionPerformed

    private void tablaproductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproductosMousePressed
        // TODO add your handling code here:
        Enable(true);
        this.REFERENCIA.setEnabled(false);
        int j = this.tablaproductos.getSelectedRow();
        this.SetCurrentId(Integer.parseInt(""+tablaproductos.getValueAt(j,0)));
        System.out.print("valor"+GetCurrentId());
        this.NOMBRE_PRODUCT.setText("" + tablaproductos.getValueAt(j, 1));
        this.REFERENCIA.setText("" + tablaproductos.getValueAt(j, 2));
        this.CANTIDAD.setText("" + tablaproductos.getValueAt(j, 3));
        this.VALOR.setText("" +tablaproductos.getValueAt(j, 4));
        this.PROVEEDOR.setText("" + tablaproductos.getValueAt(j, 6));
        //this.activar.setEnabled(true);

    }//GEN-LAST:event_tablaproductosMousePressed

    private void tablaproductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproductosMouseEntered
        // TOD
    }//GEN-LAST:event_tablaproductosMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        initial();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        int confirmado = JOptionPane.showConfirmDialog(componentePadre,"Desea Eliminarlo?");
        if (JOptionPane.OK_OPTION == confirmado){
            try {
                conectar.connect();
                java.sql.Statement borrar = conectar.conDB.createStatement();
                int resultado = borrar.executeUpdate("DELETE FROM productos WHERE idProductos= '" +GetCurrentId()+ "'");
                if (resultado == 1){ //Una fila modificada
                    JOptionPane.showMessageDialog(this, "Producto Eliminado", "Almacen", 1);
                    resulTable();
                }
                borrar.close();
                conectar.disconnect();

            } catch (SQLException ex){
                System.err.print(ex.getMessage());
            }

        }
}//GEN-LAST:event_ELIMINARActionPerformed
 public void  Enable( Boolean enable){
        this.REFERENCIA.setEnabled(enable);
        this.PROVEEDOR.setEnabled(enable);
        NOMBRE_PRODUCT.setEnabled(enable);
        this.CANTIDAD.setEnabled(enable);
        this.VALOR.setEnabled(enable);
        
 
 }
 void initial(){
        Enable(true);
        this.SetCurrentId(0);
        this.REFERENCIA.setText("");
        this.PROVEEDOR.setText("");
        this.NOMBRE_PRODUCT.setText("");
        this.CANTIDAD.setText("");
        this.VALOR.setText("");
 }

/**
 * se encarga de llenar la jtabla con los datos que se encuetran en la base de datos
 */
 public void resulTable(){ 
      try {
            conectar.connect();
            java.sql.Statement stm = conectar.conDB.createStatement();

            ResultSet rst = stm.executeQuery("SELECT * FROM `productos`");
            this.tablaproductos.setModel(new ResultSetTable(rst));

            rst.close();
            conectar.disconnect();

        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "ERROR" + ex, " KARDEX", 0);
        }
      
    }
  public void SetCurrentId(int id){
     this.currentId=id;
  }
  public int GetCurrentId(){
    return this.currentId;
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PRINCIPAL().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGREGAR;
    public javax.swing.JTextField CANTIDAD;
    private javax.swing.JButton ELIMINAR;
    public javax.swing.JTextField NOMBRE_PRODUCT;
    public javax.swing.JTextField PROVEEDOR;
    private javax.swing.JLabel Precio1;
    public javax.swing.JTextField REFERENCIA;
    public javax.swing.JTextField VALOR;
    private javax.swing.JComboBox categoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JPanel panel_datos1;
    private javax.swing.JPanel pentrada;
    private javax.swing.JLabel referncia1;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaproductos;
    // End of variables declaration//GEN-END:variables
}