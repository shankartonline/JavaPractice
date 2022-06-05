package Manual;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class TestClass {
    public static void main(String[] args) {
        int[] s ={3,4};
        System.out.println("integer size is "+s.length);
        String[] arr = {"jay","ram"};
        System.out.println("array size is"+arr.length);
        for(int i =0; i<s.length;){
            //System.out.println(s[i]);
            i++;
        }
        SampelEnum df = null;
        if(df!=null){
            System.out.println("Not Null");
        }
        int i=11;
        System.out.println("i value is "+i/2);

        Stack sa = new Stack();
        //System.out.println(sa.peek());
        Queue<String> qu = new PriorityQueue();
        qu.add("one");
        qu.add("two");
        qu.peek();
        System.out.println(" qu name is "+qu.remove());
        for(String sample: qu){
            System.out.println(sample);
        }

        System.out.println(" MAX_INT "+Integer.MAX_VALUE);
        System.out.println(" MIN INT "+Integer.MIN_VALUE);
    }
}
