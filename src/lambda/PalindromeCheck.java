package lambda;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PalindromeCheck {

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {
        char[] charArray = s.toCharArray();
        char[] dupArray = new char[charArray.length];
        System.out.println("char array length"+charArray.length);
        System.out.println("dup arrau length"+dupArray.length);
        int j=0;
        for(int i= charArray.length-1;i>=0;i--){


                dupArray[j] = charArray[i];
            j++;
            System.out.println("Reversing the string is "+charArray[i]+" duparray j value "+j+" dup value "+dupArray[j-1]+" i value is "+i);
        }
        System.out.println("Output is "+Arrays.toString(dupArray));
        return 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();*/
        palindromeIndex("jay");
    }
}

