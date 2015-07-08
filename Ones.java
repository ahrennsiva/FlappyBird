import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ones class which sets the image for the ones digit of the score on FlappyWorld screen.
 * This is based on the number of pipes being passed through as the game progresses. 
 * 
 * @author Ahrenn Sivananthan
 * @version 2014
 */
public class Ones extends Actor
{
    public int ones;//Variable for ones digit.
    private boolean tensShift;//Shift tens digit onto screen once a value greater than 9 is reached.
    private boolean hundredsShift;//Shift hundreds digit onto screen once a value greater than 9 is reached.
    private boolean thousandsShift;//Shift thousands digit onto screen once a value greater than 9 is reached.
    /**
     *Method which sets the image for the ones digit.
     *This is based on a series of if statements dependent on score value.
     * 
     */
    public void act() 
    {
        FlappyWorld stage = (FlappyWorld) getWorld();//Accesses FlappyWorld stage for the Flappy Bird to exist in. This is in reference to FlappyWorld class.
        Tens tens = stage.getTens();//Creates Tens object that allows class to obtain tens digit value of FlappyBird score.
        Hundreds hundreds = stage.getHundreds();//Creates Hundreds object that allows class to obtain hundreds digit value of FlappyBird score.
        Thousands thousands = stage.getThousands();//Creates Thousands object that allows class to obtain thousands digit value of FlappyBird score.
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
        if (ones == 10){// Increase tens digit value  1 and sets image to png of 1 once score value for tens digit is 1.
            tens.tens +=1;
            ones = 0;            
        }   
        if (tens.tens >= 1 && tensShift != true){//Moves tens digit into visible region on screen once the value for this digit is greater than 1.
            setLocation(35,20);
            tensShift = true;
        }
        if (hundreds.hundreds >= 1 && hundredsShift != true){//Moves hundreds digit into visible region on screen once the value for this digit is greater than 1.
            setLocation(50,20);
            hundredsShift = true;
        }
        if (thousands.thousands >= 1 && thousandsShift != true){//Moves thousands digit into visible region on screen once the value for this digit is greater than 1.
            setLocation(65,20);
            thousandsShift = true;
        }
    }
}
