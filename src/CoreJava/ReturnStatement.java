package CoreJava;

public class ReturnStatement {
    public static void main(String[] args) {
        methodReturn();
    }
    static void methodReturn(){
        if(true)
            return;

        System.out.println("this is printed");
           // return 10;

    }
}
