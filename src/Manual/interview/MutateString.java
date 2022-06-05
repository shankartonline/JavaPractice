package Manual.interview;

import java.util.HashSet;

public class MutateString {
    public static void main(String args[])
    {
        int[] a ={2,2,3};
        System.out.println("max value is " +Integer.MAX_VALUE);
        printpermutation(a,0);
    }

    private static void printpermutation(int[] a, int cid) {
        if(cid == a.length)
        {
            printArray(a);
            return;
        }
        HashSet hash = new HashSet();
        for(int i=cid;i<a.length;i++)
        {
            if(hash.contains(a[i]))
                continue;
            hash.add(a[i]);
            swap(a,i,cid);
            printpermutation(a,cid+1);
            swap(a,i,cid);
        }
    }

    private static void swap(int[] a,int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void printArray(int[] a)
    {
        System.out.println("\n");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
