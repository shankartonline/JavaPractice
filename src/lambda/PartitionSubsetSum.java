package lambda;
/*
https://www.youtube.com/watch?v=3N47yKRDed0
 */
import java.util.HashMap;

public class PartitionSubsetSum {
    public static void main(String[] args) {
        int[] nums = {1,5,6,11};
        System.out.println(canPartitionMain(nums));

    }

    public static boolean canPartitionMain(int nums[]){
        int total = 0;
        for(int i:nums){
            total += i;
        }
        if(total%2 != 0){
            return false;
        }

        return canPartition(nums,0,0,total,new HashMap<String,Boolean>());

        }


    public static boolean canPartition(int[] nums, int index, int sum, int total, HashMap<String,Boolean> state){
        String current = index + "" + sum;
        if(state.containsKey(current)){
            return state.get(current);
        }
        if(sum*2 == total){
            return true;
        }
        if(sum > total /2 || index >= nums.length){
            return false;
        }
        boolean foundPartition = canPartition(nums,index+1,sum,total,state) || canPartition(nums,index,sum+nums[index],total,state);
        state.put(current,foundPartition);
        return foundPartition;
    }
}
