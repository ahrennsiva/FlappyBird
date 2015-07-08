import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pipe class which will make pipes flow in from right side to the left, which the Flappy Bird must avoid hitting.
 * 
 * @author Ahrenn Sivananthan 
 * @version 2014
 */
public class Pipe extends Actor
{
    final int PIPE_SPEED = 5;// Sets speed of pipes to a constant value, which will cause them to move across screen at this rate.
    /**
     * Sets the location of the pipe based on velocity of pipes that has been set.
     * This also removes the pipes once they are off screen; to make the game less laggy and more efficient.
     */
    public void act() 
    {              
        setLocation(getX()- PIPE_SPEED, getY());
        if (getX() == -10){
            getWorld().removeObject(this);  
        }    
    }
}
