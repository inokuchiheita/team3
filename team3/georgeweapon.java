import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class georgeweapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class georgeweapon extends george
{
    /**
     * Act - do whatever the georgeweapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int dig = 0;
    
    public void act() 
    {
        if( Greenfoot.isKeyDown( "a" ) ){
            dig=dig-3;
            
        }
        if( Greenfoot.isKeyDown( "d" ) ){
            dig=dig+3;
            
        }
        if( Greenfoot.isKeyDown( "e" ) ){
           setRotation(dig);
        }
//        getRotation(george);
        move(3);
        // Add your action code here.
    } 
    
}
