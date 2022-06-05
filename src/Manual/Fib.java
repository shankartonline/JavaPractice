package Manual;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum;
        int l=1;
        int m=1;
        for(int c=0;c<i;c++){
            //for()
            sum = l + m;

            System.out.println(sum);
            l = m;
            m = sum;
        }
    }
}
