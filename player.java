import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -15;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        checkFalling();
        youLost();
        
    if (isTouching(plataforma.class))
    {
        Greenfoot.playSound("splash.wav");
    }
    }
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    public void moveAround()
    {
        
        if (Greenfoot.isKeyDown("space")&&(onGround()==true))
        {
            vSpeed = jumpHeight;
            fall();
        }
    }
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, plataforma.class);
        return under != null;
    }
    public void checkFalling()
    {
        if (onGround()== false)
        {
            fall();
        }
    }
   
    public void youLost()
    {
        if(getY() == 599)
        {
            getWorld().addObject(new youlose(), 400, 300);
        }
    }
}
