import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GameOverThousands class which sets the image for the thousands digit of the game over score.
 * This is based on what the final in game score is. 
 * 
 * @author Ahrenn Sivananthan
 * @version 2014
 */
public class GameOverThousands extends Actor{    
    public int thousands;//Variable to hold the value for thousands digit.
    /**
     *Method which sets the image for the thousands digit based on a series of if statements dependent on score value.
     * 
     */
    public void act() 
    {        
        if (thousands == 0){// Sets image to png of 0 if the score value for thousands digit is 0.
            setImage("0.png");
        }    
        if (thousands == 1){// Sets image to png of 1 if the score value for thousands digit is 1.
            setImage("1.png");            
        }    
        if (thousands == 2){// Sets image to png of 2 if the score value for thousands digit is 2.
            setImage("2.png");
        }    
        if (thousands == 3){// Sets image to png of 3 if the score value for thousands digit is 3.
            setImage("3.png");
        }                  
        if (thousands == 4){// Sets image to png of 4 if the score value for thousands digit is 4.
            setImage("4.png");
        }    
        if (thousands == 5){// Sets image to png of 5 if the score value for thousands digit is 5.
            setImage("5.png");
        }  
        if (thousands == 6){// Sets image to png of 6 if the score value for thousands digit is 6.
            setImage("6.png");
        }    
        if (thousands == 7){// Sets image to png of 7 if the score value for thousands digit is 7.
            setImage("7.png");
        }    
        if (thousands == 8){// Sets image to png of 8 if the score value for thousands digit is 8.
            setImage("8.png");
        }    
        if (thousands == 9){// Sets image to png of 9 if the score value for thousands digit is 9.
            setImage("9.png");
        }           
    }
}
