package lambda;

public class SampleFunctinalClass {
    public static void main(String[] args) {
        SampleFunctionalInterface sampleFunctionalInterface = () -> System.out.println("WINNER");
        sampleFunctionalInterface.sum();
        sampleFunctionalInterface.testDefault1();
        SampleFunctionalInterface sampleFunctionalInterface1;
        SampleFunctionalInterface.testStatic();
    }
}
