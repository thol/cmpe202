
/**
 * Enumeration class Coin - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Coin
{
   NICKEL(5),
   DIME(10),
   QUARTER(25),
   PENNY(1);

   private final int coinValue;

   Coin(int coinValue)
   {
      this.coinValue = coinValue;
   }

   int coinValue()
   {
      return coinValue;
   }

}