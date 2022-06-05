package Manual.scribble;

public class PeakElement {


    public static void main(String[] args) {
        int[] sc = {1,2,1,120,10};
        System.out.println(peekElement(sc));
    }

    public static int peekElement(int[] k){
        int left = 0;
        int right = k.length -1 ;
        while(left< right){
            int mid = left + (right - left) /2;
            if(k[left] < k[mid +1]){
                left = mid +1;
            }else {
                right = mid;
            }

        }
        return left;
    }

}
