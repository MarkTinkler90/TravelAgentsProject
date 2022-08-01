package travelAgents;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Select extends javax.swing.JFrame {

    public Select() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuCreate = new javax.swing.JMenu();
        jMenuCreateUK = new javax.swing.JMenuItem();
        jMenuCreateAbroad = new javax.swing.JMenuItem();
        jMenuCreateCruise = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jSearchUK = new javax.swing.JMenuItem();
        jAbroad = new javax.swing.JMenuItem();
        jCruise = new javax.swing.JMenuItem();
        jMenuClose = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Travel Agents");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Booknig System and Database");

        jMenu1.setText("File");

        jMenuCreate.setText("Create");

        jMenuCreateUK.setText("UK Based");
        jMenuCreateUK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCreateUKActionPerformed(evt);
            }
        });
        jMenuCreate.add(jMenuCreateUK);

        jMenuCreateAbroad.setText("Abroad");
        jMenuCreateAbroad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCreateAbroadActionPerformed(evt);
            }
        });
        jMenuCreate.add(jMenuCreateAbroad);

        jMenuCreateCruise.setText("Cruise");
        jMenuCreateCruise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCreateCruiseActionPerformed(evt);
            }
        });
        jMenuCreate.add(jMenuCreateCruise);

        jMenu1.add(jMenuCreate);

        jMenu2.setText("View");

        jSearchUK.setText("UK Based");
        jSearchUK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchUKActionPerformed(evt);
            }
        });
        jMenu2.add(jSearchUK);

        jAbroad.setText("Abroad");
        jAbroad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAbroadActionPerformed(evt);
            }
        });
        jMenu2.add(jAbroad);

        jCruise.setText("Cruise");
        jCruise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCruiseActionPerformed(evt);
            }
        });
        jMenu2.add(jCruise);

        jMenu1.add(jMenu2);

        jMenuClose.setText("Close");
        jMenuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCloseActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuClose);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCreateUKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCreateUKActionPerformed
        this.dispose();
        new CreateUK().setVisible(true);
    }//GEN-LAST:event_jMenuCreateUKActionPerformed

    private void jMenuCreateCruiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCreateCruiseActionPerformed
        this.dispose();
        new CreateCruise().setVisible(true);
    }//GEN-LAST:event_jMenuCreateCruiseActionPerformed

    private void jMenuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuCloseActionPerformed

    private void jMenuCreateAbroadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCreateAbroadActionPerformed
        this.dispose();
        new CreateAbroad().setVisible(true);
    }//GEN-LAST:event_jMenuCreateAbroadActionPerformed

    private void jSearchUKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchUKActionPerformed
        this.dispose();
        new SearchUK().setVisible(true);
    }//GEN-LAST:event_jSearchUKActionPerformed

    private void jAbroadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAbroadActionPerformed
        this.dispose();
        new SearchAbroad().setVisible(true);
    }//GEN-LAST:event_jAbroadActionPerformed

    private void jCruiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCruiseActionPerformed
        this.dispose();
        new SearchCruise().setVisible(true);
    }//GEN-LAST:event_jCruiseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAbroad;
    private javax.swing.JMenuItem jCruise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuClose;
    private javax.swing.JMenu jMenuCreate;
    private javax.swing.JMenuItem jMenuCreateAbroad;
    private javax.swing.JMenuItem jMenuCreateCruise;
    private javax.swing.JMenuItem jMenuCreateUK;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jSearchUK;
    // End of variables declaration//GEN-END:variables
}
