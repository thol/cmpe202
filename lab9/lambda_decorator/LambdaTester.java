package ldecorator;

@SuppressWarnings("unchecked")
public class LambdaTester {

    public static void runTest()
    {
        String result = Decorator.operation(new ConcreteComponent(), Component::withEmTag, Component::withH1Tag);
        System.out.println( result );
    }

  public static void main( String [] args )
    {
        LambdaTester t = new LambdaTester() ;
        t.runTest() ;
    }    
    
}
