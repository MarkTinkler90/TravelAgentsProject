package travelAgents;

import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.UUID;
import javax.swing.JFormattedTextField;
import javax.swing.text.DateFormatter;
import static javax.swing.JOptionPane.showMessageDialog;

public class CreateUK extends javax.swing.JFrame {

    public CreateUK() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        accSelect = new javax.swing.JComboBox<>();
        destField = new javax.swing.JTextField();
        pPNField = new javax.swing.JTextField();
        numField = new javax.swing.JTextField();
        sDField = new javax.swing.JTextField();
        eDField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        nightField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        createMenu = new javax.swing.JMenu();
        uKItem = new javax.swing.JMenuItem();
        abroadItem = new javax.swing.JMenuItem();
        cruiseItem = new javax.swing.JMenuItem();
        closeItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Accomodation Type");

        jLabel2.setText("Destination");

        jLabel3.setText("Price per Night");

        jLabel4.setText("Number of People");

        jLabel5.setText("Start Date");

        jLabel6.setText("End Date");

        accSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---", "Hotel", "House", "Other"}));
        accSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accSelectActionPerformed(evt);
            }
        });

        destField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destFieldActionPerformed(evt);
            }
        });

        pPNField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPNFieldActionPerformed(evt);
            }
        });
        pPNField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pPNFieldKeyTyped(evt);
            }
        });

        numField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numFieldActionPerformed(evt);
            }
        });
        numField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numFieldKeyTyped(evt);
            }
        });

        sDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sDFieldActionPerformed(evt);
            }
        });

        eDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Number of Nights");

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

        jLabel9.setText("Create UK Holiday");

        nightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nightFieldActionPerformed(evt);
            }
        });
        nightField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nightFieldKeyTyped(evt);
            }
        });

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
                        .addGap(72, 72, 72)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(confirmButton)
                                    .addGap(40, 40, 40)
                                    .addComponent(cancelButton))
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(65, 65, 65)
                                .addComponent(destField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(accSelect, 0, 108, Short.MAX_VALUE)
                                    .addComponent(pPNField)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(sDField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(numField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(nightField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(eDField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(accSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pPNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(eDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accSelectActionPerformed

    }//GEN-LAST:event_accSelectActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        String ID, ac, dest, sd, ed;
        int np, night;
        double pn, p;
        ac = accSelect.getSelectedItem().toString();
        dest = destField.getText();
        pn = Integer.parseInt(pPNField.getText());
        np = Integer.parseInt(numField.getText());
        sd = sDField.getText();
        ed = eDField.getText();
        night = Integer.parseInt(nightField.getText());
        p = pn * np * night;
        ID = UUID.randomUUID().toString();
        BookingUKBased ukb = new BookingUKBased(ac, ID, dest, pn, np, p, sd, ed, night);
        showMessageDialog(null, "Holiday created with ID: " + ID);
        this.dispose();
        new Select().setVisible(true);
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void destFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destFieldActionPerformed

    }//GEN-LAST:event_destFieldActionPerformed

    private void numFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numFieldActionPerformed

    }//GEN-LAST:event_numFieldActionPerformed

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

    private void pPNFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPNFieldActionPerformed

    }//GEN-LAST:event_pPNFieldActionPerformed

    private void sDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sDFieldActionPerformed

    }//GEN-LAST:event_sDFieldActionPerformed

    private void eDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDFieldActionPerformed

    }//GEN-LAST:event_eDFieldActionPerformed

    private void nightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nightFieldActionPerformed

    }//GEN-LAST:event_nightFieldActionPerformed

    private void numFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numFieldKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_numFieldKeyTyped

    private void pPNFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pPNFieldKeyTyped

    }//GEN-LAST:event_pPNFieldKeyTyped

    private void nightFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nightFieldKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_nightFieldKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abroadItem;
    private javax.swing.JComboBox<String> accSelect;
    private javax.swing.JButton cancelButton;
    private javax.swing.JMenuItem closeItem;
    private javax.swing.JButton confirmButton;
    private javax.swing.JMenu createMenu;
    private javax.swing.JMenuItem cruiseItem;
    private javax.swing.JTextField destField;
    private javax.swing.JTextField eDField;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField nightField;
    private javax.swing.JTextField numField;
    private javax.swing.JTextField pPNField;
    private javax.swing.JTextField sDField;
    private javax.swing.JMenuItem uKItem;
    // End of variables declaration//GEN-END:variables
}
