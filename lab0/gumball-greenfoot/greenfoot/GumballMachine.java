import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{

    Actor haveCoin;
    
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ;
    }

    Message m = new Message();
    private void setMessage(String msg)
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
    
    public void act() 
    {
        int mouseX, mouseY;
        
        if ( Greenfoot.mousePressed(this)) {
            if ( haveCoin == null )
            {
                setMessage("No coin in slot!");
            }
            else
            {
                setMessage("Crank turned!");
            }
        }
        
        Actor coin;
        // coin = getOneIntersectingObject(Coin.class);
        coin = getOneObjectAtOffset(+10, +10, Coin.class);
        
        if (coin != null) {
            if (haveCoin != null )
            {
                coin.move(-300);
            }
            else
            {
                haveCoin = coin;
                setMessage("Have coin!");
                World world = getWorld();
                ((Coin)coin).inSlot(world);
                
                world.removeObject(coin);
            }
        }
    }    
}
