package design.fiveguys;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Customer Order 
 *
 */
public class Order implements IOrder{
	private String customerName;
	private int sequence;
	ArrayList<IComponent> components;
	private IPrintStrategy printStrategy;
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");
	
	private IPrintStrategy receiptPrint=new IPrintStrategy() {
		@Override
		public void print(IComponent main) {
			System.out.println(HEADER);
			String dateStr = df.format(new Date()).toString();
			System.out.println(Help.fs(dateStr,30));
			System.out.println(Help.fs(storeName,20));
			System.out.println("Order Number:"+sequence);
			for(IComponent c:components) {c.setReceiptStrategy();c.print();System.out.println();}
			System.out.println("Total:"+getTotal());
		}};
		private IPrintStrategy packPrint=new IPrintStrategy() {
			@Override
			public void print(IComponent main) {
				System.out.println("\n---------------PACK---------------------------\n");
				System.out.println("Patties  - 1"); //? todo
				System.out.println("Order Number:"+sequence);
				String dateStr = df.format(new Date()).toString();
				System.out.println(Help.fs(dateStr,30));
				System.out.println(Help.fs(storeName,20));
				for(IComponent c:components) {c.setPackStrategy();c.print();System.out.println();}
		}};
	
	
	private final static String storeName="FIVE GUYS";
	private final static String HEADER="\n---------------Receipt---------------------------\n"+storeName+"\n"
			+ "BURGERS AND FRIES\n"
			+ "STORE # CA-1294\n"
			+ "5353 ALMADEN EXPY N60\n"
			+ "SAN JOSE, CA 95118\n"
			+ "(P) 408-264-9300\n\n\n";
	
	
	public Order(String customerName,int sequence) {
		this.customerName=customerName;
		this.sequence=sequence;
		//components= new ArrayList<IComponent>();
	}
	
	/**
	 * The total amount of the order
	 */
	public float getTotal() {
		float total=0;
		for(IComponent c:components) total+=c.getPrice();
		return total;
	}
	/**Print order detail
	 * 
	 */
	@Override
	public void printReceipt() {
		printStrategy=receiptPrint;
		printStrategy.print(null);
	}

	@Override
	public void printPack() {
		printStrategy=packPrint;
		printStrategy.print(null);
	}
	
	@Override
	public void addChild(IComponent c) {
		if (components==null) components= new ArrayList<IComponent>();
		components.add(c);
	}

	@Override
	public void removeChild(IComponent c) {	
		components.remove(c);
	}
	
	/**
	 * The total child components
	 */
	@Override
	public int count() {return components.size(); }
}
