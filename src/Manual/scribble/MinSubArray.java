package Manual.scribble;

public class MinSubArray {

    public static void main(String[] args) {
        int sum[] = {2,3,4,5,6,4,3,2};
        System.out.println(subArray(11,sum));
    }

    static int subArray(int x,int sums[]){
        int result = 0;
        int left =0;
        int defaults = Integer.MAX_VALUE;
        for(int i=0;i< sums.length;i++){
            result+=sums[i];
            while(result >= x){
                defaults = Math.min(result,i+1 - left);
                result-=sums[left];
                left++;
            }
        }
        return defaults;
    }
}
