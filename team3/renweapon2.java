import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class renweapon2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class renweapon2 extends Actor
{
    /**
     * Act - do whatever the georgeweapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public renweapon2(int dig)
    {
        super();        
        setRotation(dig);       
    }
    
    public void act() 
    {
        move(3);
        // Add your action code here.
    } 
    
}
