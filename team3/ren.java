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
     * Act - do whatever the george wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int dig = 0;
    private int hp = 3;
    
    public void act() 
    {


        int x = getX();
        int y = getY();
        
        
        move(-1);
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
            move(-3);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            //setLocation( x-1
            setRotation(dig);
            move(2);
        }
<<<<<<< HEAD
        
        
=======
        move(-2);
       
        Actor actor = getOneIntersectingObject( georgeweapon.class );
        if( actor != null ){
                    hp--;// TARO とぶつかった時の処理を書く
                    getWorld().removeObject( actor );
                    setLocation( 100,200 );
        }    
        Actor actor1 = getOneIntersectingObject( hurdle.class );
        if( actor1 != null ){
            setRotation(dig);
            setLocation( x,y );
        }  
       
>>>>>>> ea5ed65e3cbbda52c610a9ec93cdcf91a15b69e2




    }    
}
