import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    private List<Picker> pickers;
    
    public void addPicker(Picker obj)
    {
        pickers.add(obj);
    }
    
    public void removePicker(Picker obj)
    {
        pickers.remove(obj);
    }
    
    public void inspect(Coin coin)
    {
        System.out.println("Coin " + coin.getClass());
        
        World world = getWorld();
        pickers = world.getObjects(Picker.class);
        
        int totalPickers = world.getObjects(Picker.class).size();
        System.out.println("Total " + totalPickers);
        
        if (totalPickers > 0)
        {
            int whichPicker = Greenfoot.getRandomNumber(totalPickers);
            Picker pickerChosen = pickers.get(whichPicker);
            System.out.println("Picker: " + pickerChosen.getClass());
     
            if (coin.getClass() == Quarter.class)
                pickerChosen.pick();
        }
    }
    
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
