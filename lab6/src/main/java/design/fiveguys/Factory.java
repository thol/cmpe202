package design.fiveguys;

import java.util.HashMap;
import java.util.Map;

 
public class Factory implements IFactory {
	private Map<String,IComponent> toppings;
	private Map<String,IComponent> staples;
	private Map<String,IComponent> drinks;
	private Map<String,IComponent> fries;
	private Map<String,IComponent> milkshake;
	
	String[] toppingStr={"lettuce","pickles","tomatoes","grilled onions","mayo","mustard","grilled mushrooms","ketchup","green peppers","relish","onions","jalapeos","hot sauce","steak sauce","bar-b-q sauce"};
	boolean[] milkshakeStr={true,false};
	float[] milkshakePrice={2,(float)0.5};
	
	String[] drinkStr= {"regular","large","bottled water"};
	float[] drinkPrice= {1,2,(float) 1.5};
	
	String[] fryStr={"little FGS","regular FGS","large FGS","little CAJ","regular CAJ","large CAJ"};
	float[] fryPrice= {(float) 0.5,2,(float) 3.5,(float) 0.5,2,(float) 3.5};
	
	String[] burgerStr={"hamburger ","hb","ham","5.5","cheeseburger ","cb","cheese","6.5","bacon burger ","bb","bacon ","7.5","bacon cheeseburger ","bcb","bacon cheese","8.5","little hamburger ","lhb","ham","3.5","little cheeseburger ","lcb","cheese","4.5","little bacon burger ","lbb","bacon","3.5","little bacon cheeseburger ","lbc","bacon cheese","3.5"};
	String[] dosStr={"kosher style hot dog ","kd","kosher","2.5","cheese dog ","cd","cheese","2.5","bacon dog ","bd","bacon","3.5","bacon cheese dog ","bcd","bacon cheese","4"};
    String[] sandwichStr={"veggie sandwich ","vs","veggie","3.5","cheese veggie sandwich ","cvs","cheese veggie","4.5","grilled cheese  sandwich ","gcs","grilled cheese ","4","blt ","blt ","blt ","5"};
	
	@Override
	public IComponent getDrink(String name) {try {
		return drinks.get(name).clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}

	@Override
	public IComponent getTopping(String name) {try {
		return toppings.get(name).clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}return null;}

	@Override
	public IComponent getStaple(String nick) {try {
		return staples.get(nick).clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}return null;	}

	@Override
	public IComponent getMilkshake(boolean hasCream) {try {
		return milkshake.get(String.valueOf(hasCream)).clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}return null;}
	
	@Override
	public IComponent getFry(String name) {	try {
		return fries.get(name).clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}return null;	}
	
   public Factory() {
	   toppings=new HashMap<String,IComponent>();
	   staples=new HashMap<String,IComponent>();
	   drinks=new HashMap<String,IComponent>();
	   fries=new HashMap<String,IComponent>();
	   milkshake=new HashMap<String,IComponent>();
	   buildAll();
	   
   }
   
   private void buildAll() {
	   
	   for(String s:toppingStr) {toppings.put(s,new Topping(s,0));}
	   int i=0;
	   for(boolean s:milkshakeStr) {
		   String cream=s?" (CREAM)":"";
		   String n="FIVE GUYS SHAKE"+cream;
		   milkshake.put(String.valueOf(s),new MilkShake(n,n,milkshakePrice[i]));
		   i++;
		}
	   
	   	   
	   i=0;
	   for(String s:drinkStr) {
		   drinks.put(s,new Drink(s,s,drinkPrice[i]));
		   i++;
	   }
	   
	   i=0;
	   for(String s:fryStr) {
		   fries.put(s,new Drink(s,s,fryPrice[i]));
		   i++;
	   }
	   
	   for(i=0;i<burgerStr.length/4;i++) {
		   staples.put(burgerStr[1+4*i],new Staple("BURGER",burgerStr[2+4*i],burgerStr[1+4*i],burgerStr[0+4*i],0,Float.valueOf(burgerStr[3+4*i])));
	   }
	   
	   for(i=0;i<dosStr.length/4;i++) {
		   staples.put(dosStr[1+4*i],new Staple("DOG",dosStr[2+4*i],dosStr[1+4*i],dosStr[0+4*i],0,Float.valueOf(dosStr[3+4*i])));
	   }
	   
	   for(i=0;i<sandwichStr.length/4;i++) {
		   staples.put(sandwichStr[1+4*i],new Staple("SANDWICHE",sandwichStr[2+4*i],sandwichStr[1+4*i],sandwichStr[0+4*i],0,Float.valueOf(sandwichStr[3+4*i])));
	   }
	   
   }
	
}
