package namelesswarrior;
public class StoryORLevel extends javax.swing.JFrame {
    int choice;
    
    public StoryORLevel() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        storyModeBtn = new javax.swing.JButton();
        LevelSelectBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        outsideLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        storyModeBtn.setBackground(new java.awt.Color(204, 255, 204));
        storyModeBtn.setText("Story Mode");
        storyModeBtn.setActionCommand("startBtn");
        storyModeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storyModeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(storyModeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 312, -1, -1));

        LevelSelectBtn.setBackground(new java.awt.Color(204, 255, 204));
        LevelSelectBtn.setText("Level Select");
        LevelSelectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelSelectBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LevelSelectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("The Nameless ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Warrior's Adventure");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelesswarrior/myimages/dude.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelesswarrior/myimages/dude.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 273, -1, -1));

        outsideLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelesswarrior/myimages/titlebgd.png"))); // NOI18N
        getContentPane().add(outsideLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void storyModeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storyModeBtnActionPerformed
        // Open tears
        choice = 1;
      this.dispose();
    }//GEN-LAST:event_storyModeBtnActionPerformed

    private void LevelSelectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelSelectBtnActionPerformed
        // this opens up level select
        choice = 2;
        this.dispose();
    }//GEN-LAST:event_LevelSelectBtnActionPerformed
public int getStoryLevel(){
    return choice;
}
    
    
    
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
            java.util.logging.Logger.getLogger(StoryORLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoryORLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoryORLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoryORLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoryORLevel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LevelSelectBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel outsideLabel;
    private javax.swing.JButton storyModeBtn;
    // End of variables declaration//GEN-END:variables
}
