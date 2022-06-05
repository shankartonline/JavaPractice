package Manual.interview;
//https://www.youtube.com/watch?v=jKF9AcyBZ6E

public class MinSubArrayQuestion {
    public static void main(String[] args) {
        int sum[] = {2,3,4,5,6,4,3,2};
        System.out.println(subArray(11,sum));
    }

    public static int subArray(int search, int[] val){
        int defaults = Integer.MAX_VALUE;
        int left = 0;
        int result = 0;
        for(int i=0;i<val.length;i++){
            result+=val[i];
            while(result >= search){

                defaults = Math.min(result, i+1 -left);
                result-=val[left];
                left++;
            }
        }
        return (defaults != Integer.MAX_VALUE) ?defaults:0;
    }
}
