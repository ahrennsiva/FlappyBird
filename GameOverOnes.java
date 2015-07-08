import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GameOverOnes class which sets the image for the ones digit of the game over score.
 * This is based on what the final in game score is. 
 * 
 * @author Ahrenn Sivananthan
 * @version 2014
 */
public class GameOverOnes extends Actor
{
    public int ones;//Variable to hold value for ones digit.
    /**
     *Method which sets the image for the ones digit based on a series of if statements dependent on score value.
     * 
     */
    public void act() 
    {
        if (ones == 0){// Sets image to png of 0 if the score value for ones digit is 0.
            setImage("0.png");
        }    
        if (ones == 1){// Sets image to png of 1 if the score value for ones digit is 1.
            setImage("1.png");
        }    
        if (ones == 2){// Sets image to png of 2 if the score value for ones digit is 2.
            setImage("2.png");
        }    
        if (ones == 3){// Sets image to png of 3 if the score value for ones digit is 3.
            setImage("3.png");
        }                  
        if (ones == 4){// Sets image to png of 4 if the score value for ones digit is 4.
            setImage("4.png");
        }    
        if (ones == 5){// Sets image to png of 5 if the score value for ones digit is 5.
            setImage("5.png");
        }  
        if (ones == 6){// Sets image to png of 6 if the score value for ones digit is 6.
            setImage("6.png");
        }    
        if (ones == 7){// Sets image to png of 7 if the score value for ones digit is 7.
            setImage("7.png");
        }    
        if (ones == 8){// Sets image to png of 8 if the score value for ones digit is 8.
            setImage("8.png");
        }    
        if (ones == 9){// Sets image to png of 9 if the score value for ones digit is 9.
            setImage("9.png");
        }   
    }
}
