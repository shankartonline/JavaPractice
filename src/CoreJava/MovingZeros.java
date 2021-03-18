package CoreJava;

import java.util.Arrays;

public class MovingZeros {
    public static void main(String[] args) {
        int nums[] = {0,0,3,4,12};
        System.out.println(Arrays.toString(nums));
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        for(int i = index;i < nums.length; i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }


}
