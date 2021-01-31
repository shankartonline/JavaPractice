package lambda;

public class MetRef {
        public static void saySomething(){
            System.out.println("Hello, this is static method.");
        }
        public static void main(String[] args) {
            // Referring static method
            SampleFunctionalInterface sayable = MetRef::saySomething;
            // Calling interface method
            sayable.sum();
        }
    }


