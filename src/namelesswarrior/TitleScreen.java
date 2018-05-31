package namelesswarrior;

import java.awt.Image;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class TitleScreen extends javax.swing.JFrame {

    public TitleScreen() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        outsideLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Start");
        jButton1.setActionCommand("startBtn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 320, 62, 30);
        jButton1.getAccessibleContext().setAccessibleName("startBtn");

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setText("Quit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 320, 60, 30);
        jButton2.getAccessibleContext().setAccessibleName("quitBtn");

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("The Nameless ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, -20, 360, 100);

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Warrior's Adventure");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, -30, 510, 200);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelesswarrior/myimages/dude.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 230, 50, 60);

        outsideLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelesswarrior/myimages/titlebgd.png"))); // NOI18N
        getContentPane().add(outsideLabel);
        outsideLabel.setBounds(0, 0, 483, 397);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 220, 41, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TitleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TitleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TitleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TitleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TitleScreen().setVisible(true);
            }
        });
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel outsideLabel;
    // End of variables declaration//GEN-END:variables
}
