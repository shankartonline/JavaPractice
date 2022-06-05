package Manual.scribble;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static void main(String[] args) {
        pascal(5);
    }

    private static void pascal(int x){
        System.out.println("Pascal Program");

        List<List<Integer>> triangle = new ArrayList<>();
        //List<Integer> prevList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        tempList.add(1);
        triangle.add(tempList);
        for(int i=1;i<x;i++){
            List<Integer> tList = new ArrayList<>();
            List<Integer> prevList = triangle.get(i-1);
            tList.add(1);
            for(int j=1;j<i;j++){
               tList.add(prevList.get(j-1) + prevList.get(j));
            }

            tList.add(1);
            //prevList = tempList;
            triangle.add(tList);
            tList.stream().forEach(s -> System.out.print(s));
            System.out.println("");
        }

    }
}
