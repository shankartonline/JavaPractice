package Manual.scribble;

public class BinSear {
    public static void main(String[] args) {
        int[] arr = {5,1,6,70,65};
        int x = 70;
        System.out.println(binSearch(arr,0,arr.length-1,x));
    }

    public static int binSearch(int[] arr,int l,int r,int x){
        if(r >=l){

            int mid = l + (r - l) / 2;
            if(arr[mid] == x){
                System.out.println("Found Match in middle");
                return mid;
            }

            if(arr[mid] > x){
                return binSearch(arr,l,mid-1,x);
            }
                return binSearch(arr,mid+1,r,x);

        }
        return -1;
    }
}
