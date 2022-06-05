package lambda;

import java.util.Scanner;

public class CheckingScannerCharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ac = sc.next();
        System.out.println("The string value is "+sc);
        System.out.println(ac.length());
        char[] cr = sc.next().toCharArray();
        int count = 0;
        for(int i=0;i<ac.length()-1;i++){
            if(cr[i] == 'a'){
                count++;
            }
        }
        System.out.println("Number of characters "+count);
        //for(int i=0;i<ac.length())
    }
}
