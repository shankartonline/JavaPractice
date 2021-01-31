import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDimensionArray {



    private static final Scanner scanner = new Scanner(System.in);

    public static void printSum(int[][] arr){
        int max_sum = Integer.MIN_VALUE;
        int rows = arr.length;
        int columns = arr[0].length;
        for(int i = 0; i < rows-2;i++){
            for(int j=0;j<columns-2;j++){
                int hourSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                max_sum = Math.max(hourSum,max_sum);
            }
        }
        System.out.println(max_sum);
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        printSum(arr);

        scanner.close();
    }
}
