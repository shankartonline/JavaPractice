package Manual;

import java.util.Arrays;

public class SortingNumbers {
    public static void main(String[] args) {
        //creating an instance of an array
        int[] arr = new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp = 0;
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

            System.out.println("Array elements after sorting:"+arr[i]);
        }
    }
}
