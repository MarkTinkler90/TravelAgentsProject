package travelAgents;

import java.util.UUID;
import static javax.swing.JOptionPane.showMessageDialog;

public class CreateCruise extends javax.swing.JFrame {

    public CreateCruise() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        destField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pPNField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        numField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sDField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        eDField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dPField = new javax.swing.JTextField();
        rPField = new javax.swing.JTextField();
        cabinSelect = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nightField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        createMenu = new javax.swing.JMenu();
        uKItem = new javax.swing.JMenuItem();
        abroadItem = new javax.swing.JMenuItem();
        cruiseItem = new javax.swing.JMenuItem();
        closeItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel13.setText("Destination");

        destField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("Price per Night");

        jLabel11.setText("Number of People");

        numField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Start Date");

        sDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sDFieldActionPerformed(evt);
            }
        });

        jLabel15.setText("End Date");

        jLabel9.setText("Number of Nights");

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Return Port");

        jLabel2.setText("Departure Port");

        jLabel3.setText("Cabin Type");

        rPField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPFieldActionPerformed(evt);
            }
        });

        cabinSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chose One--", "Sea View", "Internal" }));
        cabinSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabinSelectActionPerformed(evt);
            }
        });

        jLabel4.setText("Create Cruise");

        fileMenu.setText("File");

        createMenu.setText("Create");

        uKItem.setText("UK Based");
        uKItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uKItemActionPerformed(evt);
            }
        });
        createMenu.add(uKItem);

        abroadItem.setText("Abroad");
        abroadItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abroadItemActionPerformed(evt);
            }
        });
        createMenu.add(abroadItem);

        cruiseItem.setText("Cruise");
        cruiseItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cruiseItemActionPerformed(evt);
            }
        });
        createMenu.add(cruiseItem);

        fileMenu.add(createMenu);

        closeItem.setText("Close");
        closeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeItemActionPerformed(evt);
            }
        });
        fileMenu.add(closeItem);

        jMenuBar1.add(fileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(confirmButton))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nightField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rPField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dPField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cabinSelect, javax.swing.GroupLayout.Alignment.TRAILING, 0, 100, Short.MAX_VALUE)
                                    .addComponent(destField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(numField)
                                            .addComponent(sDField)
                                            .addComponent(eDField)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(pPNField))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cabinSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(pPNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(numField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void destFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destFieldActionPerformed

    private void numFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numFieldActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        String ID, c, dp, rp, dest, sd, ed;
        int np, night;
        double pn, p;
        c = cabinSelect.getSelectedItem().toString();
        dp = dPField.getText();
        rp = rPField.getText();
        dest = destField.getText();
        pn = Integer.parseInt(pPNField.getText());
        np = Integer.parseInt(numField.getText());
        sd = sDField.getText();
        ed = eDField.getText();
        night = Integer.parseInt(nightField.getText());
        p = pn * np * night;
        ID = UUID.randomUUID().toString();
        BookingCruise cruise = new BookingCruise(c, dp, rp, ID, dest, pn, np, p, sd, ed, night);
        showMessageDialog(null, "Holiday created with ID: " + ID);
        this.dispose();
        new Select().setVisible(true);
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void rPFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPFieldActionPerformed

    private void sDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sDFieldActionPerformed

    }//GEN-LAST:event_sDFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
        new Select().setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void uKItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uKItemActionPerformed
        this.dispose();
        new CreateUK().setVisible(true);
    }//GEN-LAST:event_uKItemActionPerformed

    private void abroadItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abroadItemActionPerformed
        this.dispose();
        new CreateAbroad().setVisible(true);
    }//GEN-LAST:event_abroadItemActionPerformed

    private void cruiseItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cruiseItemActionPerformed
        this.dispose();
        new CreateCruise().setVisible(true);
    }//GEN-LAST:event_cruiseItemActionPerformed

    private void closeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeItemActionPerformed

    private void cabinSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabinSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cabinSelectActionPerformed

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
            java.util.logging.Logger.getLogger(CreateCruise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateCruise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateCruise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateCruise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateCruise().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abroadItem;
    private javax.swing.JComboBox<String> cabinSelect;
    private javax.swing.JButton cancelButton;
    private javax.swing.JMenuItem closeItem;
    private javax.swing.JButton confirmButton;
    private javax.swing.JMenu createMenu;
    private javax.swing.JMenuItem cruiseItem;
    private javax.swing.JTextField dPField;
    private javax.swing.JTextField destField;
    private javax.swing.JTextField eDField;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField nightField;
    private javax.swing.JTextField numField;
    private javax.swing.JTextField pPNField;
    private javax.swing.JTextField rPField;
    private javax.swing.JTextField sDField;
    private javax.swing.JMenuItem uKItem;
    // End of variables declaration//GEN-END:variables
}
