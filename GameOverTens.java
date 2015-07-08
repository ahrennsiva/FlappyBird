import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * GameOverTens class which sets the image for the tens digit of the game over score.
 * This is based on what the final in game score is. 
 * 
 * @author Ahrenn Sivananthan
 * @version 2014
 */
public class GameOverTens extends Actor
{
    public int tens;//Variable to hold value for tens digit.
    /**
     *Method which sets the image for the tens digit based on a series of if statements dependent on score value.
     * 
     */
    public void act() 
    {              
        if (tens == 0){// Sets image to png of 0 if the score value for tens digit is 0.
            setImage("0.png");
        }    
        if (tens == 1){// Sets image to png of 1 if the score value for tens digit is 1.
            setImage("1.png");            
        }    
        if (tens == 2){// Sets image to png of 2 if the score value for tens digit is 2.
            setImage("2.png");
        }    
        if (tens == 3){// Sets image to png of 3 if the score value for tens digit is 3.
            setImage("3.png");
        }                  
        if (tens == 4){// Sets image to png of 4 if the score value for tens digit is 4.
            setImage("4.png");
        }    
        if (tens == 5){// Sets image to png of 5 if the score value for tens digit is 5.
            setImage("5.png");
        }  
        if (tens == 6){// Sets image to png of 6 if the score value for tens digit is 6.
            setImage("6.png");
        }    
        if (tens == 7){// Sets image to png of 7 if the score value for tens digit is 7.
            setImage("7.png");
        }    
        if (tens == 8){// Sets image to png of 8 if the score value for tens digit is 8.
            setImage("8.png");
        }    
        if (tens == 9){// Sets image to png of 9 if the score value for tens digit is 9.
            setImage("9.png");
        }   
    }
}
