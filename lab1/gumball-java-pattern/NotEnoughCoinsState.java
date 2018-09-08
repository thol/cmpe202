
/**
 * Abstract class NotEnoughCoinsState - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class NotEnoughCoinsState implements State
{
    GumballMachine gumballMachine;
 
    public NotEnoughCoinsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin() {
    	System.out.println("You inserted a coin");
    	gumballMachine.setState(gumballMachine.getHasCoinState());
    }
    
    public void ejectCoin() {
	System.out.println("Coin returned");
	gumballMachine.setState(gumballMachine.getNoCoinState());
    }
    
    public void turnCrank() {
    	System.out.println("You turned, but there's not enough coin");
     }
    
    public void dispense() {
    	System.out.println("You need to pay first");
    } 
    
    public String toString() {
    	return "waiting for coin";
    }
}
