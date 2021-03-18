package CoreJava;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        triangle.add(firstrow);
        int num = 5;
        for(int i=1;i<num;i++){
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> tempRow = new ArrayList<>();
            tempRow.add(1);
            for(int j=1;j<i;j++){
                tempRow.add(prevRow.get(j-1) + prevRow.get(j));
            }
            tempRow.add(1);
            triangle.add(tempRow);
        }
        triangle.forEach(s -> s.forEach(p -> System.out.println(" "+p)));
    }
}
