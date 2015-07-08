import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * StartButton class which holds the image for the start button. 
 * This will be added to the menu screen so that when pressed the FlappyWorld will initiate and the game will commence. 
 * 
 * @author Ahrenn Sivananthan
 * @version 2014
 */
public class StartButton extends Actor
{
    /**
     * Method which allows for the Start button on the Menu Screen to be clicked.
     * When the button is clicked the game will start after the creation of FlappyWorld.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){//This makes it so when the Start button is pressed the world will start, and be set to a new FlappyWorld.
            Greenfoot.setWorld(new FlappyWorld());
        }    
    }
}

