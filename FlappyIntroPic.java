import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * FlappyIntroPic class which holds the image for the Get Ready button on the menu screen.
 * This can be clicked alternatively to the start button to commence the game.
 * 
 * @author Ahrenn Sivananthan
 * @version 2014
 */
public class FlappyIntroPic extends Actor
{
    /**
     * Method which allows for the Get Ready button on the menu to be clicked.
     * When the button is clicked the game will start
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){//This makes it so when the Get Ready button is pressed the world will start, and be set to a new FlappyWorld.
            Greenfoot.setWorld(new FlappyWorld());
        }    
    }    
}
