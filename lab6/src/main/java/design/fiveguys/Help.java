package design.fiveguys;

/**
 * 
 *Tools
 */
public class Help {

	/**
	 * Get the fixed length of string with prefixed blank paded
	 * @param value
	 * @param length
	 * @return fixed length string with white space as prefix
	 */
	public static String fs(Object value, int length) {
	    return String.format("%1$"+length+ "s", String.valueOf(value));
	}
}
