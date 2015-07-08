import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * FlappyWorld class which creates world for Flappy, pipes, and scoreboard to coexist.
 * 
 * @author Ahrenn Sivananthan
 * @version 2014
 */
public class FlappyWorld extends World
{
    int pipeShowing;//Amount of pipe that will show on screen(essentially sets the pipe heights).
    int pipeDistance;//Sets an ideal amount of spacing in between pipes, so that they won't overlap and so Flappy Bird can actually pass through.
    int pipeCounter = 0;//Keeps track of pipes timing and generation. 
    int flappyCounter = 0;// Keeps track of Flappy Bird timing; to help determine when to generate next pipe.
    private Ones ones;//Ones object to keep track of ones digit of score.
    private Tens tens;//Tens object to keep track of tens digit of score.
    private Hundreds hundreds;//Hundreds object to keep track of hundreds digit of score.
    private Thousands thousands;//Thousands object to keep track of thousands digit of score.
    final int FIRST_PIPE = 208;//Constant value set to determine time when to generate the first pipe.      
    /**
     * Constructor that initializes FlappyWorld, and adds: Flappy, the ground, and score objects for each digit.
     */
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 

        //Set paint order so Game Over popup is above the pipes, ground is put in right layer, and Flappy Bird doesn't go behind the pipes.
        setPaintOrder(GameOver.class,FlappyBird.class,Pipe.class,Ground.class);

        //Creates a Flappy Bird Object.
        FlappyBird flappy = new FlappyBird();

        //Adds flappy to the world.
        addObject(flappy,100,getHeight()/2);

        //Creates ground for the world.
        Ground ground = new Ground();             

        //Adds ground to the world.
        addObject(ground,300,400);

        //Creates number counter objects.
        ones = new Ones();
        tens = new Tens();
        hundreds = new Hundreds();
        thousands = new Thousands();
        //Add number counter objects to the world.
        addObject(ones,20,20);
        addObject(tens,20,20);
        addObject(hundreds,20,20);
        addObject(thousands,20,20);            
    }

    /**
     * Method that increases a counter to determine when the next pipe should be generated. Also increases score by 1 everytime a pipe is passed.
     */
    public void act(){
        pipeCounter++;//Increases pipe counter amount to help determine when to add next pipe.
        if (pipeCounter % 85 == 0){ // Sets point to create first pipe.
            createPipes();            
        }
        if (pipeCounter >= FIRST_PIPE){// Sets distance after first pipe to create each next pipe.
            if (flappyCounter % 85 == 0){
                ones.ones += 1;
            }
            flappyCounter++;//Increase counter of amount Flappy Bird moved to help find next point to add pipe.            
        }
    }

    /**
     * Method that determines the ones digit of the score.
     */
    public Ones getOnes(){
        return ones;//Gets one value.
    }

    /**
     * Method that determines the tens digit of the score.
     */
    public Tens getTens(){
        return tens;//Gets tens value.
    }

    /**
     * Method that determines the hundreds digit of the score.
     */public Hundreds getHundreds(){
        return hundreds;//Gets hundreds value.
    }

    /**
     * Method that determines the thousands digit of the score.
     */
    public Thousands getThousands(){
        return thousands;//Gets thousands value.
    }

    /**
     * Method that generates top and bottom pipe objects. 
     * Uses a random number generator to set the visibility of the pipe (within a certain range of values).
     * Sets distance in between top and bottom pipes (within a certain range of values, so pipes don't overalap). 
     */
    private void createPipes(){
        Pipe bottomPipe = new Pipe();// Generates bottom pipe.
        Pipe topPipe = new Pipe();//Generates top pipe.
        topPipe.setImage("top_pipe.png");//Sets image for top pipe.
        bottomPipe.setImage("bottom_pipe.png");//Sets image for bottom pipe.
        GreenfootImage bottom = bottomPipe.getImage();//Gets image for bottom pipe, to help display it.
        GreenfootImage top = topPipe.getImage();//Gets image for top pipe, to help display it.
        pipeShowing = Greenfoot.getRandomNumber(178);//Sets visibility of pipe.
        pipeDistance = Greenfoot.getRandomNumber(8)+117;//Sets distance in between top and bottom pipes.
        addObject(bottomPipe, getWidth(),getHeight()/2 + bottom.getHeight()- pipeShowing);// Adds bottom pipe object to the screen and at the right place.
        addObject(topPipe, bottomPipe.getX(),bottomPipe.getY()- bottomPipe.getImage().getHeight()- pipeDistance);// Adds top pipe object to the screen and at the right place.

    }
}