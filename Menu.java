import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Menu class which creates title for Flappy Bird game, a start button, and another button with instructions, that can also be clicked to start the game.
 * 
 * @author Ahrenn Sivananthan
 * @version 2014
 */
public class Menu extends World
{
    /**
     * Constructor that generates menu screen for the game. Also adds a start button object, and a instructions type button(that can be clicked to start the game as well).
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);         
        StartButton start = new StartButton();//Creates Start button object.
        addObject(start,178,320);// Adds Start button object to screen.
        FlappyTitle title = new FlappyTitle();//Creates Flappy Bird title object.
        addObject(title,300,80);//Adds Flappy Bird title object to screen.        
        FlappyIntroPic pic = new FlappyIntroPic();// Creates Flappy Bird intructions type object(that can be clicked to start game as well).
        addObject(pic,300,220);// Adds Flappy Bird intructions type object(that can be clicked to start game as well).
    }
}
