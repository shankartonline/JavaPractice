package lambda;

import java.util.*;

public class PalindromeWithStrackQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("input string is"+s);
        //Queue queue = new Qu;
        char[] cha = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<cha.length;i++){
            stack.push(cha[i]);
        }
        for(int i=0;i<cha.length;i++){
            //System.out.println("current char is "+cha[i]);
            //System.out.println("stack element is "+stack.pop());
            if(cha[i] != stack.pop()){
                System.out.println("not equal");
                break;
            }
            //System.out.println("Pop output is "+stack.pop());
        }
        //System.out.println("Stack method is"+stack.toString());
        //stack.


    }
}
