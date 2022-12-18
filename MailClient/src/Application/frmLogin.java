/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import BusinessLayer.MailDTO;
import BusinessLayer.UserDTO;
import DataLayer.DBAccess;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class frmLogin extends javax.swing.JFrame {

    public static String USER;

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
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
    txtUsername = new javax.swing.JTextField();
    btnLogin = new javax.swing.JButton();
    btnClose = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtPassword = new javax.swing.JPasswordField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    txtUsername.setText("truongnhon");

    btnLogin.setText("Login");
    btnLogin.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          btnLoginActionPerformed(evt);
        }
      }
    );

    btnClose.setText("Close");
    btnClose.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          btnCloseActionPerformed(evt);
        }
      }
    );

    jLabel1.setText("Username");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel4.setText("Login");

    jLabel2.setText("Password");

    txtPassword.setText("123");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
      getContentPane()
    );
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          layout
                            .createSequentialGroup()
                            .addComponent(
                              btnLogin,
                              javax.swing.GroupLayout.PREFERRED_SIZE,
                              73,
                              javax.swing.GroupLayout.PREFERRED_SIZE
                            )
                            .addGap(28, 28, 28)
                            .addComponent(
                              btnClose,
                              javax.swing.GroupLayout.PREFERRED_SIZE,
                              73,
                              javax.swing.GroupLayout.PREFERRED_SIZE
                            )
                        )
                        .addGroup(
                          layout
                            .createSequentialGroup()
                            .addGroup(
                              layout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.LEADING
                                )
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                            )
                            .addGap(37, 37, 37)
                            .addGroup(
                              layout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.LEADING,
                                  false
                                )
                                .addComponent(
                                  txtUsername,
                                  javax.swing.GroupLayout.DEFAULT_SIZE,
                                  217,
                                  Short.MAX_VALUE
                                )
                                .addComponent(txtPassword)
                            )
                        )
                    )
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(154, 154, 154)
                    .addComponent(
                      jLabel4,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      59,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addContainerGap(59, Short.MAX_VALUE)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          layout
            .createSequentialGroup()
            .addGap(19, 19, 19)
            .addComponent(
              jLabel4,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(
                  txtUsername,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(
                  txtPassword,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(29, 29, 29)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnClose)
                .addComponent(btnLogin)
            )
            .addGap(29, 29, 29)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      // TODO add your handling code here:
      try {
          String username = txtUsername.getText();
          String password = txtPassword.getText().toString();
          UserDTO obj = new UserDTO();
          obj.Login(username, password);
          USER = username;
      } catch (Exception e) {
      }
  }//GEN-LAST:event_btnLoginActionPerformed

  private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
      // TODO add your handling code here:
      dispose();
  }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger
                    .getLogger(frmLogin.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger
                    .getLogger(frmLogin.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger
                    .getLogger(frmLogin.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger
                    .getLogger(frmLogin.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(
                new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        }
        );
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnClose;
  private javax.swing.JButton btnLogin;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPasswordField txtPassword;
  private javax.swing.JTextField txtUsername;
  // End of variables declaration//GEN-END:variables
}
