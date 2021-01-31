package CoreJava;

public class ConstructorEx {
    final static int s = 10;
    ConstructorEx(){
        System.out.println("called by default");
    }

    final void getCustomer(){
        
    }

    public static void main(String[] args) {

        ConstructorEx constructorEx = new ConstructorEx();
        System.out.println("this is the main method");
        SingleTonClass singleTonClass = SingleTonClass.getInstance();
    }
}
