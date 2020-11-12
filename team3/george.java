import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class george here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class george extends Actor
{
    /**
     * Act - do whatever the george wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
<<<<<<< HEAD
        
    
    
        int x = getX();
        int y = getY();
        int dig = 0;
        
        if( Greenfoot.isKeyDown( "left" ) ){
            setRotation(dig-1);
        }
        if( Greenfoot.isKeyDown( "right" ) ){
            setRotation(dig+1);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setLocation( x,y-1 );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setLocation( x,y+1 );
        }
        // Add your action code here.
=======
        setRotation( 90 );
>>>>>>> b4de2dee820fde7c0930776393c48c50cfd2ac94
    }    
}
