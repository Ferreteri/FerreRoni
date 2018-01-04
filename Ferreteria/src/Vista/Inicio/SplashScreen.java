/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Inicio;


import com.sun.awt.AWTUtilities;
import controlador.Coordinator;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author sistema
 */
public class SplashScreen extends javax.swing.JFrame {

    private Coordinator CLassCoordinador; //objeto miCoordinador que permite la relacion entre esta clase y la clase coordinador
    
     SplashScreen spl = this;
     
     
    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
        
        AWTUtilities.setWindowOpaque(this, false);
        //setUndecorated(false); 
        this.setIconImage(new ImageIcon(getClass().getResource("/Recursos/Imagenes/Inicio/logo.png")).getImage());
        this.setLocationRelativeTo(null);
        this.progreso.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        startThread();
        
    }
    void startThread() 
    {
        Thread hi = new Thread(new Runnable() {
            @Override
            public void run() {
                Login ven = new Login(spl);
                ven.setLocationRelativeTo(null);
                ven.setVisible(true);
                dispose();
            }
        });
        hi.start();
    }
     public JProgressBar getJProgressBar() 
     {
        return progreso;
     }

    public JLabel getJLabel() 
    {
        return texto;
    }
    
    
    public void setCoordinador(Coordinator CLassCoordinador) {
		this.CLassCoordinador=CLassCoordinador;
	}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progreso = new javax.swing.JProgressBar();
        texto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(progreso);
        progreso.setBounds(0, 280, 480, 14);

        texto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        texto.setForeground(new java.awt.Color(102, 204, 255));
        texto.setText("jLabel2");
        getContentPane().add(texto);
        texto.setBounds(10, 240, 220, 40);

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar progreso;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
