package UI;

import Data.Contact;
import Data.Data;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/* @author Andrei*/
public class FrmAgenda extends javax.swing.JFrame implements Runnable {


    private DefaultListModel<Contact> model = new DefaultListModel<Contact>();

    private DefaultComboBoxModel cbModel = new DefaultComboBoxModel(CriteriuOrdonare.values());

    Data data = new Data();

    public FrmAgenda() {
        initComponents();
        cmbOrdonare.setModel(cbModel);

        data.populeazaContacteAll();

        JLContacte.setModel(model);
        actualizareModel(data.contacteAll);

        date();
    }

    private void actualizareModel(List<Contact> contacteDeAfisat) {
        model.clear();
        for (Contact c : contacteDeAfisat) {
            model.addElement(c);
        }
    }

    private void date() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd - MM - yyyy");
        LocalDateTime now = LocalDateTime.now();
        JLDate.setText(dtf.format(now));
    }

    public void run() {
        new FrmAgenda().setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        salveazaJFC = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLContacte = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        cmbOrdonare = new javax.swing.JComboBox<>();
        btnAdaugaContact = new javax.swing.JButton();
        btnStergeContactSelectat = new javax.swing.JButton();
        btnEditareContact = new javax.swing.JButton();
        btnOrdoneaza = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbFiltrare = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        JLDate = new javax.swing.JLabel();
        tfFiltrare = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnFisiere = new javax.swing.JMenu();
        miDeschide = new javax.swing.JMenuItem();
        btnSalveaza = new javax.swing.JMenuItem();
        btnIesire = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnDespre = new javax.swing.JMenuItem();
        btnInregistrare = new javax.swing.JMenuItem();

        fileChooser.setFileFilter(null);
        fileChooser.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(JLContacte);

        jLabel1.setText("Ordonare:");

        cmbOrdonare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dupa Nume", "Dupa Prenume", "Dupa Data Nastere", "Dupa Nr. Telefon" }));
        cmbOrdonare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrdonareActionPerformed(evt);
            }
        });

        btnAdaugaContact.setText("Adauga Contact");
        btnAdaugaContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdaugaContactActionPerformed(evt);
            }
        });

        btnStergeContactSelectat.setText("Sterge Contact Selectat");
        btnStergeContactSelectat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStergeContactSelectatActionPerformed(evt);
            }
        });

        btnEditareContact.setText("Editeaza Contact Selectat");
        btnEditareContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditareContactActionPerformed(evt);
            }
        });

        btnOrdoneaza.setText("Ordoneaza");
        btnOrdoneaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdoneazaActionPerformed(evt);
            }
        });

        jLabel2.setText("Filtrare:");

        cmbFiltrare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personalizata", "Contacte Nr. Fix", "Contacte Nr. Mobil", "Contacte Cu Data Nasterii In Ziua Curenta", "Contacte Cu Data Nasterii In Luna Curenta" }));
        cmbFiltrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltrareActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel3.setText("Data curenta:");

        JLDate.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        JLDate.setText("Afisare Data");

        tfFiltrare.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFiltrareKeyReleased(evt);
            }
        });

        btnFisiere.setText("Fisiere");

        miDeschide.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        miDeschide.setText("Deschide");
        miDeschide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeschideActionPerformed(evt);
            }
        });
        btnFisiere.add(miDeschide);

        btnSalveaza.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btnSalveaza.setText("Salveaza");
        btnSalveaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalveazaActionPerformed(evt);
            }
        });
        btnFisiere.add(btnSalveaza);

        btnIesire.setText("Iesire");
        btnIesire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIesireActionPerformed(evt);
            }
        });
        btnFisiere.add(btnIesire);

        jMenuBar1.add(btnFisiere);

        jMenu2.setText("Ajutor");

        btnDespre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        btnDespre.setText("Despre");
        btnDespre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespreActionPerformed(evt);
            }
        });
        jMenu2.add(btnDespre);

        btnInregistrare.setText("Inregistrare");
        btnInregistrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInregistrareActionPerformed(evt);
            }
        });
        jMenu2.add(btnInregistrare);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdaugaContact, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStergeContactSelectat, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JLDate))
                            .addComponent(btnEditareContact)))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbOrdonare, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOrdoneaza))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbFiltrare, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(tfFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbOrdonare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdoneaza))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditareContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStergeContactSelectat)
                    .addComponent(btnAdaugaContact))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JLDate)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOrdonareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrdonareActionPerformed

    }//GEN-LAST:event_cmbOrdonareActionPerformed

    private void btnIesireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIesireActionPerformed

        int rsp = JOptionPane.showConfirmDialog(this, "Esti sigur ca vrei sa iesi?", " Iesire", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        //System.out.println(rsp);
        if (rsp == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnIesireActionPerformed

    private void OnFilterOrder() {
        List<Contact> contacteDeAfisat = new ArrayList<>();

        if (cmbFiltrare.getSelectedItem().equals("Personalizata")) {
            for (Contact c : data.contacteAll) {
                String sFilter = tfFiltrare.getText().trim();
                if (c.getNume().contains(sFilter) || c.getPrenume().contains(sFilter) || c.getDataNastere().contains(sFilter) || c.getNrTel().contains(sFilter)) {
                    contacteDeAfisat.add(c);
                }
            }
        } else if (cmbFiltrare.getSelectedItem().equals("Contacte Nr. Fix")) {

            String nrFix1 = "02";
            String nrFix2 = "03";

            for (Contact c : data.contacteAll) {
                if (c.getNrTel().startsWith(nrFix1) || c.getNrTel().startsWith(nrFix2)) {
                    contacteDeAfisat.add(c);
                }
            }
        } else if (cmbFiltrare.getSelectedItem().equals("Contacte Nr. Mobil")) {

            String nrMobil = "07";

            for (Contact c : data.contacteAll) {
                if (c.getNrTel().startsWith(nrMobil)) {
                    contacteDeAfisat.add(c);
                }
            }
        } else if (cmbFiltrare.getSelectedItem().equals("Contacte Cu Data Nasterii In Ziua Curenta")) {
            LocalDateTime ld = LocalDateTime.now();

            String zicurenta = String.valueOf(ld.getDayOfMonth());

            for (Contact c : data.contacteAll) {
                if (c.getDataNastere().startsWith(zicurenta)) {
                    contacteDeAfisat.add(c);
                }
            }
        } else if (cmbFiltrare.getSelectedItem().equals("Contacte Cu Data Nasterii In Luna Curenta")) {

            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            Date date = calendar.getTime();
            LocalDateTime ld = LocalDateTime.now();
            String lunaCurenta = String.valueOf(calendar.get(Calendar.MONTH)+1);

            for (Contact c : data.contacteAll) {
                if (c.getDataNastere().substring(3, 5).startsWith(lunaCurenta)) {
                    contacteDeAfisat.add(c);
                }
            }
        }

        CriteriuOrdonare criteriu = (CriteriuOrdonare) cmbOrdonare.getSelectedItem();
        Comparator<Contact> comp = null;
        switch (criteriu) {
            case ordonareDupaNume:
                comp = (p1, p2) -> p1.getNume().compareTo(p2.getNume());
                break;
            case ordonareDupaPrenume:
                comp = (p1, p2) -> p1.getPrenume().compareTo(p2.getPrenume());
                break;
            case ordonareDupaDataNastere:
                comp = (p1, p2) -> p1.getDataNastere().compareTo(p2.getDataNastere());
                break;
            case ordonareDupaNrTel:
                comp = (p1, p2) -> p1.getNrTel().compareTo(p2.getNrTel());
                break;
            default:
                comp = (p1, p2) -> p1.getNume().compareTo(p2.getNume());
                break;
        }

       
        Collections.sort(contacteDeAfisat, comp);

        actualizareModel(contacteDeAfisat);
    }


    private void btnStergeContactSelectatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStergeContactSelectatActionPerformed
        int indSel = JLContacte.getSelectedIndex();
        if (indSel < 0) {
            JOptionPane.showMessageDialog(this, "Selecteaza un contact mai intai!", "Eroare", JOptionPane.ERROR_MESSAGE);
        } else {
            Contact c = model.get(indSel);
            if (c != null) {
                data.stergeContactAll(c);
                OnFilterOrder();
            }
        }

    }//GEN-LAST:event_btnStergeContactSelectatActionPerformed

    private void btnAdaugaContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdaugaContactActionPerformed
        DlgAdaugaContact dlgAc = new DlgAdaugaContact(this, true);
        dlgAc.setVisible(true);

        Contact contact = dlgAc.getContact();
        System.out.println(contact);
        if (contact != null) {
            data.adaugaInContacteAll(contact);
            OnFilterOrder();
        }
    }//GEN-LAST:event_btnAdaugaContactActionPerformed

    private void miDeschideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeschideActionPerformed
        FileNameExtensionFilter objFilter = new FileNameExtensionFilter("Obj File", "obj");
        fileChooser.setFileFilter(objFilter);
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            File file = new File(fileChooser.getSelectedFile().getAbsolutePath());

            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Data cealalta_agenda = (Data) ois.readObject();
                ois.close();
                fis.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }


    }//GEN-LAST:event_miDeschideActionPerformed

    private void btnOrdoneazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdoneazaActionPerformed
        OnFilterOrder();
    }//GEN-LAST:event_btnOrdoneazaActionPerformed

    private void cmbFiltrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltrareActionPerformed
        OnFilterOrder();
    }//GEN-LAST:event_cmbFiltrareActionPerformed

    private void btnEditareContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditareContactActionPerformed

        int indxSel = JLContacte.getSelectedIndex();
        if (indxSel < 0) {
            JOptionPane.showMessageDialog(this, "Selecteaza un contact mai intai!", "Eroare", JOptionPane.ERROR_MESSAGE);
        } else {
            Contact cSelectat = model.get(indxSel);
            DlgEditareContact dlgEdt = new DlgEditareContact(this, true, cSelectat);
            dlgEdt.setVisible(true);

            Contact cModificat = dlgEdt.getContactIncapsulat();
            if (cModificat != null) {
                data.modificaContactIn_contacteAll(cSelectat, cModificat);
            }
            OnFilterOrder();
        }
    }//GEN-LAST:event_btnEditareContactActionPerformed

    private void btnDespreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespreActionPerformed
        JOptionPane.showMessageDialog(this, "Proiect realizat de Andrei Olteanu"
                + " \nStudent InfoAcademy "
                + "\nLimbaj de programare folosit: Java", "Despre", JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_btnDespreActionPerformed

    private void btnInregistrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInregistrareActionPerformed
        JOptionPane.showMessageDialog(this, "Aplicatia este deja inregistrata!");
    }//GEN-LAST:event_btnInregistrareActionPerformed

    private void btnSalveazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalveazaActionPerformed

        FileNameExtensionFilter objFilter = new FileNameExtensionFilter("Obj File", "obj");
        salveazaJFC.setFileFilter(objFilter);
        if (salveazaJFC.showSaveDialog(this) == salveazaJFC.APPROVE_OPTION) {

            try {

                Data data = new Data();
                File saveAgenda = new File(salveazaJFC.getSelectedFile().getAbsolutePath() + ".obj");

                JOptionPane.showMessageDialog(this, "Agenda a fost salvata in: \n" + salveazaJFC.getSelectedFile().getAbsolutePath(), "Salvare", JOptionPane.PLAIN_MESSAGE);

                FileOutputStream fos = new FileOutputStream(saveAgenda);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(data);
                oos.close();
                fos.close();

            } catch (IOException e) {

                System.out.println("EROARE: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSalveazaActionPerformed

    private void tfFiltrareKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltrareKeyReleased
        OnFilterOrder();
    }//GEN-LAST:event_tfFiltrareKeyReleased

    public static void main(String args[]) throws InterruptedException {
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
            java.util.logging.Logger.getLogger(FrmAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//        Shareware sh = new Shareware();
//        Thread myThread = new Thread(sh);
//        myThread.start();
//        Thread main = Thread.currentThread();
//        main.join();

 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Contact> JLContacte;
    private javax.swing.JLabel JLDate;
    private javax.swing.JButton btnAdaugaContact;
    private javax.swing.JMenuItem btnDespre;
    private javax.swing.JButton btnEditareContact;
    private javax.swing.JMenu btnFisiere;
    private javax.swing.JMenuItem btnIesire;
    private javax.swing.JMenuItem btnInregistrare;
    private javax.swing.JButton btnOrdoneaza;
    private javax.swing.JMenuItem btnSalveaza;
    private javax.swing.JButton btnStergeContactSelectat;
    private javax.swing.JComboBox<String> cmbFiltrare;
    private javax.swing.JComboBox<String> cmbOrdonare;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem miDeschide;
    private javax.swing.JFileChooser salveazaJFC;
    private javax.swing.JTextField tfFiltrare;
    // End of variables declaration//GEN-END:variables
}
