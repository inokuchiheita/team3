import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    private GreenfootSound music;
    
   
    public MyWorld()
    {    
        
              // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        int A = 0;
        int B = 600;
        int c = A + (int)(Math.random()*((B-A)+1));
        int g = A + (int)(Math.random()*((B-A)+1));

        int D = 0;
        int E = 100;
        int I = 300;
        int J = 400;
        int f = D + (int)(Math.random()*((E-D)+1));
        int h = I + (int)(Math.random()*((J-I)+1));
        addObject( new hurdle(), 300, 200);
        addObject( new hurdle2(), c, f );
        addObject( new hurdle3(), g, h );
        
        addObject( new george(), 100, 200 );
        addObject( new ren(), 500, 200 );
        
        music = new GreenfootSound("music.mp3");
        music.playLoop();
        
        

        /*addObject( new hurdle(), 300, 100);
        addObject( new hurdle(), 100, 300 );
        addObject( new hurdle(), 450, 320);*/
        
        //if(!music.isPlaying())
         //   {
          //      music.playLoop();//}   
  

    }
    
    public void stop_music()
    {
        if(music != null ) music.stop();
    }
    
}

        
    

