import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class george here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class george extends Actor
{
    private int flag_tama = 0;
    private int dig = 0;
    private int hp = 3;
    /**
     * Act - do whatever the george wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        
    
        
        int x = getX();
        int y = getY();
        
        
        
        if( Greenfoot.isKeyDown( "a" ) ){

            dig=dig-5;
            setRotation(dig);
        }
        if( Greenfoot.isKeyDown( "d" ) ){
            dig=dig+5;
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
            move(-2);
        }
        if( flag_tama > 0 ) flag_tama--;
        if( Greenfoot.isKeyDown( "e" ) ){
             {if( flag_tama == 0 ){
                getWorld().addObject( new georgeweapon2(getRotation()), x, y );
                
                flag_tama = 50;
            }
        }
    }  
        
        move(2);
        
        //当たり判定
        Actor actor = getOneIntersectingObject( renweapon.class );
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



    }    
}

