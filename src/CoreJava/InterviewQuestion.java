package CoreJava;

import java.util.Scanner;

public class InterviewQuestion {
    private String name;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseLine(sc.nextLine());
    }

    public static void reverseLine(String name){
        String[] reverseLine =name.split(" ");
        //int i= name.split(" ").length;
        for(int i =reverseLine.length - 1 ;i>0;i--){
            System.out.println(reverseLine[i]+" ");
        }
    }
}
