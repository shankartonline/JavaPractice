package Manual.scribble;

public class PeakElementScribble {
    public static void main(String[] args) {
        int[] sc = {1,2,1,120,10};
       // System.out.println(peekElement(sc));
    }

    static void peekElement(int[] pr){
        int left = 0 ;
        int right = pr.length -1;
        while(left < right){
            int mid = left + (left - right)/2;
            if(pr[mid]< pr[mid+1]) {
                left = mid + 1;
            }

        }
    }
}
