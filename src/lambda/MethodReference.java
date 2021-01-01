package lambda;

public class MethodReference {
    public static void main(String[] args) {
        System.out.println("this is used to check the method Reference");
        MethodReferenceImpl methodReference = MethodReference::setMessage;
        methodReference.getMessage();
        System.out.println("after the setMessage is called");
    }

    public static void setMessage(){
        System.out.println("this is setting the message");
    }
}
