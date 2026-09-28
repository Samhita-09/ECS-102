import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * Leaf - a class for representing leaves.
 *
 * @author Michael Kölling
 * @version 2.0
 */
public class Leaf extends Actor
{
    public Leaf()
    {
    }
    public void act(){
        if (canMove()){
            move(1);
        }
        else{
            turn(-90);
        }
    }
    public boolean canMove()
    {
        int rotation = getRotation();
        int x = getX();
        int y = getY();
        boolean facingEdge = false;
        
        switch (rotation) {
            case 0:
                facingEdge = (x == getWorld().getWidth() - 1);
                break;
            case 90:
                facingEdge = (y == getWorld().getHeight() - 1);
                break;
            case 180:
                facingEdge = (x == 0);
                break;
            case 270:
                facingEdge = (y == 0);
                break;
        }
        
        return !facingEdge;
    }
} //class ends
