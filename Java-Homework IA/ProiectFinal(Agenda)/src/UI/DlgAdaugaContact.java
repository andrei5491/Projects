package UI;

import Data.Contact;
import javax.swing.JOptionPane;

/* * @author Andrei*/
public class DlgAdaugaContact extends javax.swing.JDialog {

    private Contact contact = null;

    public DlgAdaugaContact(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Contact getContact() {
        return contact;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDlgAdaugaIngredient = new javax.swing.JButton();
        btnDlgAnulare = new javax.swing.JButton();
        tfNume = new javax.swing.JTextField();
        tfPrenume = new javax.swing.JTextField();
        tfDataNastere = new javax.swing.JTextField();
        tfNrTel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nume:");

        jLabel2.setText("Prenume:");

        jLabel3.setText("Data Nastere:");

        jLabel4.setText("Nr. Telefon:");

        btnDlgAdaugaIngredient.setText("Adauga");
        btnDlgAdaugaIngredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgAdaugaIngredientActionPerformed(evt);
            }
        });

        btnDlgAnulare.setText("Anulare");
        btnDlgAnulare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgAnulareActionPerformed(evt);
            }
        });

        tfNume.setToolTipText("");
        tfNume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeActionPerformed(evt);
            }
        });

        tfPrenume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrenumeActionPerformed(evt);
            }
        });

        tfDataNastere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataNastereActionPerformed(evt);
            }
        });

        tfNrTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNrTelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNume)
                            .addComponent(tfDataNastere)
                            .addComponent(tfPrenume)
                            .addComponent(tfNrTel)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnDlgAdaugaIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(btnDlgAnulare, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDataNastere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNrTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDlgAnulare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDlgAdaugaIngredient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeActionPerformed

    private void tfPrenumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrenumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrenumeActionPerformed

    private void tfDataNastereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataNastereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataNastereActionPerformed

    private void tfNrTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNrTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNrTelActionPerformed

    private void btnDlgAnulareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgAnulareActionPerformed
        contact = null;
        dispose();
    }//GEN-LAST:event_btnDlgAnulareActionPerformed

    private void btnDlgAdaugaIngredientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgAdaugaIngredientActionPerformed
        String sNume = tfNume.getText().trim();
        String sPrenume = tfPrenume.getText().trim();
        String sDataNastere = tfDataNastere.getText().trim();
        String sNrTel = tfNrTel.getText().trim();

        try {
            contact = new Contact(sNume, sPrenume, sDataNastere, sNrTel);
            dispose();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            return;

        }
    }//GEN-LAST:event_btnDlgAdaugaIngredientActionPerformed

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
            java.util.logging.Logger.getLogger(DlgAdaugaContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgAdaugaContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgAdaugaContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgAdaugaContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgAdaugaContact dialog = new DlgAdaugaContact(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDlgAdaugaIngredient;
    private javax.swing.JButton btnDlgAnulare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfDataNastere;
    private javax.swing.JTextField tfNrTel;
    private javax.swing.JTextField tfNume;
    private javax.swing.JTextField tfPrenume;
    // End of variables declaration//GEN-END:variables
}
