/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tugasakhirpbo;

/**
 *
 * @author ASUS
 */
public class Gopay extends javax.swing.JInternalFrame {
    double bayar, total, kembalian;
    /**
     * Creates new form Gopay
     */
    public Gopay() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        kembali = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Total = new javax.swing.JTextField();
        Bayar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gopay");
        setPreferredSize(new java.awt.Dimension(470, 310));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Saldo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 83, -1, -1));

        jLabel3.setText("Kembalian");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 165, -1, -1));

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 42, -1, -1));

        kembali.setEditable(false);
        kembali.setText("Kembalian!");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 162, -1, -1));

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 83, -1, -1));

        Total.setText("Masukkan Nilai!");
        Total.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TotalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TotalFocusLost(evt);
            }
        });
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });

        Bayar.setText("Masukkan Nilai!");
        Bayar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BayarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BayarFocusLost(evt);
            }
        });
        Bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 6, -1, -1));

        jLabel1.setText("Total pembayaran");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TotalActionPerformed

    private void BayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BayarActionPerformed

    private void TotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TotalFocusGained
        // TODO add your handling code here:
        if (Total.getText().equals("Masukkan Nilai!"))
        {
            Total.setText("");
        }
    }//GEN-LAST:event_TotalFocusGained

    private void TotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TotalFocusLost
        // TODO add your handling code here:
        if (Total.getText().equals(""))
        {
            Total.setText("Masukkan Nilai!");
        }
    }//GEN-LAST:event_TotalFocusLost

    private void BayarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BayarFocusGained
        // TODO add your handling code here:
        if (Bayar.getText().equals("Masukkan Nilai!"))
        {
            Bayar.setText("");
        }
    }//GEN-LAST:event_BayarFocusGained

    private void BayarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BayarFocusLost
        // TODO add your handling code here:
        if (Bayar.getText().equals(""))
        {
            Bayar.setText("Masukkan Nilai!");
        }
    }//GEN-LAST:event_BayarFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Total.setText("");
        Bayar.setText("");
        kembali.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_kembaliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        total = Double.parseDouble(Total.getText());
        bayar = Double.parseDouble(Bayar.getText());
        kembalian = bayar - total;
        kembali.setText(String.valueOf(kembalian));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bayar;
    private javax.swing.JTextField Total;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kembali;
    // End of variables declaration//GEN-END:variables
}
