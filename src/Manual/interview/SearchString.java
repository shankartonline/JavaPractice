package Manual.interview;

import java.util.HashSet;
import java.util.Set;

public class SearchString {
    public static void main(String[] args) {
        String actual = "this is this jay this";
        Set<String> sc = new HashSet<>();
        String[] arr = actual.split(" ");
        int duplicate = 0;
        for(String s : arr){
            if(!sc.add(s)){
                System.out.println(" The String duplicate value is "+s);
              duplicate++;
            }
        }
        System.out.println(" Duplicate count is "+duplicate);
    }
}
