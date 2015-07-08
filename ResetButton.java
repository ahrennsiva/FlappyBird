import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * ResetButton class which holds the image for the reset button. 
 * This will be added to the death screen so that when Flappy's soul has been taken this button can be clicked to bring you back into the world with a new Flappy Bird.
 * 
 * @author Ahrenn Sivananthan
 * @version 2014
 */
public class ResetButton extends Actor
{
    /**
     * Method which allows for the Reset button on the Death Screen to be clicked.
     * When the button is clicked the game will restart with a new Flappy Bird.
     */
    public void act() 
    {       
        FlappyWorld startWorld = new FlappyWorld();//This creates a new FlappyWorld object with a new FlappyBird and all parts involved in FlappyWorld class.
        if (Greenfoot.mouseClicked(this) == true){//This makes it so when the OK reset button is pressed the world will restart, and be set to a new FlappyWorld.
            Greenfoot.setWorld(startWorld);
        }    
    }
}
