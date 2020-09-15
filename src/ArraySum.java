public class ArraySum {

    public static void main(String[] args) {
        System.out.println("THis is sample program for Finding the Array Size");
        int[] data = {1,2,3};
        int sum = 0;
        for(int i=0;i<data.length;i++){
            sum = sum +data[i];
        }
        System.out.println("The Summation is "+sum);

    }

}
