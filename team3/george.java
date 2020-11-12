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

        
    
    
        int x = getX();
        int y = getY();
        int dig = 90;
        
        if( Greenfoot.isKeyDown( "left" ) ){
            if(dig<1){
                dig = 359;
            }
            else{
                dig = dig - 1;
            }
            setRotation(dig);
        }
        if( Greenfoot.isKeyDown( "right" ) ){
            if(dig>358){
                dig = 0;
            }
            else{
                dig = dig + 1;
            }
            setRotation(dig);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setLocation( x,y-1 );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setLocation( x,y+1 );
        }
        // Add your action code here.

        setRotation( 90 );

    }    
}
