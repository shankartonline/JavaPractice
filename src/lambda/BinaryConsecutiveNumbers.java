package lambda;

import java.util.Scanner;

public class BinaryConsecutiveNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        StringBuffer binary = new StringBuffer();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(n>0){
            binary.append(n%2);
            n = n/2;
        }
        System.out.println("Final value of N is "+binary);
        char[] ch = binary.toString().toCharArray();
        int maxCount = 0;

        int tempCount = 0;
        for(int i=0;i<ch.length;i++){
            System.out.println("Char value is"+ch[i]);
            if('1' == ch[i]){
                tempCount++;
            } else {
                tempCount = 0;
            }
            if(tempCount >= maxCount){
                maxCount = tempCount;
            }
        }
        System.out.println("maxcount is "+maxCount);
        scanner.close();
    }
}
