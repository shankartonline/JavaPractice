package CoreJava;

interface Messageable{
    Message getMessage(String msg);

    Message getMessage(int msg);
}
class Message{
    Message(String msg){
        System.out.print(msg);
    }

    Message(int msg){
        System.out.print(msg);
    }


}
public class ConstructorMethodReference {
    /*public static void main(String[] args) {
        Messageable hello = Message::new;
       Messageable hello = new Message("jay");
        hello.getMessage("Hello");
    }*/
}

