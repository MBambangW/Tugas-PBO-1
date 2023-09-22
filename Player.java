import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Character
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int xPoss = this.getX();
        int yPoss = this.getY();
        World wrld = this.getWorld();
        this.move(1);
        
        if(Greenfoot.isKeyDown("space")){
            this.setLocation(xPoss, yPoss -4);
        }
        
        if(xPoss == wrld.getWidth() -1){
            this.setLocation(5, xPoss);
        }
        
        if(yPoss == wrld.getHeight() -1){
            this.setLocation(xPoss, 0);
        }
    }
}
