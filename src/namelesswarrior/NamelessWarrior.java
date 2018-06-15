/*
 * Name: NamelessWarrior
 * Programmers: Sammie Smillie & Jessica Chagas
 * Grade: 12
 * Description: This program will run a side scroller game with three different levels
 */
package namelesswarrior;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.JFrame;

        
public class NamelessWarrior {
    public static String levelChoice = "";
    
    
    public static void main(String[] args) {
        
        LevelSelect ls = new LevelSelect();
        TitleScreen ts = new TitleScreen();
        ts.setSize(499, 397);
        ts.setVisible(true);
      System.out.println("Start");
      StoryORLevel sOl = new StoryORLevel(); 

        while(ts.isActive()){
            
        }
        int SORQ =  ts.getSORQ();
      System.out.println("finish"+SORQ);
       
        
       if (SORQ==1){
         
        sOl.setSize(499, 397);
        sOl.setVisible(true); 
        
       }
       else if (SORQ==2){
        System.exit(0);
    }
       
        while(sOl.isActive()){
            
        }
        int choice =  sOl.getStoryLevel();
        System.out.println("finish"+ choice);
        
        
       if (choice==1){
      levelChoice = "1";
        
       }
       else if (choice==2){
        
         ls.setSize(442, 320);
        ls.setVisible(true);
    }
       
       while(ls.isActive()){    
        } 
       
       
        int currentLevel = ls.getLevel();
        System.out.println("finish" + currentLevel);
        
        if (currentLevel == 1){
            levelChoice = "1";
        }
        else if(currentLevel == 2){
           levelChoice = "2"; 
        }
        else if (currentLevel == 3){
            levelChoice = "3";
        }
        
        
String imageName, dudeImage, endImage, ob1, ob2, ob4, ob3, vil1, vil2;
 int empty[] = {0,0,0,0,0,0};
 
 
        
        
//         
         
       if (levelChoice.equals("1")){
           //Level One Stuff
         imageName="/namelesswarrior/myimages/Level 1 Background.png";
         dudeImage = "/namelesswarrior/myimages/Hero1Side 1.png";
         endImage = "/namelesswarrior/myimages/chest.png";
         ob1 = "/namelesswarrior/myimages/RockoSmall.png";
         ob2 = "/namelesswarrior/myimages/RockoBIG.png";
         ob3 = "/namelesswarrior/myimages/RocketTINY.png";
         ob4 = "/namelesswarrior/myimages/RocketBIG.png";
         int bgd[] = {723, 363};
         int chest[] = {680, 280};
         int dude[] = {0,240};
         int rockoSmall[] = {125,270, 11110,11110, 11110,11110};
         int rockoLarge[] = {175,250, 10000,100000, 111110,11110};
         int rocketSmall[] = {350,270,550,270, 11110,11110};
         int rocketLarge[] = {400,250, 11110,11110, 11110,11110};
         
        
        LevelSelect levelSelector = new LevelSelect();
        
        
        
         levelSelector.setVisible(true);
          
          
        LevelTester LevelOne = new LevelTester(imageName, dudeImage, endImage, ob1, ob2, ob3, ob4, "", "", dude, chest, rockoSmall, rockoLarge, rocketSmall, rocketLarge, empty, empty, bgd);
                  
         
       
       
       
        LevelOne.setVisible(true);
        LevelOne.setSize(740, 390);  
       }

       else if (levelChoice.equals("2")){
           //Level Two Stuff
        imageName="/namelesswarrior/myimages/Level 2 background.jpg";
        dudeImage = "/namelesswarrior/myimages/Hero1Side 1.png";
        endImage = "/namelesswarrior/myimages/chest.png";
        ob1 = "/namelesswarrior/myimages/box.png";
        ob2 = "/namelesswarrior/myimages/tent.png";
        vil1 = "/namelesswarrior/myimages/Snake.png";
        int bgd[] = {905,520};
        int chest2[] = {860, 370};
        int dude2[] = {20, 330};
        int box2[] = {120,350, 525, 350, 660, 350};
        int tent[] = {175,330, 10000,10000};
        int snake[] = {275,350,475,350, 585, 350};

        LevelTester LevelTwo = new LevelTester(imageName, dudeImage, endImage, ob1, ob2, "", "", vil1, "", dude2, chest2, box2, tent, empty, empty, snake, empty, bgd);
        LevelTwo.setVisible(true);
        LevelTwo.setSize(950, 560);  
       }
       
       else if (levelChoice.equals("3")){
           //Level Three Stuff
    imageName="/namelesswarrior/myimages/Background level 3.jpg";
     dudeImage = "/namelesswarrior/myimages/Hero1Side 1.png";
     endImage = "/namelesswarrior/myimages/chest.png";
     ob1 = "/namelesswarrior/myimages/Box level 3.jpg";
     ob2 = "/namelesswarrior/myimages/belt2.png";
     vil1 = "/namelesswarrior/myimages/2BarrelButBetter.png";
     vil2 = "/namelesswarrior/myimages/Hole.jpg";
     int bgd[] = {990, 450};
     int chest3[] = {950,340};
     int dude3[] = {15,300};
     int box3[] = {100,330, 450, 330, 700, 330};
     int mach[] = {133,308, 500,308};
     int barrel[] = {400,315, 850,315, 600,315};
     int hole[] = {235,369, 750, 369};
     LevelTester LevelThree = new LevelTester(imageName, dudeImage, endImage, ob1, ob2, "", "", vil1, vil2, dude3, chest3, box3, mach, empty, empty, barrel, hole, bgd);
      LevelThree.setVisible(true);
     LevelThree.setSize(996, 484);
       }
         
     
     
//     
    }
    
   
    
    
}
        
        
        
 
    

