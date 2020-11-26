import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class george here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class george extends Actor
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
        
        
        move(1);
        if( Greenfoot.isKeyDown( "a" ) ){
            dig=dig-3;
            setRotation(dig);
        }
        if( Greenfoot.isKeyDown( "d" ) ){
            dig=dig+3;
            setRotation(dig);
        }
        if( Greenfoot.isKeyDown( "w" ) ){
            //setLocation( x+1,y );
            setRotation(dig);
            move(3);
        }
        if( Greenfoot.isKeyDown( "s" ) ){
            //setLocation( x-1,y );
            setRotation(dig);
            move(-3);
        }
        
       



    }    
}

