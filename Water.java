import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends World
{

    /**
     * Constructor for objects of class Water.
     * 
     */
    public Water()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        plataforma plataforma = new plataforma();
        addObject(plataforma,82,280);
        plataforma.setLocation(80,279);
        plataforma.setLocation(83,295);
        plataforma plataforma2 = new plataforma();
        addObject(plataforma2,238,258);
        plataforma plataforma3 = new plataforma();
        addObject(plataforma3,177,163);
        plataforma plataforma4 = new plataforma();
        addObject(plataforma4,327,195);
        plataforma plataforma5 = new plataforma();
        addObject(plataforma5,369,317);
        player player = new player();
        addObject(player,85,263);
        plataforma plataforma6 = new plataforma();
        addObject(plataforma6,489,229);
        plataforma plataforma7 = new plataforma();
        addObject(plataforma7,554,132);
    }
}
