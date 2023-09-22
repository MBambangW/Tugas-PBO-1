import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stage1 extends platformstage
{
    int gravity = 1;
    
    public void setGravity(int gravity){
        this.gravity = gravity;
    }
    
    public int getGravity(){
        return this.gravity;
    }
    
    /**
     * Constructor for objects of class stage1.
     * 
     */
    public stage1()
    {
        Player ladybug = new Player();
        this.addObject(ladybug, 300, 200);
        this.gravity = 1;
        Player ladybug2 = new Player();
        this.addObject(ladybug2, 246, 199);
        
        House rumah = new House();
        this.addObject(rumah, 577, 183);
    }
    
    public void act(){
        List<Character> allChars = this.getObjects(Character.class);
        for(Character chara : allChars){
            int xPoss = chara.getX();
            int yPoss = chara.getY();
            chara.setLocation(xPoss, yPoss+this.gravity); 
        }
    }
    
}
