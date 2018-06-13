package namelesswarrior;
import javax.swing.Icon;
import javax.swing.JFrame;
public class LevelTester extends javax.swing.JFrame {
    
    
    
    
    
    
    public LevelTester(String _bgdName, String _dudeImage, String _endImage, String _Ob1, String _Ob2, String _Ob3, String _Ob4, String _Vil1, String _Vil2, int _CordArrayOb1[], int _CordArrayOb2[], int _CordArrayOb3[], int _CordArrayOb4[], int _Villian1[],  int _Villian2[]) {
        initComponents();
        //jLabel1.setIcon(_icon);
 bgd.setIcon(new javax.swing.ImageIcon(getClass().getResource(_bgdName)));
 dude.setIcon(new javax.swing.ImageIcon(getClass().getResource(_dudeImage)));
 chest.setIcon(new javax.swing.ImageIcon(getClass().getResource(_endImage)));
Ob1.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Ob1)));
Ob2.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Ob2)));
Ob3.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Ob3)));
Ob3P2.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Ob3)));
Ob4.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Ob4)));
Vil1.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Vil1)));
Vil2.setIcon(new javax.swing.ImageIcon(getClass().getResource(_Vil2)));
 

 bgd.setLocation(0,0);
 dude.setLocation(0,240);
 chest.setLocation(680,280);
 Ob1.setLocation(_CordArrayOb1[0],_CordArrayOb1[1]);
 Ob2.setLocation(_CordArrayOb2[0],_CordArrayOb2[1]);
 Ob3.setLocation(_CordArrayOb3[0],_CordArrayOb3[1]);
 Ob3P2.setLocation(_CordArrayOb3[2],_CordArrayOb3[3]);
 Ob4.setLocation(_CordArrayOb4[0],_CordArrayOb4[1]);
 Vil1.setLocation(_Villian1[0],_Villian1[1]);
 Vil2.setLocation(_Villian2[0],_Villian2[1]);

 
 
 Ob4.setSize(101,75);
 Ob3P2.setSize(84,62);
 Ob3.setSize(84,62);
 Ob2.setSize(109,78);
 Ob1.setSize(83,60);
 chest.setSize(33,36);
 bgd.setSize(723,363);
 dude.setSize(65,81);
 Vil1.setSize(101,75);
 Vil2.setSize(101,75);
 
 
    }

    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Vil1 = new javax.swing.JLabel();
        Ob4 = new javax.swing.JLabel();
        Ob2 = new javax.swing.JLabel();
        Ob3 = new javax.swing.JLabel();
        Ob1 = new javax.swing.JLabel();
        Vil2 = new javax.swing.JLabel();
        dude = new javax.swing.JLabel();
        chest = new javax.swing.JLabel();
        Ob3P2 = new javax.swing.JLabel();
        bgd = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelesswarrior/myimages/Level 1 Background.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(getBackground());
        getContentPane().setLayout(null);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(670, 210, 0, 0);

        Vil1.setText("     ");
        getContentPane().add(Vil1);
        Vil1.setBounds(290, 10, 15, 16);

        Ob4.setText("jLabel6");
        getContentPane().add(Ob4);
        Ob4.setBounds(240, 10, 41, 16);

        Ob2.setText("jLabel7");
        getContentPane().add(Ob2);
        Ob2.setBounds(130, 10, 41, 16);

        Ob3.setText("jLabel8");
        getContentPane().add(Ob3);
        Ob3.setBounds(190, 10, 41, 16);

        Ob1.setText("jLabel9");
        getContentPane().add(Ob1);
        Ob1.setBounds(70, 10, 41, 16);

        Vil2.setText("     ");
        getContentPane().add(Vil2);
        Vil2.setBounds(370, 10, 15, 16);

        dude.setText("jLabel1");
        getContentPane().add(dude);
        dude.setBounds(10, 270, 41, 16);

        chest.setText("jLabel1");
        getContentPane().add(chest);
        chest.setBounds(370, 60, 41, 16);

        Ob3P2.setText("jLabel1");
        getContentPane().add(Ob3P2);
        Ob3P2.setBounds(510, 60, 41, 16);

        bgd.setText("jLabel9");
        getContentPane().add(bgd);
        bgd.setBounds(10, 10, 41, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ob1;
    private javax.swing.JLabel Ob2;
    private javax.swing.JLabel Ob3;
    private javax.swing.JLabel Ob3P2;
    private javax.swing.JLabel Ob4;
    private javax.swing.JLabel Vil1;
    private javax.swing.JLabel Vil2;
    private javax.swing.JLabel bgd;
    private javax.swing.JLabel chest;
    private javax.swing.JLabel dude;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
