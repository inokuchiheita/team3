import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ren here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ren extends Actor
{
    /**
     * Act - do whatever the ren wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int dig = 180;
    
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        
        
        if( Greenfoot.isKeyDown( "left" ) ){
            dig=dig-5;
            setRotation(dig);
        }
        if( Greenfoot.isKeyDown( "right" ) ){
            dig=dig+5;
            setRotation(dig);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            //setLocation( x+1,y );
            setRotation(dig);
            move(-5);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            //setLocation( x-1
            setRotation(dig);
            move(5);
        }
    }    
}
