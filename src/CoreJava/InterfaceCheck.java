package CoreJava;

public class InterfaceCheck implements Interface1{
    public static void main(String[] args) {
        System.out.println("Int " + Interface1.getName()+" gain "+Interface1.gain + " check private methods ");;
        System.out.println();
        System.out.println(" "+ModelSample.samples);
    }

    @Override
    public void getname() {

    }
}
