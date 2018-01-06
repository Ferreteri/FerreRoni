/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Usuarios;

import Modelo.VO.UsuariosVO;
import Utilerias.convertformato;
import javax.swing.JOptionPane;

/**
 *
 * @author sistema
 */
public class FrmAddUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form FrmAddUsuarios
     */
    public FrmAddUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRBActivo = new javax.swing.JRadioButton();
        txttipousuario = new org.bolivia.combo.SComboBoxBlue();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtCancela = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtcontrasena = new javax.swing.JPasswordField();
        txtApellidoM = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jRBActivo.setText("Activo /Inactivo");
        getContentPane().add(jRBActivo);
        jRBActivo.setBounds(100, 170, 160, 23);

        txttipousuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO USUARIO", "ADMINISTRADOR", "NORMAL" }));
        txttipousuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txttipousuario);
        txttipousuario.setBounds(261, 200, 183, 32);

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(48, 39, 36, 14);

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 40, 56, 14);

        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 80, 37, 14);

        jLabel5.setText("Apellido Paterno");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 80, 78, 20);

        jLabel6.setText("Apellido Materno");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 120, 80, 14);

        btnGuardar.setText("Aceptar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(373, 311, 71, 23);

        txtCancela.setText("Cancelar");
        txtCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancelaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCancela);
        txtCancela.setBounds(271, 311, 75, 23);

        jLabel7.setText("Edad");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(240, 110, 24, 14);

        txtcontrasena.setText("jPasswordField1");
        getContentPane().add(txtcontrasena);
        txtcontrasena.setBounds(290, 40, 100, 20);

        txtApellidoM.setText("jTextField1");
        getContentPane().add(txtApellidoM);
        txtApellidoM.setBounds(160, 110, 59, 20);

        txtNombre.setText("jTextField1");
        getContentPane().add(txtNombre);
        txtNombre.setBounds(130, 80, 59, 20);

        txtUsuario.setText("jTextField1");
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(120, 40, 59, 20);

        jTextField4.setText("jTextField1");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(120, 40, 59, 20);

        txtApellidoP.setText("jTextField1");
        getContentPane().add(txtApellidoP);
        txtApellidoP.setBounds(300, 80, 59, 20);

        txtEdad.setText("jTextField1");
        getContentPane().add(txtEdad);
        txtEdad.setBounds(300, 110, 59, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
                        try {
				UsuariosVO objUsuario=new UsuariosVO();
				//objUsuario.getUsuario(txtUsuario.getText());
				objUsuario.setContrasena(txtcontrasena.getText());
				objUsuario.setNombre(txtNombre.getText());
				objUsuario.setApellidoP(txtApellidoP.getText());
				objUsuario.setApellidoM(txtApellidoM.getText());
                                objUsuario.setEdad(Integer.parseInt(txtEdad.getText()));
                                objUsuario.setFechaRegistro(convertformato.FechaYHora());
                                objUsuario.setActivo(jRBActivo.isSelected());
                                objUsuario.setIdTipoUsuarioFK(Integer.parseInt(txttipousuario.getName()));
				
				//miCoordinador.registrarPersona(objUsuario);	
                                
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
			}


// TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancelaActionPerformed
        this.dispose();;        // TODO add your handling code here:
    }//GEN-LAST:event_txtCancelaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAddUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAddUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRBActivo;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JButton txtCancela;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtcontrasena;
    private org.bolivia.combo.SComboBoxBlue txttipousuario;
    // End of variables declaration//GEN-END:variables
}