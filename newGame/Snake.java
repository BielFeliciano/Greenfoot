import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(4);
        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(15)-30);
        }
        eatFrog();
    }

    public void eatFrog()
    {
        if(isTouching(Frog.class))
        {
            removeTouching(Frog.class);
            getWorld().showText("You Lose!", 400, 300);
            Greenfoot.stop();
        }
    }
}
