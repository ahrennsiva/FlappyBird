import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * FlappyBird class which manages the bird's gravity, acceleration and movement values. 
 * Helps with moving the bird accurately, as well as rotates it based on physics.
 * This method also tracks the score based on passing through pipes or not. 
 * If a player fails to pass through pipes and essentially kills Flappy Bird, after its soul has been taken the player will be moved to a Death screen from here to reset the game.
 * 
 * @author Ahrenn Sivananthan
 * @version 2014
 */
public class FlappyBird extends Actor
{
    double dy = -10;//Sets amount in y-direction that movement will be.       
    final double g = 0.466;//Final value for gravity,so that Flappy Bird accelerates according to (reasonable) laws of physics.
    final double BOOST_SPEED = -6;//Final value for Boost speed which affects the up and down distance per click.
    Death dead;//Creates Death object so when Flappy Bird has its soul taken the game will move you to the death screen.
    private int t;//Variable value so that once a character is above the screen by a certain amount they die
    Ones ones;//Creates score object for ones digit, this is kept track of and the value is used in Death Screen and on FlappyWorld screen.
    Tens tens;//Creates score object for tens digit, this is kept track of and the value is used in Death Screen and on FlappyWorld screen.
    Hundreds hundreds;//Creates score object for hundreds digit, this is kept track of and the value is used in Death Screen and on FlappyWorld screen.
    Thousands thousands;//Creates score object for thousands digit, this is kept track of and the value is used in Death Screen and on FlappyWorld screen.
    /**
     * Method that performs main Flappy Bird actions. This determines the location of Flappy Bird on the screen, sets his movement values, and location.
     * Additionally, this determines when collisions are made, or pipes are passed through; to determine when to go to Death screen, and when to increase score.
     * 
     */
    public void act() 
    {
        FlappyWorld stage = (FlappyWorld) getWorld();//Accesses FlappyWorld stage for the Flappy Bird to exist in. This is in reference to FlappyWorld class.
        ones = stage.getOnes();//Sets ones object value to that of the ones digit value according to score in FlappyWorld.
        tens = stage.getTens();//Sets tens object value to that of the tens digit value according to score in FlappyWorld.
        hundreds = stage.getHundreds();//Sets hundreds object value to that of the hundreds digit value according to score in FlappyWorld.
        thousands = stage.getThousands();//Sets thousands object value to that of the thousands digit value according to score in FlappyWorld.      
        dead = new Death(thousands.thousands, hundreds.hundreds, tens.tens, ones.ones);//Creates a death screen object to be transferred to at soul removal. At this point the final score values for each digit are set.
        //If player is touching a pipe, then Game over!
        if (getOneIntersectingObject(Pipe.class) != null){
            displayGameOver();//Displays Game Over on FlappyWorld screen.    
            Greenfoot.delay (81);//Slight delay between Game Over and Death Screen.  
            Greenfoot.setWorld(dead);//Brings player to death screen where they have the option to restart the game.           
        }
        // Allows for visibility on screen of touching pipes, rather than act method just occurring.
        rotateFlappyBird();//Runs method for rotation which rotates Flappy Bird to a certain angle in relation to the y-direction movement value.
        setLocation (getX(),(int)(getY()+ dy));//Sets location of Flappy Bird based on y-location and amount of movement in y-direction at the time.
        //If user clicks mouse, launch Flappy Bird upwards, and set y-direction movement value to the boost speed..
        if(Greenfoot.mouseClicked(null))
        {
            dy = BOOST_SPEED;
        }
        //If FlappyBird drops out of the world, Game Over!
        if (getY() > getWorld().getHeight()){
            displayGameOver();//Displays Game Over on FlappyWorld screen.   
            Greenfoot.delay (92);//Slight delay between Game Over and Death Screen.
            Greenfoot.setWorld(dead);//Brings player to death screen where they have the option to restart the game.           
        }
        //If FlappyBird jumps out of the world, Game Over!
        if (getY() < 0){
            t += 1;//Increases variable value of t to determine when player has flown too high above the screen to be acceptable.
            if (t == 100){                
                displayGameOver();//Displays Game Over on FlappyWorld screen.     
                Greenfoot.delay (78);//Slight delay between Game Over and Death Screen.
                Greenfoot.setWorld(dead);//Brings player to death screen where they have the option to restart the game.           
            }
        }
        dy = dy + g;//Sets the y-direction movement value based on amount of mouse clicks, and the gravity.
    }     

    /**
     * Method that displays Game Over on FlappyWorld screne.
     * This method sets the location to display the GameOver screen, and the cases in which this is to be used are set in main act method above.
     * 
     */
    private void displayGameOver(){//Method which displays Game Over on the FlappyWorld screen when Flappy Bird has his soul taken.
        GameOver gameOver = new GameOver();
        getWorld().addObject(gameOver, getWorld().getWidth()/2,getWorld().getHeight()/2);        
    }

    /**
     * Rotates Flappy Bird to a certain angle in relation to the y-direction movement value. 
     * This is essentially based on mouse clicking and speed of Flappy.     
     * 
     */

    private void rotateFlappyBird(){
        if (dy < 1){//Sets rotation of Flappy Bird to this angle at a y-direction movement value of 1.
            setRotation (-30);
        }else if (dy < 8){//Sets rotation of Flappy Bird to this angle at a y-direction movement value of 8.
            setRotation (0);
        } else if (dy < 12){//Sets rotation of Flappy Bird to this angle at a y-direction movement value of 12.
            setRotation (50);
        } else if (dy < 30){//Sets rotation of Flappy Bird to this angle at a y-direction movement value of 30.
            setRotation (85);
        }
    }
}
