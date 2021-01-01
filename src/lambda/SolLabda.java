package lambda;

public class SolLabda{
    public static void main(String[] args) {
        System.out.println("sample program for lambda");
        new SolLabda().getNumber("jay",(String b) -> { return b+"shankar";});

    }

    public static void getNumber(String methodInput,SolLabdaInterface solLabdaInterface){
        String returnedString = solLabdaInterface.appointment(methodInput);
        System.out.println("Returned String "+returnedString);


    }
}
