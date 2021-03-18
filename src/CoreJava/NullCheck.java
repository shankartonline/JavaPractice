package CoreJava;

import java.util.*;

public class NullCheck {
    public static void main(String[] args) {
        String s = "jay";
        Optional<String> op = Optional.ofNullable(s);
        /*String s = "";
        if(Objects.nonNull(s)){
            System.out.println("S is non null object");
        }
        else {
            System.out.println("S is null object");
        }
        List<String> col = Collections.emptyList();
        for(String b : col){
            System.out.println("first item"+s);
        }
        col.add("jay");
        col.add("ram");
        for(String b : col){
            System.out.println("first item"+s);
        }*/

        int o= 1-2;
        System.out.println(o);
        Map<Integer,Integer> n = new HashMap<Integer,Integer>();
        n.put(1,o);
        n.entrySet().stream().forEach(e ->
                System.out.println("Key : " + e.getKey() + " value : " + e.getValue()));
    }
}
