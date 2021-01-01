package lambda;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> example = s -> (s> 10);
        System.out.println(example.test(30));
        System.out.println(example.test(5));
    }
}
