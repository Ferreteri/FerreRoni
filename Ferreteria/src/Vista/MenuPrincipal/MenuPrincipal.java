/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.MenuPrincipal;

import Utilerias.EstatusInfo;
import Vista.Productos.frmProductos;
import Vista.Usuarios.FrmUsuarios;
import Vista.Ventas.FrmVentas;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author sistema
 */
public class MenuPrincipal extends javax.swing.JFrame {

  
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(int IdTipoUsuario,String Nombre) {
        
        initComponents();
        CargaUsuario(IdTipoUsuario,Nombre);
        this.setIconImage(new ImageIcon(getClass().getResource("/Recursos/Imagenes/MenuPrincipal/menu.png")).getImage());
        this.setSize(640, 365);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
    }

    
    private void CargaUsuario(int IdTipoUsuario,String Nombre)
    {
    
        
        if(IdTipoUsuario==EstatusInfo.TipoUsuario.Administrador.ordinal()){
          tipo.setText("Administrador");
          
        } else if(IdTipoUsuario==EstatusInfo.TipoUsuario.Vendedor.ordinal()){
            tipo.setText("Usuario");
            
        }

        nombre.setEditable(false);
        tipo.setEditable(false);
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
        BtnRegistrar = new javax.swing.JButton();
        btnProd = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        tipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        salir = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Bienvenido: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 150, 24);

        BtnRegistrar.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        BtnRegistrar.setText("Registrar usuarios");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRegistrar);
        BtnRegistrar.setBounds(0, 220, 160, 26);

        btnProd.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnProd.setText("Registrar productos ");
        btnProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnProd);
        btnProd.setBounds(170, 220, 160, 25);

        btnVentas.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnVentas.setText("Hacer ventas ");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas);
        btnVentas.setBounds(340, 220, 130, 26);

        tipo.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        getContentPane().add(tipo);
        tipo.setBounds(270, 20, 170, 29);

        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("version 1.0");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 318, 100, 15);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(574, 0, 4, 1);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(0, 0, 10, 0);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 190, 34, 15);

        salir.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        salir.setText("Salir ");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(490, 220, 110, 26);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 0, 0);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(620, 0, 10, 0);

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre);
        nombre.setBounds(450, 20, 201, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/MenuPrincipal/menu.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 640, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
       int ce;
        ce = JOptionPane.showConfirmDialog(this, "¿Esta apunto de abandonar el sistema desea continuar?","ADVERTENCIA" ,JOptionPane.YES_NO_OPTION);
       if(ce==JOptionPane.YES_OPTION){
           System.exit(1);
       }
        
    }//GEN-LAST:event_salirActionPerformed

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        // TODO add your handling code here:
        FrmUsuarios frame=new FrmUsuarios();frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tipoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_nombreActionPerformed

    private void btnProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdActionPerformed
        // TODO add your handling code here:
    frmProductos prod= new frmProductos();prod.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_btnProdActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        FrmVentas ventas= new FrmVentas();ventas.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_btnVentasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(0,"Null").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton btnProd;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField nombre;
    private javax.swing.JToggleButton salir;
    private javax.swing.JTextField tipo;
    // End of variables declaration//GEN-END:variables
}
