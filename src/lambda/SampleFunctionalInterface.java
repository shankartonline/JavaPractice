package lambda;

@FunctionalInterface
public interface SampleFunctionalInterface {
    public void sum();

    public default void testDefault(){
        System.out.println("This is sample testDefault method");
    }

    public default void testDefault1(){
        System.out.println("This is sample testDefault1 method");
    }

    public static void testStatic(){
        System.out.println("This is Sample test static method");
    }
}
