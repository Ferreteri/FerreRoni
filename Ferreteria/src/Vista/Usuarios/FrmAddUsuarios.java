/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Usuarios;

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
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        tipoUs = new org.bolivia.combo.SComboBoxBlue();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        textField6 = new java.awt.TextField();
        textField7 = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jRadioButton1.setText("Activo");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(140, 220, 55, 23);

        jRadioButton2.setText("Inabilitar");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(70, 220, 67, 23);

        tipoUs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO USUARIO", "ADMINISTRADOR", "NORMAL" }));
        tipoUs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(tipoUs);
        tipoUs.setBounds(261, 200, 183, 32);

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(48, 39, 36, 14);

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 40, 56, 14);

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 80, 37, 14);

        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 80, 37, 14);

        jLabel5.setText("Apellido Paterno");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 110, 78, 20);

        jLabel6.setText("Apellido Materno");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 110, 80, 14);

        jButton1.setText("Aceptar");
        getContentPane().add(jButton1);
        jButton1.setBounds(373, 311, 71, 23);

        jButton2.setText("Cancelar");
        getContentPane().add(jButton2);
        jButton2.setBounds(271, 311, 75, 23);

        jLabel7.setText("Edad");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 160, 24, 14);

        textField1.setText("textField1");
        getContentPane().add(textField1);
        textField1.setBounds(94, 69, 60, 20);

        textField2.setText("textField1");
        getContentPane().add(textField2);
        textField2.setBounds(94, 39, 60, 20);

        textField3.setText("textField1");
        getContentPane().add(textField3);
        textField3.setBounds(310, 40, 60, 20);

        textField4.setText("textField1");
        getContentPane().add(textField4);
        textField4.setBounds(100, 160, 60, 20);

        textField5.setText("textField1");
        getContentPane().add(textField5);
        textField5.setBounds(140, 110, 60, 20);

        textField6.setText("textField1");
        getContentPane().add(textField6);
        textField6.setBounds(310, 110, 60, 20);

        textField7.setText("textField1");
        getContentPane().add(textField7);
        textField7.setBounds(310, 70, 60, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    private java.awt.TextField textField7;
    private org.bolivia.combo.SComboBoxBlue tipoUs;
    // End of variables declaration//GEN-END:variables
}
