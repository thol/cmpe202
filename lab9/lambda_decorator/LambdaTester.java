package lambda_decorator;

@SuppressWarnings("unchecked")
public class LambdaTester {

    public static void runTest()
    {
        String result = Decorator.operation(new ConcreteComponent(), Component::withH1Tag, Component::withEmTag, Component::withH1Tag);
        System.out.println( result );
    }

  public static void main( String [] args )
    {
        LambdaTester t = new LambdaTester() ;
        t.runTest() ;
    }    
    
}
