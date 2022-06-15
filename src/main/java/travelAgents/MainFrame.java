/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package travelAgents;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Tenin
 */
public class MainFrame extends javax.swing.JFrame {

    private JMenu subMenu = new JMenu("New holiday");
    private JMenuItem miNewHoliday = new JMenuItem("New Holiday");
    private JMenuItem miCruise = new JMenuItem("Cruise");
    private JMenuItem miUK = new JMenuItem("UK holiday");
    private JMenuItem miAbroad = new JMenuItem("Aboard holiday");
    private JMenuItem miExit = new JMenuItem("Exit");

    /**
     * Creates new form main
     */
    public MainFrame() {
        initComponents();
        eventListenerInitilisation();
    }

    private void eventListenerInitilisation() {
        miCruise.addActionListener(e -> {
            System.out.println("Cruise clicked");
        });
        
        miUK.addActionListener(e -> {
            System.out.println("UK clicked");
        });
        
        miAbroad.addActionListener(e -> {
            System.out.println("Abroad clicked");
        });
        
        miExit.addActionListener(e -> {
            System.out.println("exit pressed");
            System.exit(0);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        menuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu.setText("File");
        menuBar.add(jMenu);
        jMenu.add(subMenu);
        subMenu.add(miCruise);
        subMenu.add(miUK);
        subMenu.add(miAbroad);
        jMenu.add(miExit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
