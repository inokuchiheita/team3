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
    private GreenfootImage imglife2 = null;
    private GreenfootImage imglife1 = null;
     public ren() 
    { 
        imglife2 = new GreenfootImage( "images/renlife2.png" );
        imglife1 = new GreenfootImage( "images/renlife1.png" );
    } 
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
            move(1);
        }


        move(-1);


              if( flag_tama > 0 ) flag_tama--;
        if( Greenfoot.isKeyDown( "7" ) ){
             {if( flag_tama == 0 ){
                getWorld().addObject( new renweapon2(getRotation()), x, y );
                
                flag_tama = 50;
            }
        }
    }  
        

     
        Actor actor = getOneIntersectingObject( georgeweapon2.class );
        if( actor != null ){
                    hp--;// TARO とぶつかった時の処理を書く
                    getWorld().removeObject( actor );
                    setLocation( 500,200 );
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
        getWorld().showText( "george win", 100, 50 );
        Greenfoot.stop();
        }  





    }    
}
