import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hurdle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hurdle extends Actor
{
    /**
     * Act - do whatever the hurdle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int dig = 0;
    int A = 0;
    int B = 360;
    int c = A + (int)(Math.random()*((B-A)+1));
    public void act() 
    {

   
       

       setRotation(c);

       Actor actor = getOneIntersectingObject( georgeweapon2.class );
        if( actor != null ){
                    getWorld().removeObject( actor );
        }    
        Actor actor1 = getOneIntersectingObject( renweapon2.class );
        if( actor1 != null ){
                    getWorld().removeObject( actor1 );
        }   
    } 
    
}
