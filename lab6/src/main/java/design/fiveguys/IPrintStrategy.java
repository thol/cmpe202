package design.fiveguys;

/**
 * 
 *Print strategy: customer receipt format or pack format.
 */
public interface IPrintStrategy {
	
	/**
	 * print out the data
	 */
	void print(IComponent main);
}
