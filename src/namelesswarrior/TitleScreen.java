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

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelesswarrior/titlebgd.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 411, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
   
//      
//        JLabel jLabel1 = new javax.swing.JLabel();
//    jLabel1.setText("jLabel1");
//    
//    javax.swing.GroupLayout layout2 = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout2);
//    layout2.setHorizontalGroup(
//            layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout2.createSequentialGroup()
//                .addGap(510, 510, 510)
//                .addComponent(jLabel1)
//                .addContainerGap(729, Short.MAX_VALUE))
//        );
//        BufferedImage img = null;
//try {
//    img = ImageIO.read(new File("titlebgd.png"));
//} catch (IOException e) {
//    e.printStackTrace();
//}
//    Image dimg = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),
//        Image.SCALE_SMOOTH);    
//        
//       ImageIcon imageIcon = new ImageIcon(dimg);
// 
//        
//        
        
        
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

public void NewJFrame() {
        initComponents();

       
        //Initialize the label with the scaled image icon
        myInitComponents(jLabel1);
    }


    public static void myInitComponents(javax.swing.JLabel jLabel1) {
        //Initialize a Buffered Image
        BufferedImage img = null;

        //set the Buffered Image to the picture file
        try {
            img = ImageIO.read(new File("titlebgd.png")); 
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Create a temporary Image and scale it to the size of the label 
        Image tempImg = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),
                Image.SCALE_SMOOTH);

        //Create and Image Icon from the new scaled image
        ImageIcon imageIcon = new ImageIcon(tempImg);

        //Set the label's icon property to the new icon
        jLabel1.setIcon(imageIcon);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
