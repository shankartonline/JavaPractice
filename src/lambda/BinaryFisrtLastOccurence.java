package lambda;

public class BinaryFisrtLastOccurence {

    public static void main(String[] args) {
        int nums[] = {2,0,0,4,4,8,8};
        int k = searchFirstElement(nums,2);
        System.out.println(k);
    }

    public static int searchFirstElement(int[] num, int target){
        int start = 0;
        int end = num.length - 1;
        while(start <=end){
            int midpoint = start + (end - start)/2;
            if(target <= num[midpoint]){
                end = midpoint - 1;
            }else{
                if(num[start] == target){
                    midpoint = start;
                }
                start = midpoint +1 ;
            }
            if(num[midpoint] == target) return midpoint;
        }
        return -1;
    }
}
