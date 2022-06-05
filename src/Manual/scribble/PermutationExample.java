package Manual.scribble;

public class PermutationExample {
    public static void main(String[] args) {
        int[] s = {2,5,1};
        permutate(s,0);
        //printArray(s);
    }

    public static void permutate(int[] arr, int cid){
        //System.out.println("inside permutate");
        //System.out.println("length is "+arr.length);
        if(cid == arr.length){
            printArray(arr);
            return;
        }
        for(int i=cid;i<arr.length;i++){
            swap(arr,i,cid);
            permutate(arr,cid+1);

            swap(arr,i,cid);
        }
    }

    public static void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        //int tmp =
    }

    public static void printArray(int[] a){
        System.out.println("\n");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
