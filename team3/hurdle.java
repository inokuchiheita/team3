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
    public void act() 
    {
   
       
       Actor actor = getOneIntersectingObject( georgeweapon2.class );
        if( actor != null ){
                    getWorld().removeObject( actor );
        }    
    }    
}
