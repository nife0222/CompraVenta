/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentation;

import controllers.agentWindowController;
import sqlTables.ExternalUser;

/**
 *
 * @author Nicolas
 */
public class AgentWindow extends javax.swing.JFrame {
    private agentWindowController _controller;
    /**
     * Creates new form agentWindow
     */
    public AgentWindow(ExternalUser user) {
        _controller = new agentWindowController(user);
        initComponents();
        this.jLabelWelcome.setText("Welcome: " + user.getUserName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonChangePassword = new javax.swing.JButton();
        jButtonCreateNewUserAccount = new javax.swing.JButton();
        jButtonUsersMoneyDeposit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agent");

        jButtonChangePassword.setText("Change password");
        jButtonChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePasswordActionPerformed(evt);
            }
        });

        jButtonCreateNewUserAccount.setText("Create new user account");
        jButtonCreateNewUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateNewUserAccountActionPerformed(evt);
            }
        });

        jButtonUsersMoneyDeposit.setText("Make user money deposit");
        jButtonUsersMoneyDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsersMoneyDepositActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Agent Options");

        jLabelWelcome.setText("Welcome: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonChangePassword)
                            .addComponent(jButtonCreateNewUserAccount)
                            .addComponent(jButtonUsersMoneyDeposit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelWelcome)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jButtonChangePassword)
                .addGap(18, 18, 18)
                .addComponent(jButtonCreateNewUserAccount)
                .addGap(18, 18, 18)
                .addComponent(jButtonUsersMoneyDeposit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jLabelWelcome)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePasswordActionPerformed
        _controller.changePassword(this);
    }//GEN-LAST:event_jButtonChangePasswordActionPerformed

    private void jButtonCreateNewUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateNewUserAccountActionPerformed
        _controller.createNewUserAccount(this);
    }//GEN-LAST:event_jButtonCreateNewUserAccountActionPerformed

    private void jButtonUsersMoneyDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsersMoneyDepositActionPerformed
        _controller.makeUserMoneyDeposit(this);
    }//GEN-LAST:event_jButtonUsersMoneyDepositActionPerformed

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
            java.util.logging.Logger.getLogger(AgentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentWindow(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangePassword;
    private javax.swing.JButton jButtonCreateNewUserAccount;
    private javax.swing.JButton jButtonUsersMoneyDeposit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelWelcome;
    // End of variables declaration//GEN-END:variables
}
