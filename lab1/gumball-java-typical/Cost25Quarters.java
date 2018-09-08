
/**
 * Write a description of class Cost25Quarters here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cost25Quarters extends GumballMachine
{
    // instance variables - replace the example below with your own
    private int size;
    private int maxCost = 25;
    private boolean dispenseOk = false;
   
    /**
     * Constructor for objects of class Cost25Quarters
     */
    public Cost25Quarters(int size)
    {
        // initialise instance variables
        super(size);
    }

    public void insertCoin(int coin)
    {
        if (coin == Coin.QUARTER.coinValue())
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
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
}