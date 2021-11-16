package UI;

import Data.Contact;
import UI.FrmAgenda;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/* @author Andrei*/
public class DlgEditareContact extends javax.swing.JDialog {

    private boolean bEncapsulatedContactCreatedOK;
    private Contact contactIncapsulat = null;

    public Contact getContactIncapsulat() {
        return contactIncapsulat;

    }

    public void setEncapsulatedContactCreatedOK(boolean bEncapsulatedContactCreatedOK) {
        this.bEncapsulatedContactCreatedOK = bEncapsulatedContactCreatedOK;
    }

    public boolean getEncapsulatedContactCreatedValid() {
        return contactIncapsulat == null ? false : true;
    }

    public DlgEditareContact(java.awt.Frame parent, boolean modal, Contact cSelectata) {
        super(parent, modal);
        initComponents();
        tfDlgEditareNume.setText(cSelectata.getNume());
        tfDlgEditarePrenume.setText(cSelectata.getPrenume());
        tfDlgEditareData.setText(cSelectata.getDataNastere());
        tfDlgEditareTel.setText(cSelectata.getNrTel());

    }

    private DlgEditareContact(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEditare = new javax.swing.JButton();
        btnDlgAnulare = new javax.swing.JButton();
        tfDlgEditareNume = new javax.swing.JTextField();
        tfDlgEditarePrenume = new javax.swing.JTextField();
        tfDlgEditareData = new javax.swing.JTextField();
        tfDlgEditareTel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nume:");

        jLabel2.setText("Prenume:");

        jLabel3.setText("Data Nastere:");

        jLabel4.setText("Nr. Telefon:");

        btnEditare.setText("Editeaza");
        btnEditare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditareActionPerformed(evt);
            }
        });

        btnDlgAnulare.setText("Anulare");
        btnDlgAnulare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgAnulareActionPerformed(evt);
            }
        });

        tfDlgEditareNume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDlgEditareNumeActionPerformed(evt);
            }
        });

        tfDlgEditarePrenume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDlgEditarePrenumeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDlgEditareNume)
                            .addComponent(tfDlgEditarePrenume, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDlgEditareData)
                            .addComponent(tfDlgEditareTel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnEditare)
                        .addGap(165, 165, 165)
                        .addComponent(btnDlgAnulare)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfDlgEditareNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDlgEditarePrenume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDlgEditareData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDlgEditareTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditare)
                    .addComponent(btnDlgAnulare))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDlgEditarePrenumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDlgEditarePrenumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDlgEditarePrenumeActionPerformed

    private void tfDlgEditareNumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDlgEditareNumeActionPerformed


    }//GEN-LAST:event_tfDlgEditareNumeActionPerformed

    private void btnEditareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditareActionPerformed
        contactIncapsulat = Contact.getInstance(tfDlgEditareNume.getText(), tfDlgEditarePrenume.getText(), tfDlgEditareData.getText(), tfDlgEditareTel.getText());
        if (contactIncapsulat == null) {
            JOptionPane.showMessageDialog(this, "contactul nu a putut fi creat");
            setEncapsulatedContactCreatedOK(false);
        } else {
            setEncapsulatedContactCreatedOK(true);
            System.out.println("de editat " + contactIncapsulat);

            dispose();

        }


    }//GEN-LAST:event_btnEditareActionPerformed

    private void btnDlgAnulareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgAnulareActionPerformed
        contactIncapsulat = null;
        dispose();
    }//GEN-LAST:event_btnDlgAnulareActionPerformed

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
            java.util.logging.Logger.getLogger(DlgEditareContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgEditareContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgEditareContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgEditareContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgEditareContact dialog = new DlgEditareContact(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDlgAnulare;
    private javax.swing.JButton btnEditare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfDlgEditareData;
    private javax.swing.JTextField tfDlgEditareNume;
    private javax.swing.JTextField tfDlgEditarePrenume;
    private javax.swing.JTextField tfDlgEditareTel;
    // End of variables declaration//GEN-END:variables
}
