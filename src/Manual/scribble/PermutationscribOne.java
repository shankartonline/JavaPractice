package Manual.scribble;

import java.util.HashSet;

public class PermutationscribOne {
    public static void main(String[] args) {
        int[] ar = {2,2,3};
        permutation(ar,0);
    }

    private static void permutation(int[] ar,int cid){
        if(cid == ar.length){
            printArray(ar);
            return;
        }

        HashSet sc = new HashSet();

        for(int i =cid;i< ar.length;i++){
            if(sc.contains(ar[i])){
                continue;
            }
            sc.add(ar[i]);
            swap(ar,i,cid);
            permutation(ar,cid+1);
            swap(ar,i,cid);
        }

    }

    private static void printArray(int[] cr){
        //String c= "one";
        for(int i:cr){
            System.out.print(i);
        }
        System.out.println(" ");
    }

    private static void swap(int[] p,int i, int j){
        int temp = p[i];
        p[i] = p[j];
        p[j] = temp;
    }



}
