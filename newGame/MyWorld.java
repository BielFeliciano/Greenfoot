import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        Frog frog = new Frog();
        addObject(frog, 50, 300);

        prepare();
     }
    
    public void act() 
    {
        showText("Score: " + score,50,25);
        if(score == 6)
        {
            Greenfoot.stop();
            showText("You win!", 400, 300);
        }
    }    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        score = 0;
        Fly fly = new Fly();
        addObject(fly,350,230);
        Fly fly2 = new Fly();
        addObject(fly2,445,450);
        Fly fly3 = new Fly();
        addObject(fly3,724,486);
        Fly fly4 = new Fly();
        addObject(fly4,127,62);
        Fly fly5 = new Fly();
        addObject(fly5,160,547);
        Fly fly6 = new Fly();
        addObject(fly6,611,67);
        Fly fly7 = new Fly();
        addObject(fly6,650,150);
        //
        Snake snake = new Snake();
        addObject(snake,445,72);
        Snake snake2 = new Snake();
        addObject(snake2,653,243);
        Snake snake3 = new Snake();
        addObject(snake3, 461, 533);

    }
}

