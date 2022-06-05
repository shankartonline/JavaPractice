package CoreJava;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set as = new HashSet();
        as.add("a");
        as.add("a");
        Set<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(3);
        long start = System.currentTimeMillis();

            hs.stream().forEach(s -> System.out.println(s));


        long end = System.currentTimeMillis();
        System.out.println("difference "+(end-start));
    }
}
