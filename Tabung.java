/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tugasakhirpbo;

/**
 *
 * @author Yafi, Alfito, dan Haydar.
 */
public class Tabung extends javax.swing.JInternalFrame {
double jari, tinggi, luasS, luasP, volume;

    public Tabung() {
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

        hasilluasP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        hasilluasS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        input1 = new javax.swing.JTextField();
        input2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hasilVolume = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tabung");
        setPreferredSize(new java.awt.Dimension(410, 320));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hasilluasP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilluasPActionPerformed(evt);
            }
        });
        getContentPane().add(hasilluasP, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 172, 97, -1));

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 36, -1, -1));

        hasilluasS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilluasSActionPerformed(evt);
            }
        });
        getContentPane().add(hasilluasS, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 172, 86, -1));

        jLabel4.setText("Luas Permukaan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 150, -1, -1));

        jLabel1.setText("Luas Selimut");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 150, -1, -1));

        input1.setText("Masukkan Nilai!");
        input1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input1FocusLost(evt);
            }
        });
        input1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                input1InputMethodTextChanged(evt);
            }
        });
        input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input1ActionPerformed(evt);
            }
        });
        getContentPane().add(input1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 36, -1, -1));

        input2.setText("Masukkan Nilai!");
        input2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input2FocusLost(evt);
            }
        });
        input2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                input2InputMethodTextChanged(evt);
            }
        });
        input2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input2ActionPerformed(evt);
            }
        });
        getContentPane().add(input2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 71, -1, -1));

        jLabel2.setText("Jari");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 39, -1, -1));

        jLabel5.setText("Tinggi");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 74, -1, -1));

        hasilVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilVolumeActionPerformed(evt);
            }
        });
        getContentPane().add(hasilVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 172, 97, -1));

        jLabel3.setText("Volume");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 150, -1, -1));

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 71, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hasilluasPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilluasPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilluasPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jari = Double.parseDouble(input1.getText());
        tinggi = Double.parseDouble(input2.getText());
        luasS = 2 * Math.PI * jari * tinggi;
        luasP = (2 * Math.PI * jari * tinggi) + (2 * Math.PI * (jari * jari));
        volume = Math.PI * (jari * jari) * tinggi;
        hasilluasS.setText(String.valueOf(luasS));
        hasilluasP.setText(String.valueOf(luasP));
        hasilVolume.setText(String.valueOf(volume));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hasilluasSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilluasSActionPerformed

    }//GEN-LAST:event_hasilluasSActionPerformed

    private void input1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input1FocusGained
        if (input1.getText().equals("Masukkan Nilai!"))
        {
            input1.setText("");
        }
    }//GEN-LAST:event_input1FocusGained

    private void input1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input1FocusLost
        if (input1.getText().equals(""))
        {
            input1.setText("Masukkan Nilai!");
        }
    }//GEN-LAST:event_input1FocusLost

    private void input1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_input1InputMethodTextChanged

    }//GEN-LAST:event_input1InputMethodTextChanged

    private void input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input1ActionPerformed

    }//GEN-LAST:event_input1ActionPerformed

    private void input2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input2FocusGained
        if (input2.getText().equals("Masukkan Nilai!"))
        {
            input2.setText("");
        }
    }//GEN-LAST:event_input2FocusGained

    private void input2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input2FocusLost
        if (input2.getText().equals(""))
        {
            input2.setText("Masukkan Nilai!");
        }
    }//GEN-LAST:event_input2FocusLost

    private void input2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_input2InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_input2InputMethodTextChanged

    private void input2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input2ActionPerformed

    private void hasilVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilVolumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilVolumeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        hasilVolume.setText("");
        hasilluasS.setText("");
        hasilluasP.setText("");
        input1.setText("");
        input2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hasilVolume;
    private javax.swing.JTextField hasilluasP;
    private javax.swing.JTextField hasilluasS;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
