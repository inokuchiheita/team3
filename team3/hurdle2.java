import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hurdle2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hurdle2 extends Actor
{
    int A = 0;
    int B = 360;
    int c = A + (int)(Math.random()*((B-A)+1));
    /**
     * Act - do whatever the hurdle2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
