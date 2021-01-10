package lambda;

import java.util.HashSet;

public class permutuation {
    public static void main(String[] args) {
        int arr[] ={1,2,2};
        printPermutuations(arr,0);

    }

    public static void printPermutuations(int a[],int cid){
        if(cid == a.length -1){
            printArray(a);
            return;
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i=cid;i<a.length;i++){
            if(hashSet.contains(a[i]) == true)
                continue;
            hashSet.add(a[i]);
            swap(a,i,cid);
            printPermutuations(a,cid+1);
            swap(a,i,cid);
        }
    }

    public static void printArray(int[] a){
        System.out.println("");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }

    public static void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
