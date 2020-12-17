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
    private GreenfootImage imglife2 = null;
    private GreenfootImage imglife1 = null;
    /**
     * Act - do whatever the george wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public george() 
    { 
        imglife2 = new GreenfootImage( "images/georgelife2.png" );
        imglife1 = new GreenfootImage( "images/georgelife1.png" );
    } 
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
            move(-1);
        }

        if( flag_tama > 0 ) flag_tama--;
        if( Greenfoot.isKeyDown( "e" ) ){
             {if( flag_tama == 0 ){
                getWorld().addObject( new georgeweapon2(getRotation()), x, y );
                
                flag_tama = 40;
            }
        }
    }  
        

        move(1);
        
        //当たり判定
        Actor actor = getOneIntersectingObject( renweapon2.class );
        if( actor != null ){
                    hp--;// TARO とぶつかった時の処理を書く
                    getWorld().removeObject( actor );
                    setLocation( 100,200 );
                    switch(hp){
                        case 2:
                        setImage(imglife2);
                        break;
                        case 1:
                        setImage(imglife1);
                        break;
                        case 0:
                        
                        break;
                    }
        }    
        
        Actor actor1 = getOneIntersectingObject( hurdle.class );
        Actor actor2 = getOneIntersectingObject( hurdle2.class );
        Actor actor3 = getOneIntersectingObject( hurdle3.class );
        if( actor1 != null ||actor2 != null ||actor3 != null  ){
            setRotation(dig);
            setLocation( x,y );
        }  

        if(hp==0){
        getWorld().showText( "ren win", 100, 50 );
        Greenfoot.stop();
        }  
    }    
}

