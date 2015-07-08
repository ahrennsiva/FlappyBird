import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hundreds class which sets the image for the hundreds digit of the score on FlappyWorld screen.
 * This is based on the number of pipes being passed through as the game progresses. 
 * 
 * @author Ahrenn Sivananthan
 * @version 2014
 */
public class Hundreds extends Actor
{
    public int hundreds;//Variable for hundreds digit.   
    private boolean column;// Sets true/false column variable that helps make only digits with a value greater than 1 visible.    
    private boolean thousandsShift;//Shift thousands digit onto screen once a value greater than 9 is reached.
     /**
     *Method which sets the image for the hundreds digit.
     *This is based on a series of if statements dependent on score value.
     * 
     */
    public void act() 
    {
        FlappyWorld stage = (FlappyWorld) getWorld();//Accesses FlappyWorld stage for the Flappy Bird to exist in. This is in reference to FlappyWorld class.
        Thousands thousands = stage.getThousands();//Thousands object that allows class to obtain thousands digit value of FlappyBird score.                      
        if (hundreds == 0 && column == true){// Sets image to png of 0 if the score value for hundreds digit is 0, and if thousands digit is greater than or equal to one shifts this into visible region.
            setImage("0.png");
        }    
        if (hundreds == 1){// Sets image to png of 1 if the score value for hundreds digit is 1, and this sets the column variable to a true value making the number visible.
            setImage("1.png");
            column = true;
        }    
        if (hundreds == 2){// Sets image to png of 2 if the score value for hundreds digit is 2.
            setImage("2.png");
        }    
        if (hundreds == 3){// Sets image to png of 3 if the score value for hundreds digit is 3.
            setImage("3.png");
        }                  
        if (hundreds == 4){// Sets image to png of 4 if the score value for hundreds digit is 4.
            setImage("4.png");
        }    
        if (hundreds == 5){// Sets image to png of 5 if the score value for hundreds digit is 5.
            setImage("5.png");
        }  
        if (hundreds == 6){// Sets image to png of 6 if the score value for hundreds digit is 6.
            setImage("6.png");
        }    
        if (hundreds == 7){// Sets image to png of 7 if the score value for hundreds digit is 7.
            setImage("7.png");
        }    
        if (hundreds == 8){// Sets image to png of 8 if the score value for hundreds digit is 8.
            setImage("8.png");
        }    
        if (hundreds == 9){// Sets image to png of 9 if the score value for hundreds digit is 9.
            setImage("9.png");
        }   
        if (hundreds == 10){// Increase thousands digit value by 1 and sets the image to a png of 1 once the score value for thousands digit is 1.
            thousands.thousands +=1;
            hundreds = 0;            
        }   
        if (thousands.thousands >= 1 && thousandsShift != true){//Moves thousands digit into visible region on screen once the value for this digit is greater than 1.
            setLocation(35,20);
            thousandsShift = true;
        }
    }
}
