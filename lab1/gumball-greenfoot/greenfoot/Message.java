import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    GreenfootImage gi;
    
    public Message()
    {
        gi = new GreenfootImage(100, 50);
        setImage(gi);
    }
    
    public void setText(String msg)
    {
        gi.clear();
        gi.setColor(Color.YELLOW);
        gi.fill();
        gi.setColor(Color.BLACK);
        gi.drawString(msg, 0, 25);
    }
    
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
            World world = getWorld();
            world.removeObject(this);
        }
    }    
}
