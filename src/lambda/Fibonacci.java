package lambda;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k,l=1,m=1;
        System.out.print("1 1");
        //int number = 1;
        for(int i = 0;i<a;i++){
            k = l+m;
            System.out.println(" "+k);
            l=m;
            m=k;
        }


    }

    public static int  fibonacci(int number){
        int j = number + (number-1);
        return j;
    }
}
