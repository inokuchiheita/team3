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
    int time = 100;
    
    public renweapon2(int dig)
    {
        super();        
        setRotation(dig);       
    }
    
    public void act() 
    {

        time--;
        move(-5);
        // Add your action code here.
        Actor actor = getOneIntersectingObject( georgeweapon2.class );
        if( actor != null ){
                    getWorld().removeObject( actor );
        }  
        if(time<1)
        getWorld().removeObject(this);
    } 
    
}
