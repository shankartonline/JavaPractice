package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SubsetNumbers {

    public static void main(String[] args) {
        int[] nums = {4,5,6};
        List<List<Integer>> subset = new ArrayList<>();
        subset(0,nums,new ArrayList<Integer>(),subset);
        for (List<Integer> l : subset){
            System.out.println("Begin");
            //l.forEach();
            l.forEach(k -> System.out.println(k));

            System.out.println("End");
        }

    }

    public static void  subset(int index,int[] nums,List<Integer> current,List<List<Integer>> subset){
        subset.add(new ArrayList<>(current));
        for (List<Integer> l : subset){
            System.out.println("Begin");
            //l.forEach();
            l.forEach(k -> System.out.println(" first integer "+k));

            System.out.println("End");
        }
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            subset(i+1,nums,current,subset);
            current.remove(current.size() - 1);
        }
    }
}
