import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld thisGame;
    public void act() 
    {
        move(4);
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        eatFly();
    } 

    public void eatFly()
    {
        if(isTouching(Fly.class))
        {
            removeTouching(Fly.class);
            thisGame.score++;
        }
    }
}   
