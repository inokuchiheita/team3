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
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject( new george(), 100, 200 );
        addObject( new ren(), 500, 200 );
        addObject( new hurdle(), 300, 100);
        addObject( new hurdle(), 100, 300 );
        addObject( new hurdle(), 450, 320);


    }
}
