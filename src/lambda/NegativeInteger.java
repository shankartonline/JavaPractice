package lambda;
/*
this will capture the number which are smaller
 */
public class NegativeInteger {
    static int  i = 321;
    public static void main(String[] args) {
        System.out.println(calculate(i));
    }

    public static int calculate(int i){
        int rev = 0;
        while(i!= 0){
            int temp = i%10;
            //System.out.println(i);
            int newrev = rev*10 + temp;
            if((newrev - temp)/10 != rev){
                return 0;
            }
            i = i/10;
            rev = newrev;
        }

        System.out.println("print rev "+rev);
        //int rev = i/10;
        //System.out.println("rev is "+rev);
        return rev;
    }
}
