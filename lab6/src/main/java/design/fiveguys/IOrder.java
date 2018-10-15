package design.fiveguys;

/**
 *Order Interface 
 *
 */
public interface IOrder {

	/**
	 * Print the customer receipt
	 */
	void printReceipt();
	
	/**
	 * print pack list
	 */
	void printPack();
	
	
	  /**
	   * add child component 
	   * @param c  child component to add
	   */
	  void addChild(IComponent c);
	  
	  /**
	   * remove child component
	   * @param c child component to remove
	   */
	  void removeChild(IComponent c);
	  
		/**
		 * The total amount of the order
		 */
		float getTotal();
		
		
		/**
		 * The total child components
		 */
		int count();
}
