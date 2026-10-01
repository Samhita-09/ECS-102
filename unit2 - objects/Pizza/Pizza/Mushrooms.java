import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mushrooms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mushrooms extends Actor
{
    /**
     * Act - do whatever the Mushrooms wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fall();
    }
    
    private void fall()
    {
        setLocation(getX(), getY() + 2);
        if (getY() > getWorld().getHeight() - 2)
        {
            int randomX = Greenfoot.getRandomNumber(getWorld().getWidth());
            setLocation(randomX, 0);
        }
    }
}
