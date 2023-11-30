/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaswinggui;

/**
 *
 * @author jetro
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        jLabel1 = new javax.swing.JLabel();
        btnSB = new javax.swing.JButton();
        btnSR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOMEPAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        btnSB.setDefaultCapable(false);
        btnSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSBActionPerformed(evt);
            }
        });
        getContentPane().add(btnSB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 175, 168));

        btnSR.setMaximumSize(new java.awt.Dimension(238, 239));
        btnSR.setMinimumSize(new java.awt.Dimension(238, 239));
        btnSR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSRActionPerformed(evt);
            }
        });
        getContentPane().add(btnSR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 176, 168));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("STUDENT BACKGROUND");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, 31));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("STUDENT RESOURCES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, 31));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSBActionPerformed
        // TODO add your handling code here:
        StudentBackground sb = new StudentBackground();
        sb.setVisible(true);                                  
        sb.pack();
        sb.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSBActionPerformed

    private void btnSRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSRActionPerformed
        // TODO add your handling code here:
        StudentResouces sr = new StudentResouces();
        sr.setVisible(true);
        sr.pack();
        sr.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSRActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSB;
    private javax.swing.JButton btnSR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
