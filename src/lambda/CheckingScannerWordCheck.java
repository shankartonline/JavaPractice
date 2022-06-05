package lambda;

import java.util.Arrays;
import java.util.Scanner;

public class CheckingScannerWordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ac = sc.nextLine();
        System.out.println("The string value is "+sc);
        System.out.println(ac.length());
        //char[] cr = sc.next().toCharArray();
        String[] st = ac.split(" ");
        Arrays.stream(st).forEach(s -> System.out.println(s));
        int count = 0;
        for(int i=0;i<st.length;i++){
            if(st[i].equalsIgnoreCase("great")){
                count++;
            }
        }
        System.out.println("Number of characters "+count);
        //for(int i=0;i<ac.length())
    }
}
