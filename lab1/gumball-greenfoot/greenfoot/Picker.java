import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Picker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Picker extends Alien
{
    Message m = new Message();
    
    public void setMessage(String msg)
    {
        int mouseX, mouseY;
        MouseInfo mouse = Greenfoot.getMouseInfo();
        mouseX = mouse.getX();
        mouseY = mouse.getY();
        World world = getWorld();
        
        if (m.getWorld() != null)
        {
            world.removeObject(m);
        }
        world.addObject(m, mouseX, mouseY);
        m.setText(msg);
    }

    
    /**
     * Act - do whatever the Picker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void pick() 
    {
        System.out.println("Picker pick");
    }    
   
}
