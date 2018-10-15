package design.fiveguys;

import java.util.ArrayList;

public class Component implements IComponent{

	private String category;  //such as Burger
	private String meat;   //such as BACON
	private String nickName; //such as LBB
	private String fullName; // LITTLE BACON BURGER
	private ArrayList<IComponent> components;
	private IPrintStrategy printStrategy;
	
	private int qty;  //default 1
	private float subtotal; //the price
	
	private static int NICK_NAME_LENGTH=15;
	private static int SUBTOTAL_LENGTH=40;
	private static int COMPONENT_LENGTH=10;
	private static String BOTTOM_PREFIX="->|";

	private int calory;
	private float price;
	
	private IPrintStrategy receiptPrint=new IPrintStrategy() {
		@Override
		public void print(IComponent main) {
			String str=String.format("%s%s%s\n", qty,Help.fs(nickName,NICK_NAME_LENGTH),Help.fs(price,SUBTOTAL_LENGTH));
			System.out.print(str);	
			printMeat();
			printComponents(main);
			
		}};
		private IPrintStrategy packPrint=new IPrintStrategy() {
			@Override
			public void print(IComponent main) {
				String str=String.format("%s%s\n", qty,Help.fs(nickName,NICK_NAME_LENGTH));
				System.out.print(str);					
				printComponents(main);
				printMeat();
		}};
	

		/**
		 * print Meat
		 */
	public void printMeat() {
		if(meat!=null && meat.length()>0) {
			String str="          {{{{ "+meat+" }}}}";
			System.out.println(str);
		}		
	}
	
	public void printComponents(IComponent main) {
		ArrayList<IComponent> coms=main.components();
		if (coms==null) return;
		int total=coms.size();
		int count=0;
		boolean top=true;
		String prefix="";
		for(IComponent c:coms) {
			System.out.print(Help.fs(prefix,COMPONENT_LENGTH));
			c.print();
			count+=1;
			if (count==(total/2)) {top=false;prefix=BOTTOM_PREFIX;}
		}		
	}
	
	public Component(String c, String m, String n, String f,int cal,float p) {
		category=c.trim();meat=m.trim();nickName=n.trim();fullName=f.trim();calory=cal; price=p;qty=1;
		//printStrategy=receiptPrint; //default to avoid clone
		//if (c.equals("Staple")) components=new ArrayList<IComponent>();  //hnote: to avoid clone
		//todo
		subtotal=0;
	}
	@Override
	public String description() {return category+"\n"+meat+"\n"+nickName+"\n"+fullName;	}

	public void addChild(IComponent c) {
		if (!(this instanceof Staple)) 
			throw new IllegalArgumentException("Error! Only Staple allows to add child components!");
		
		if (components==null) components= new ArrayList<IComponent>();
		components.add(c);
	}

	@Override
	public void removeChild(IComponent c) {	components.remove(c);}

	@Override
	public IComponent getChild(int i) { return components.get(i);}

	@Override
	public void print() {
		if(this instanceof Topping) {System.out.println(nickName);return;}  //no print top item for Topping
		printStrategy.print(this);
	}
	
	@Override
	public void setReceiptStrategy() {printStrategy=receiptPrint;}
	@Override
	public void setPackStrategy() {printStrategy=packPrint;}

	@Override
	public float getPrice() {return price;}
	
    //Default version of clone() method. It creates shallow copy of an object.
	 
    public IComponent clone() throws CloneNotSupportedException
    {
        return (IComponent)super.clone();
    }
    
	/**
	 * The total child components
	 */
	public int count() {return components.size();}

	@Override
	public ArrayList<IComponent> components() {return this.components;}
}
