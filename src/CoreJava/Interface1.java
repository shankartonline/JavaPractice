package CoreJava;

public interface Interface1 {
    int gain = 0;
    void getname();

    private void getNames() {
        System.out.println("fdfgd");
    }

    default String getValue(){
        System.out.println("this is Get value method");
        System.out.println(gain);
        return "value";
    }

    static String getName(){
        return "jay";
    }
}
