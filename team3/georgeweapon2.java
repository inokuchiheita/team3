import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class georgeweapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class georgeweapon2 extends Actor
{
    /**
     * Act - do whatever the georgeweapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public georgeweapon2(int dig)
    {
        super();        
        setRotation(dig);       
    }
    
    public void act() 
    {
<<<<<<< HEAD
        move(5);
        // Add your action code here.
        Actor actor = getOneIntersectingObject( georgeweapon2.class );
=======
        int x = getX();
        int y = getY();
>>>>>>> c64873e9e565061f4d607a158fdfb006c0fbeecd
        
        move(5);
        // Add your action code here.
        Actor actor = getOneIntersectingObject( renweapon2.class );
        if( actor != null ){
                    getWorld().removeObject( actor );
        }  
    } 
    
}

