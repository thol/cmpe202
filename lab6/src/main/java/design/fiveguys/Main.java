package design.fiveguys;

public class Main {

	public static void main(String[] args) {
		IOrder order;
		IFactory factory=new Factory();
		int seq;
		
 		 seq=1;
		 order = new Order("test1",seq++);
		 IComponent burger1=factory.getStaple("lcb");  //price 4.5
		 burger1.addChild(factory.getTopping("lettuce"));
		 burger1.addChild(factory.getTopping("grilled onions"));
		 burger1.addChild(factory.getTopping("pickles"));
		 order.addChild(burger1);
		 
		 
		 IComponent burger2=factory.getStaple("lcb"); //price 4.5
		 burger2.addChild(factory.getTopping("lettuce"));
		 burger2.addChild(factory.getTopping("grilled onions"));
		 order.addChild(burger2);
		 

		 IComponent fry1=factory.getFry("large CAJ"); 
		 order.addChild(fry1);
		 
		 order.printReceipt();
		 order.printPack();
	}
			
}
