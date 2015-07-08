import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Death class which creates world for after Flappy has had its soul taken due to pipe collision, or going out of the world. 
 * Final score is displayed here, with an according medal based on different score ranges.
 * Also adds a reset button to get back into the game. 
 * 
 * @author Ahrenn Sivananthan
 * @version 2014
 */
public class Death extends World 
{
    GameOverThousands gameOverTh;//Imports object that holds the final thousands digit of the player's score.
    GameOverHundreds gameOverHu;//Imports object that holds the final hundreds digit of the player's score.
    GameOverTens gameOverTe;//Imports object that holds the final tens digit of the player's score.
    GameOverOnes gameOverOn;//Imports object that holds the final ones digit of the player's score.    
    Cu2Sn br;//Creates object that holds a bronze colored medal for a score between 10 and 20
    Ag ag;//Creates object that holds a silver colored medal for a score between 20 and 40
    Au au;//Creates object that holds a gold colored medal for a score between 40 and 500
    Pt pt;//Creates object that holds a platinum colored medal for a score above or equal to 500
    /**
     * Constructor that generates world for post Flappy's death. Also adds score objects for each digit, and medals according to score ranges. Takes score value from final value of score objects in game (prior to death).
     * 
     */
    public Death(int thousands, int hundreds, int tens, int ones){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        gameOverTh = new GameOverThousands();//Creates object that holds the final thousands digit of the player's score.
        gameOverHu = new GameOverHundreds();//Creates object that holds the final thousands digit of the player's score.
        gameOverTe = new GameOverTens();//Creates object that holds the final tens digit of the player's score.
        gameOverOn = new GameOverOnes();//Creates object that holds the final ones digit of the player's score.
        Cu2Sn br = new Cu2Sn();//Creates object that holds a bronze colored medal for a score between 10 and 20
        Ag ag = new Ag();//Creates object that holds a silver colored medal for a score between 20 and 40
        Au au = new Au();//Creates object that holds a gold colored medal for a score between 40 and 500
        Pt pt = new Pt();//Creates object that holds a platinum colored medal for a score above or equal to 500
        gameOverTh.thousands = thousands;//Sets the value of the thousands digit to show up on game over screen to thousands digit of final score.
        gameOverHu.hundreds = hundreds; //Sets the value of the hundreds digit to show up on game over screen to hundreds digit of final score.
        gameOverTe.tens = tens;//Sets the value of the tens digit to show up on game over screen to tens digit of final score.
        gameOverOn.ones = ones;//Sets the value of the ones digit to show up on game over screen to ones digit of final score.            
        prepare();//Runs prepare method.
        if(tens == 1 && hundreds == 0){//If score is in this range add bronze medal to death screen.
            addObject(br,300,310);//Adds a bronze colored medal to the screen.
        } else if (tens > 1 && (tens <= 4 && hundreds == 0)){//If score is in this range add silver medal to death screen.
            addObject(ag,300,310);//Adds a silver colored medal to the screen.
        } else if ((tens > 4 && hundreds < 5) || (tens < 4 && (hundreds >= 1 && hundreds < 5))){//If score is in this range add gold medal to death screen.
            addObject(au,300,310);//Adds a gold colored medal to the screen.
        } else if (hundreds >= 5){//If score is in this range add platinum medal to death screen.
            addObject(pt,300,310);//Adds a platinum colored medal to the screen.
        } 
    }          

    /**
     * Prepare the world and add the necessary objects once Flappy has died.
     * This is where reset button and game over object are added, along with the final score achieved in game.
     */
    private void prepare()
    {
        ResetButton resetbutton = new ResetButton();// Creates reset button object; to be clicked to go back into the game with a new version of Flappy Bird..
        addObject(resetbutton, 208, 130);// Adds reset button object; to be clicked to go back into the game with a new version of Flappy Bird..
        resetbutton.setLocation(370, 230);// Sets location reset button object; to be clicked to go back into the game with a new version of Flappy Bird..
        GameOver gameOver = new GameOver();// Creates Game Over object, to tell players that they have died so they can reset the game accordingly. 
        addObject(gameOver,300,150);// Adds Game Over object, to tell players that they have died so they can reset the game accordingly. 
        gameOver.setLocation(300,130);//Sets location Game Over object, to tell players that they have died so they can reset the game accordingly. 
        addObject(gameOverTh,280,200);//Adds object that holds the final thousands digit of the player's score.
        addObject(gameOverHu,300,200);//Adds object that holds the final hundreds digit of the player's score.
        addObject(gameOverTe,320,200);//Adds object that holds the final tens digit of the player's score.
        addObject(gameOverOn,340,200);//Adds object that holds the final ones digit of the player's score.     
    }
}