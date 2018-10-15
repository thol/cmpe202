package design.fiveguys;

/**
 *Kitchen Factory to make the burger, drink,fry etc. 
 */
public interface IFactory {

	IComponent getDrink(String name);
	IComponent getTopping(String name);
	IComponent getStaple(String nick);
	IComponent getMilkshake(boolean hasCream);
	IComponent getFry(String name);
}
