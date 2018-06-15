package namelesswarrior;

import java.awt.Graphics;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Area;
import static java.time.zone.ZoneRulesProvider.refresh;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
//import javax.swing.Timer;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

public class LevelTester extends javax.swing.JFrame {

    int vely = 0, velx = 0;
    int posx, posy;
     ArrayList<JLabel> label = new ArrayList<JLabel>();


    public LevelTester(String _bgdName, String _dudeImage, String _endImage, String _Ob1, String _Ob2, String _Ob3, String _Ob4, String _Vil1, String _Vil2, int _DudeArray[], int _ChestArray[], int _CordArrayOb1[], int _CordArrayOb2[], int _CordArrayOb3[], int _CordArrayOb4[], int _Villian1[], int _Villian2[], int _bgd[]) {

        posx = _DudeArray[0];
        posy = _DudeArray[1];

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
             

            }

            @Override
            public void keyPressed(KeyEvent ke) {
                int code = ke.getKeyCode();
                if (code == KeyEvent.VK_RIGHT) {
                    right();

                }
                int codeleft = ke.getKeyCode();
                if (codeleft == KeyEvent.VK_LEFT) {
                    left();

                }
                
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
              
               int codeup = ke.getKeyCode();
                if (codeup == KeyEvent.VK_UP) {
                    up();

                
            }  
        }
        });

        initComponents();

        bgd.setIcon(new javax.swing.ImageIcon(getClass().getResource(_bgdName)));
        dude.setIcon(new javax.swing.ImageIcon(getClass().getResource(_dudeImage)));
        chest.setIcon(new javax.swing.ImageIcon(getClass().getResource(_endImage)));
        Ob1.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Ob1)));
        Ob1P2.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Ob1)));
        Ob1P3.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Ob1)));
        Ob2.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Ob2)));
        Ob2P2.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Ob2)));
        Ob3P2.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Ob3)));
        Ob3P2.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Ob3)));
        Ob4.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Ob4)));
        Vil1.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Vil1)));
        Vil1P2.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Vil1)));
        Vil1P3.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Vil1)));
        Vil2.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Vil2)));
        Vil2P2.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Vil2)));

// this sets the location of the pictures
        bgd.setLocation(0, 0);
        dude.setLocation(_DudeArray[0], _DudeArray[1]);
        chest.setLocation(_ChestArray[0], _ChestArray[1]);
        Ob1.setLocation(_CordArrayOb1[0], _CordArrayOb1[1]);
        Ob1P2.setLocation(_CordArrayOb1[2], _CordArrayOb1[3]);
        Ob1P3.setLocation(_CordArrayOb1[4], _CordArrayOb1[5]);
        Ob2.setLocation(_CordArrayOb2[0], _CordArrayOb2[1]);
        Ob2P2.setLocation(_CordArrayOb2[2], _CordArrayOb2[3]);
        Ob3.setLocation(_CordArrayOb3[0], _CordArrayOb3[1]);
        Ob3P2.setLocation(_CordArrayOb3[2], _CordArrayOb3[3]);
        Ob4.setLocation(_CordArrayOb4[0], _CordArrayOb4[1]);
        Vil1.setLocation(_Villian1[0], _Villian1[1]);
        Vil1P2.setLocation(_Villian1[2], _Villian1[3]);
        Vil1P3.setLocation(_Villian1[4], _Villian1[5]);
        Vil2.setLocation(_Villian2[0], _Villian2[1]);
        Vil2P2.setLocation(_Villian2[2], _Villian2[3]);

        // this sets the sizes of the pictures
        Ob4.setSize(101, 75);
        Ob3P2.setSize(84, 62);
        Ob3.setSize(84, 62);
        Ob2.setSize(109, 78);
        Ob2P2.setSize(109, 78);
        Ob1.setSize(83, 60);
        Ob1P2.setSize(83, 60);
        Ob1P3.setSize(83, 60);
        chest.setSize(33, 36);
        bgd.setSize(_bgd[0], _bgd[1]);
        dude.setSize(65, 81);
        Vil1.setSize(101, 75);
        Vil1P2.setSize(101, 75);
        Vil1P3.setSize(101, 75);
        Vil2.setSize(45, 80);
        Vil2P2.setSize(45, 80);

        
        label.add(Ob4);
        label.add(Ob3P2);
        label.add(Ob3);
        label.add(Ob2);
        label.add(Ob2P2);
        label.add(Ob1);
        label.add(Ob1P2);
        label.add(Ob1P3);
        
        
    }

    public void up() {

        System.out.println("Start UP");
        posy -= 40;

        dude.setBounds(posx, posy, 65, 81);

        Timer jumpTimer = new Timer();

        jumpTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                down();
            }
        }, 750);
