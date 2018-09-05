import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void pick() 
    {
        World world = getWorld();
        Gumball gbR = new RedGumball();
        Gumball gbG = new GreenGumball();
        Gumball gbB = new BlueGumball();
        ArrayList<Gumball> balls = new ArrayList<Gumball>();
        balls.add(gbR);
        balls.add(gbG);
        balls.add(gbB);
        int whichBall = Greenfoot.getRandomNumber(balls.size());
        
        world.addObject(balls.get(whichBall), 500, 500);
        setMessage(balls.get(whichBall).getClass().getName());
    } 
}
