/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namelesswarrior;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LevelSelect extends javax.swing.JFrame {

    int level=0;
    
    
    public LevelSelect() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LevelOneButton = new javax.swing.JButton();
        LevelThreeButton = new javax.swing.JButton();
        LevelTwoButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LevelOneButton.setBackground(new java.awt.Color(204, 255, 204));
        LevelOneButton.setText("Level One");
        LevelOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelOneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LevelOneButton);
        LevelOneButton.setBounds(30, 130, 110, 26);

        LevelThreeButton.setBackground(new java.awt.Color(204, 255, 204));
        LevelThreeButton.setText("Level Three");
        LevelThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelThreeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LevelThreeButton);
        LevelThreeButton.setBounds(310, 130, 110, 26);

        LevelTwoButton.setBackground(new java.awt.Color(204, 255, 204));
        LevelTwoButton.setText("Level Two");
        LevelTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelTwoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LevelTwoButton);
        LevelTwoButton.setBounds(170, 160, 110, 26);

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please Select A Level");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 10, 320, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelesswarrior/myimages/titlebgd.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 440, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LevelOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelOneButtonActionPerformed
        // Once Button has been clicked it will allow for level one to open:
       // levelChoice = "1";
       
    }//GEN-LAST:event_LevelOneButtonActionPerformed

    private void LevelTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelTwoButtonActionPerformed
      //Once Button has been clicked it will allow for level two to open
        
    }//GEN-LAST:event_LevelTwoButtonActionPerformed

    private void LevelThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelThreeButtonActionPerformed
        //Once Button has been clicked it will allow for level three to open 
        
    }//GEN-LAST:event_LevelThreeButtonActionPerformed

    public int getLevel(){
        return level;
    }
    
    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LevelSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LevelSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LevelSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LevelSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LevelSelect().setVisible(true);
//            }
//        });
        
        
      
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LevelOneButton;
    private javax.swing.JButton LevelThreeButton;
    private javax.swing.JButton LevelTwoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
