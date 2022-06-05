package Manual.scribble;

public class MinSumScribOne {
    public static void main(String[] args) {
        int sum[] = {5,1,3,5,10,7,4,9,2,8};
        System.out.println(minSubArray(sum,15));
    }

    private static int minSubArray(int[] arr,int x){
        int left = 0;
        int result = 0;
        int defaults = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            result+= arr[i];
            while(result>=x){
                //defaults = Math.min(result,i+1 - left);
                defaults = i+1 - left;
                result-= arr[left];
                left++;
            }

        }
        return defaults != Integer.MAX_VALUE ?defaults:0;
    }



}
