package namelesswarrior;
import java.awt.Image;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


public class TitleScreen extends javax.swing.JFrame {
   int SORQ;
    
   public TitleScreen(){
       initComponents();
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startBtn = new javax.swing.JButton();
        quitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        outsideLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        startBtn.setBackground(new java.awt.Color(204, 255, 204));
        startBtn.setForeground(new java.awt.Color(0, 0, 0));
        startBtn.setText("Start");
        startBtn.setActionCommand("startBtn");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });
        getContentPane().add(startBtn);
        startBtn.setBounds(60, 320, 62, 30);
        startBtn.getAccessibleContext().setAccessibleName("startBtn");

        quitBtn.setBackground(new java.awt.Color(204, 255, 204));
        quitBtn.setText("Quit");
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(quitBtn);
        quitBtn.setBounds(320, 320, 60, 30);
        quitBtn.getAccessibleContext().setAccessibleName("quitBtn");

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelesswarrior/myimages/dude.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 200, 60, 90);

        outsideLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelesswarrior/myimages/titlebgd.png"))); // NOI18N
        getContentPane().add(outsideLabel);
        outsideLabel.setBounds(0, 0, 483, 397);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
//Game will open StoryORLevel select if "Start" is pressed
       SORQ = 1;
        this.dispose();
    }//GEN-LAST:event_startBtnActionPerformed

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
//Game will close if "Quit" is pressed
           SORQ = 2;
    }//GEN-LAST:event_quitBtnActionPerformed
  
    public int getSORQ(){
        return SORQ;
    }
    
    
    
    
    
    
    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel outsideLabel;
    private javax.swing.JButton quitBtn;
    private javax.swing.JButton startBtn;
    // End of variables declaration//GEN-END:variables

    
}
