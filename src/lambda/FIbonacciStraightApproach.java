package lambda;

import java.util.Scanner;

public class FIbonacciStraightApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(sc.nextInt());
        //System.out.println(fib(4));
        for(int i=0;i<n;i++){
            System.out.print(" "+fib(i));
        }
    }

    static int fib(int n){
        if(n<=1){
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}
