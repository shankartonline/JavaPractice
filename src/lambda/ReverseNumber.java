package lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        int[] arrCopy = new int[n];
        //String[] arrCopy = new String[n];
        StringBuilder resultString = new StringBuilder();

        Set<String> sset = new HashSet<String>();


        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = n-1; i >= 0; i--) {
            System.out.println(Integer.parseInt(arrItems[i]));
            int arrItem = Integer.parseInt(arrItems[i]);
            String appendString = arrItem+" ";
            resultString.append(appendString);
        }
        System.out.println(resultString);


        scanner.close();
    }
}