//        Area areaDude =  new Area(dude.getBounds());
        
//        for(int i = 0; i < 8; i++){
//         Area areaB =  new Area(label.get(i).getBounds());
//           if (areaDude.intersects(areaB.getBounds2D())){
//            System.out.println("kill me");
//        }     
//            
//        } 



    }

public void right(){
    posx += 30;
    dude.setBounds(posx, posy, 65, 81);
    
}       
public void left(){
    posx -= 30;
    dude.setBounds(posx, posy, 65, 81);
}

public void down() {
     
        System.out.println("Start DOWN");
        posy += 40;
     

        dude.setBounds(posx, posy, 65, 81);
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dude = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Vil1 = new javax.swing.JLabel();
        Ob4 = new javax.swing.JLabel();
        Ob2 = new javax.swing.JLabel();
        Ob3 = new javax.swing.JLabel();
        Ob1 = new javax.swing.JLabel();
        Vil2 = new javax.swing.JLabel();
        chest = new javax.swing.JLabel();
        Ob3P2 = new javax.swing.JLabel();
        Vil1P2 = new javax.swing.JLabel();
        Ob1P2 = new javax.swing.JLabel();
        Vil1P3 = new javax.swing.JLabel();
        Ob1P3 = new javax.swing.JLabel();
        Vil2P2 = new javax.swing.JLabel();
        Ob2P2 = new javax.swing.JLabel();
        bgd = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelesswarrior/myimages/Level 1 Background.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(getBackground());
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(null);

        dude.setText("   ");
        dude.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dudeKeyReleased(evt);
            }
        });
        getContentPane().add(dude);
        dude.setBounds(30, 280, 70, 50);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(670, 210, 0, 0);

        Vil1.setText("     ");
        getContentPane().add(Vil1);
        Vil1.setBounds(310, 20, 15, 16);

        Ob4.setText("  ");
        getContentPane().add(Ob4);
        Ob4.setBounds(260, 20, 6, 16);

        Ob2.setText("   ");
        getContentPane().add(Ob2);
        Ob2.setBounds(150, 20, 9, 16);

        Ob3.setText(" ");
        getContentPane().add(Ob3);
        Ob3.setBounds(210, 20, 3, 16);

        Ob1.setText("  ");
        getContentPane().add(Ob1);
        Ob1.setBounds(90, 20, 6, 16);

        Vil2.setText("     ");
        getContentPane().add(Vil2);
        Vil2.setBounds(390, 20, 15, 16);

        chest.setText("  ");
        getContentPane().add(chest);
        chest.setBounds(390, 70, 6, 16);

        Ob3P2.setText("  ");
        getContentPane().add(Ob3P2);
        Ob3P2.setBounds(530, 70, 6, 16);

        Vil1P2.setText("   ");
        getContentPane().add(Vil1P2);
        Vil1P2.setBounds(580, 240, 9, 16);

        Ob1P2.setText("     ");
        getContentPane().add(Ob1P2);
        Ob1P2.setBounds(520, 190, 15, 16);

        Vil1P3.setText("     ");
        getContentPane().add(Vil1P3);
        Vil1P3.setBounds(490, 230, 15, 16);

        Ob1P3.setText("     ");
        getContentPane().add(Ob1P3);
        Ob1P3.setBounds(570, 300, 15, 16);

        Vil2P2.setText("   ");
        getContentPane().add(Vil2P2);
        Vil2P2.setBounds(460, 340, 9, 16);

        Ob2P2.setText("    ");
        getContentPane().add(Ob2P2);
        Ob2P2.setBounds(550, 230, 12, 16);

        bgd.setText("   ");
        bgd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bgdKeyReleased(evt);
            }
        });
        getContentPane().add(bgd);
        bgd.setBounds(30, 20, 80, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dudeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dudeKeyReleased

    }//GEN-LAST:event_dudeKeyReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased

    }//GEN-LAST:event_formKeyReleased

    private void bgdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bgdKeyReleased

    }//GEN-LAST:event_bgdKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ob1;
    private javax.swing.JLabel Ob1P2;
    private javax.swing.JLabel Ob1P3;
    private javax.swing.JLabel Ob2;
    private javax.swing.JLabel Ob2P2;
    private javax.swing.JLabel Ob3;
    private javax.swing.JLabel Ob3P2;
    private javax.swing.JLabel Ob4;
    private javax.swing.JLabel Vil1;
    private javax.swing.JLabel Vil1P2;
    private javax.swing.JLabel Vil1P3;
    private javax.swing.JLabel Vil2;
    private javax.swing.JLabel Vil2P2;
    private javax.swing.JLabel bgd;
    private javax.swing.JLabel chest;
    private javax.swing.JLabel dude;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
