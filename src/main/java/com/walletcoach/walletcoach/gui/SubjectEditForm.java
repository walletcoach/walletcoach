package com.walletcoach.walletcoach.gui;

import com.walletcoach.walletcoach.controllers.SubjectController;
import com.walletcoach.walletcoach.entities.Subject;
import java.awt.event.WindowAdapter;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQException;

/**
 *
 * @author Michael
 */
public class SubjectEditForm extends javax.swing.JDialog {
    private XQConnection xml;
    private final SubjectController subjectController;
    
    private Subject item = null;

    /**
     * Creates new form SubjectEditForm
     */
    public SubjectEditForm(SubjectController subjectController, Subject item) {
        this.subjectController = subjectController;
        this.item = item;
        
        initComponents();
        
        if(this.item != null) {
            populateForm();
        }
    }
    
    private void populateForm() {
        icField.setText(item.getIc());
        nameField.setText(item.getName());
        descriptionField.setText(item.getDescription());
        streetField.setText(item.getStreet());
        numberField.setText(item.getNumber());
        cityField.setText(item.getCity());
        countryField.setText(item.getCountry());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        icField = new javax.swing.JTextField();
        descriptionField = new javax.swing.JTextField();
        icLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        retrieveButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        numberLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        streetField = new javax.swing.JTextField();
        numberField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        countryField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("i18n"); // NOI18N
        setTitle(bundle.getString("subjects")); // NOI18N

        nameLabel.setForeground(new java.awt.Color(0, 51, 204));
        nameLabel.setLabelFor(nameField);
        nameLabel.setText(bundle.getString("name")); // NOI18N
        nameLabel.setToolTipText("");

        icLabel.setLabelFor(icField);
        icLabel.setText(bundle.getString("ic")); // NOI18N

        descriptionLabel.setLabelFor(descriptionField);
        descriptionLabel.setText(bundle.getString("description")); // NOI18N

        jButton1.setText(bundle.getString("cancel")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(bundle.getString("save")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        retrieveButton.setText(bundle.getString("retrievefromares")); // NOI18N
        retrieveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Location", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        numberLabel.setLabelFor(streetField);
        numberLabel.setText(bundle.getString("street")); // NOI18N

        countryLabel.setLabelFor(cityField);
        countryLabel.setText(bundle.getString("postalcodecity")); // NOI18N

        jLabel8.setLabelFor(countryField);
        jLabel8.setText(bundle.getString("country")); // NOI18N

        numberField.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberLabel)
                    .addComponent(jLabel8)
                    .addComponent(countryLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberLabel)
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icLabel)
                            .addComponent(descriptionLabel))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(icField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(retrieveButton))
                            .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icLabel)
                    .addComponent(retrieveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionLabel)
                    .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName(bundle.getString("location")); // NOI18N

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!check()) {
            return;
        }
        
        final Subject item;
        if(this.item == null) {
            item = new Subject();
        } else {
            item = this.item;
        }
        
        item.setIc(icField.getText());
        item.setName(nameField.getText());
        item.setDescription(descriptionField.getText());
        item.setStreet(streetField.getText());
        item.setNumber(numberField.getText());
        item.setCity(cityField.getText());
        item.setCountry(countryField.getText());
        
        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws XQException {
                subjectController.edit(item);
                return null;
            }

            protected void done() {
                setVisible(false);
                dispose();
            }
        }.execute();
    }//GEN-LAST:event_jButton2ActionPerformed

    private boolean check() {
        if(nameField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Name field must be filled.");
            return false;
        }
        
        return true;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void retrieveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveButtonActionPerformed
        final String ic = icField.getText();
        if(ic.equals("")) return;
        
        retrieveButton.setEnabled(false);
        new SwingWorker<Subject, Void>() {
            private SubjectEditForm parent;
            
            @Override
            protected Subject doInBackground() throws XQException {
                return subjectController.getFromAres(ic);
            }

            @Override
            protected void done() {
                try {
                    if(get() == null) {
                        nameField.setText("N/A");
                        retrieveButton.setEnabled(true);
                        return;
                    }
                    
                    Subject subject = get();
                    if(subject.getName().length() == 0) {
                        nameField.setText("N/A");
                        retrieveButton.setEnabled(true);
                        return;
                    }
                    
                    nameField.setText(subject.getName());
                    streetField.setText(subject.getStreet().trim());
                    cityField.setText(subject.getCity());
                    numberField.setText(subject.getNumber());
                    countryField.setText("Česká republika");
                } catch (InterruptedException | ExecutionException ex) { 
                    nameField.setText("N/A");
                    retrieveButton.setEnabled(true);
                    return;
                }
                
                retrieveButton.setEnabled(true);
            }
        }.execute();
    }//GEN-LAST:event_retrieveButtonActionPerformed

    /**
     * @param subjectController
     * @param onClose
     */
    public static void display(final SubjectController subjectController, final Subject item, final WindowAdapter onClose) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CategoryEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {           
            public void run() {
                SubjectEditForm form = new SubjectEditForm(subjectController, item);
                form.setLocationRelativeTo(null);
                form.setModal(true);
                
                if(onClose != null) {
                    form.addWindowListener(onClose);
                }
                
                form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField countryField;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField icField;
    private javax.swing.JLabel icLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField numberField;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JButton retrieveButton;
    private javax.swing.JTextField streetField;
    // End of variables declaration//GEN-END:variables
}
