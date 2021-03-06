/**
 * Write a description of class Cost50AllCoins here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cost50AllCoins extends GumballMachine
{
    // instance variables - replace the example below with your own
    private int size;
    private int maxCost = 50;
    private int cumCost = 0;
    private boolean dispenseOk = false;
   
    /**
     * Constructor for objects of class Cost50AllCoins
     */
    public Cost50AllCoins(int size)
    {
        // initialise instance variables
        super(size);
    }

    public void insertCoin(int coin)
    {
        if (coin == Coin.QUARTER.coinValue() || coin == Coin.DIME.coinValue() || coin == Coin.NICKEL.coinValue())
        {
            cumCost += coin;
        }
        
        if ( cumCost >= maxCost )
        {
            dispenseOk = true;
        }
        else
        {
            dispenseOk = false;
        }

    }
    
    public void turnCrank()
    {
        if ( this.dispenseOk )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.dispenseOk = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                cumCost = 0;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a coin" ) ;
        }        
    }
}