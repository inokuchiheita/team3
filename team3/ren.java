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
    private int flag_tama = 0;
    private int dig = 0;
    private int hp = 3;
    
    public void act() 
    {


        int x = getX();
        int y = getY();
        
        
       
        if( Greenfoot.isKeyDown( "4" ) ){
            dig=dig-5;
            setRotation(dig);
        }
        if( Greenfoot.isKeyDown( "6" ) ){
            dig=dig+5;
            setRotation(dig);
        }
        if( Greenfoot.isKeyDown( "8" ) ){
            //setLocation( x+1,y );
            setRotation(dig);
            move(-3);
        }
        if( Greenfoot.isKeyDown( "5" ) ){
            //setLocation( x-1
            setRotation(dig);
            move(2);
        }

<<<<<<< HEAD
        move(-2);
=======
              if( flag_tama > 0 ) flag_tama--;
        if( Greenfoot.isKeyDown( "9" ) ){
             {if( flag_tama == 0 ){
                getWorld().addObject( new renweapon2(getRotation()), x, y );
                
                flag_tama = 50;
            }
        }
    }  
        

        move(-1);
>>>>>>> 0d6acd2304c2040749b663304b9c52e42f45d113
       
        Actor actor = getOneIntersectingObject( georgeweapon2.class );
        if( actor != null ){
                    hp--;// TARO とぶつかった時の処理を書く
                    getWorld().removeObject( actor );
                    setLocation( 500,200 );
        }    
        Actor actor1 = getOneIntersectingObject( hurdle.class );
        if( actor1 != null ){
            setRotation(dig);
            setLocation( x,y );
        }  
       





    }    
}
