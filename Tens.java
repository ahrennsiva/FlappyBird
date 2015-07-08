import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Tens class which sets the image for the tens digit of the score on FlappyWorld screen.
 * This is based on the number of pipes being passed through as the game progresses. 
 * 
 * @author Ahrenn Sivananthan
 * @version 2014
 */
public class Tens extends Actor
{
    public int tens;//Variable for tens digit.   
    private boolean column;// Sets true/false column variable that helps make only digits with a value greater than 1 visible.  
    private boolean hundredsShift;//Shift hundreds digit onto screen once a value greater than 9 is reached.
    private boolean thousandsShift;//Shift thousands digit onto screen once a value greater than 9 is reached.
    /**
     *Method which sets the image for the tens digit.
     *This is based on a series of if statements dependent on score value.
     * 
     */
    public void act() 
    {
        FlappyWorld stage = (FlappyWorld) getWorld();//Accesses FlappyWorld stage for the Flappy Bird to exist in. This is in reference to FlappyWorld class.
        Hundreds hundreds = stage.getHundreds();//Creates Hundreds object that allows class to obtain hundreds digit value of FlappyBird score.
        Thousands thousands = stage.getThousands();//Creates Thousands object that allows class to obtain thousands digit value of FlappyBird score.       
        if (tens == 0  && column == true){// Sets image to png of 0 if the score value for tens digit is 0, and if hundreds digit is greater than or equal to one shifts this into visible region.
            setImage("0.png");
        }    
        if (tens == 1){// Sets image to png of 1 if the score value for tens digit is 1, and this sets the column variable to a true value making the number visible.
            setImage("1.png");
            column = true;
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
        if (tens == 10){// Increase hundreds digit value  1 and sets image to png of 1 once score value for hundreds digit is 1.
            hundreds.hundreds +=1;
            tens = 0;            
        }
        if (hundreds.hundreds >= 1 && hundredsShift != true){//Moves hundreds digit into visible region on screen once the value for this digit is greater than 1.
            setLocation(35,20);
            hundredsShift = true;
        }
        if (thousands.thousands >= 1 && thousandsShift != true){//Moves thousands digit into visible region on screen once the value for this digit is greater than 1.
            setLocation(50,20);
            thousandsShift = true;
        }
    }
}
