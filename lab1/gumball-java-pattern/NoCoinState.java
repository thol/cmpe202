

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin() {
		System.out.println("You inserted a coin");
		gumballMachine.setState(gumballMachine.getHasCoinState());
	}
 
	public void ejectCoin() {
		System.out.println("You haven't inserted a coin");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no coin");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coin";
	}
}
