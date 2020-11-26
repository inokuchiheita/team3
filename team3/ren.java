import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ren here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ren extends Actor
{
    
    private int dig = 0;
    /**
     * Act - do whatever the george wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        
    
    
        int x = getX();
        int y = getY();
        
        
        move(-1);
        if( Greenfoot.isKeyDown( "left" ) ){
            dig=dig-3;
            setRotation(dig);
        }
        if( Greenfoot.isKeyDown( "right" ) ){
            dig=dig+3;
            setRotation(dig);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            //setLocation( x+1,y );
            setRotation(dig);
            move(3);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            //setLocation( x-1,y );
            setRotation(dig);
            move(-3);
        }
        
        



    }    
}
