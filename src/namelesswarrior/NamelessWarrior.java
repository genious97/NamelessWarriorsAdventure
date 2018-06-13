/*
 * Name: NamelessWarrior
 * Programmers: Sammie Smillie & Jessica Chagas
 * Grade: 12
 * Description: This program will run a side scroller game with three different levels
 */
package namelesswarrior;

import javax.swing.Icon;
import javax.swing.JFrame;

        
public class NamelessWarrior {
    public String levelChoice = "";
    
    public static void main(String[] args) {
//
//        TitleScreen ts = new TitleScreen();
//        ts.setSize(499, 397);
//        ts.setVisible(true);
//      System.out.println("Start");
//      StoryORLevel sOl = new StoryORLevel(); 
//
//        while(ts.isActive()){
//            
//        }
//        int SORQ =  ts.getSORQ();
//      System.out.println("finish"+SORQ);
//       
//        
//       if (SORQ==1){
//         
//        sOl.setSize(499, 397);
//        sOl.setVisible(true); 
//        
//       }
//       else if (SORQ==2){
//        System.exit(0);
//    }
//       
//       
//       
//       
//       
//       
//        while(sOl.isActive()){
//            
//        }
//        int choice =  sOl.getStoryLevel();
//        System.out.println("finish"+ choice);
//        
//        
//       if (choice==1){
//        
//        
//       }
//       else if (choice==2){
//        LevelSelect ls = new LevelSelect();
//         ls.setSize(442, 320);
//        ls.setVisible(true);
//    }
        
        
        
String imageName, dudeImage, endImage, ob1, ob2, ob4, ob3, vil1, vil2;
        //Level One Stuff
         
       
//         imageName="/namelesswarrior/myimages/Level 1 Background.png";
//         dudeImage = "/namelesswarrior/myimages/Hero1Side 1.png";
//         endImage = "/namelesswarrior/myimages/chest.png";
//         ob1 = "/namelesswarrior/myimages/RockoSmall.png";
//         ob2 = "/namelesswarrior/myimages/RockoBIG.png";
//         ob3 = "/namelesswarrior/myimages/RocketTINY.png";
//         ob4 = "/namelesswarrior/myimages/RocketBIG.png";
//         int rockoSmall[] = {125,270};
//         int rockoLarge[] = {175,250};
//         int rocketSmall[] = {350,270,550,270};
//         int rocketLarge[] = {400,250};
//         int empty[] = {0,0};
//        
         LevelSelect levelSelector = new LevelSelect();
         levelSelector.setVisible(true);
//         
         int currentLevel=levelSelector.getLevel();
//          
//        LevelTester LevelOne = new LevelTester(imageName, dudeImage, endImage, ob1, ob2, ob3, ob4, "", "", rockoSmall, rockoLarge, rocketSmall, rocketLarge, empty, empty);
//                  
//        LevelOne.setVisible(true);
//        LevelOne.setSize(740, 390);



        imageName="/namelesswarrior/myimages/Level 2 background.png";
        dudeImage = "/namelesswarrior/myimages/Hero1Side 1.png";
        endImage = "/namelesswarrior/myimages/chest.png";
         ob1 = "/namelesswarrior/myimages/box.png";
         ob2 = "/namelesswarrior/myimages/RockoBIG.png";
         ob3 = "/namelesswarrior/myimages/RocketTINY.png";
         ob4 = "/namelesswarrior/myimages/RocketBIG.png";

        LevelTester LevelTwo = new LevelTester(imageName, dudeImage, endImage, ob1, ob2, ob3, ob4, "", "", rockoSmall, rockoLarge, rocketSmall, rocketLarge, empty, empty);
        LevelTwo.setVisible(true);

        
         
        
        
     
    }
    
   
    
    
}
        
        
        
 
    

