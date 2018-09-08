
/**
 * Write a description of class GumballMachine50cQuartersOnly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine50cQuartersOnly extends GumballMachine
{
    // instance variables - replace the example below with your own
    private int size;
    private int maxCost = 50;
   
    /**
     * Constructor for objects of class Cost25Quarters
     */
    public GumballMachine50cQuartersOnly(int size)
    {
        // initialise instance variables
        super(size);
    }

    public void insertCoin(int coin) {
        state.insertCoin();
        if (coin == Coin.QUARTER.coinValue())
        {
            cumValue += coin;
        }
        
        if ( cumValue >= maxCost )
        {
            this.setState(this.getEnoughCoinsState());
        }
        else
        {
            this.setState(this.getNotEnoughCoinsState());
        }
    }
    
    public void ejectCoin() {
        state.ejectCoin();
    }
    
    public void turnCrank() {
        state.turnCrank();
        if (this.getState() == this.getEnoughCoinsState())
            state.dispense();
    }
    
    void setState(State state) {
        this.state = state;
    }

}
