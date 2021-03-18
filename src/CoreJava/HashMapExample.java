package CoreJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,String> sm = new HashMap<String,String>();
        sm.put("h","A");
        System.out.println(sm.getOrDefault("a","hello"));
    }
}
