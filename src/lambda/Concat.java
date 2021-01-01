package lambda;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner stringScanner = new Scanner(System.in);

        int r;
        //System.out.println("the integer output is"+i);
        double p;
        //System.out.println("the double output is"+d);
        String a;

        int i = 0;

        double d = 0;

        String s = "hackerrank";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        r =  Integer.parseInt(scanner.nextLine());
        p = Double.parseDouble(scanner.nextLine());
        a = stringScanner.nextLine();
        System.out.println(a);
        /* Print the sum of both integer variables on a new line. */
        System.out.println(r+i);
        /* Print the sum of the double variables on a new line. */
        System.out.println(p+d);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s+" "+a);
    }
}
