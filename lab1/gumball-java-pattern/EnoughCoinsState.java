
/**
 * Write a description of class EnoughCoinState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EnoughCoinsState implements State
{
    GumballMachine gumballMachine;
 
    public EnoughCoinsState(GumballMachine gumballMachine) {
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
	System.out.println("You turned...");
	gumballMachine.setState(gumballMachine.getSoldState());
     }
 
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }

}
