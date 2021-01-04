package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintStringEvenOdd {
    public static void main(String[] args) {
        //System.out.println("starting");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        List<String> reverseList = new ArrayList<String>();
        for(int j=0;j<i;j++){
            String s=scanner.next();
            reverseList.add(s);
        }
        for(String reverse:reverseList){
            StringBuilder evenString = new StringBuilder();
            StringBuilder oddString = new StringBuilder();
            for(int k=0;k<reverse.length();k++){
                if(k%2 == 0){
                    evenString.append(reverse.charAt(k));
                }else{
                    oddString.append(reverse.charAt(k));
                }
            }
            System.out.println(evenString+" "+oddString);
        }

    }
}
