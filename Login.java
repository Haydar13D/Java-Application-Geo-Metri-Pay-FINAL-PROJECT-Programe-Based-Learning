/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugasakhirpbo;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUSPRO
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txuser = new javax.swing.JTextField();
        btcancel = new javax.swing.JButton();
        btlogin1 = new javax.swing.JButton();
        txpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 65, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("USERNAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 153, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 70, -1));

        txuser.setText("Masukkan Nama!");
        txuser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txuserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txuserFocusLost(evt);
            }
        });
        txuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txuserActionPerformed(evt);
            }
        });
        jPanel1.add(txuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 111, -1));

        btcancel.setText("CANCEL");
        btcancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });
        jPanel1.add(btcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 70, 30));

        btlogin1.setText("LOGIN");
        btlogin1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlogin1ActionPerformed(evt);
            }
        });
        jPanel1.add(btlogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 70, 30));

        txpass.setText("Masukkan Nilai!");
        txpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txpassFocusLost(evt);
            }
        });
        jPanel1.add(txpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txuserActionPerformed

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btcancelActionPerformed

    private void btlogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlogin1ActionPerformed
        if (txuser.getText().trim().isEmpty() && txpass.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"isikan dulu le");
            
        }
        else if (txuser.getText().equals("Admin") && txpass.getText().equals("123"))
        {
        BangunDatar1 m = new BangunDatar1();  // Correct instantiation of Main class
        this.hide();  // Hide the current window
        m.setVisible(true);
                
        }
        else
       {
            JOptionPane.showMessageDialog(this,"username atau password tidak valid");
       }
    }//GEN-LAST:event_btlogin1ActionPerformed

    private void txpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txpassFocusGained
        if (txpass.getText().equals("Masukkan Nilai!"))
        {
            txpass.setText("");
        }
    }//GEN-LAST:event_txpassFocusGained

    private void txpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txpassFocusLost
        if (txpass.getText().equals(""))
        {
            txpass.setText("Masukkan Nilai!");
        }
    }//GEN-LAST:event_txpassFocusLost

    private void txuserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txuserFocusGained
        if (txuser.getText().equals("Masukkan Nama!"))
        {
            txuser.setText("");
        }
    }//GEN-LAST:event_txuserFocusGained

    private void txuserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txuserFocusLost
        if (txuser.getText().equals(""))
        {
            txuser.setText("Masukkan Nama!");
        }
    }//GEN-LAST:event_txuserFocusLost

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btlogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txpass;
    private javax.swing.JTextField txuser;
    // End of variables declaration//GEN-END:variables
}
