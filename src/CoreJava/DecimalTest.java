package CoreJava;

import java.util.Arrays;
import java.util.stream.Stream;

public class DecimalTest {
    //public int static counts;
    public static void main(String[] args) {
        String a = "dev,prod";
        System.out.println(Arrays.stream(a.split(",")));
        Stream<String> call = Stream.of("Geeks", "For",
                "Geeks", "A",
                "Computer", "Portal");
        //int count = 0;
        String sentence = "The cat has black fur and black eyes black black cat";
        String[] bites = sentence.trim().split("\\s+");
        String in = "black cat";
        long i = Stream.of(bites).filter(e->(Arrays.asList(in.split("\\s")).contains(e))).count();
        System.out.println(i);
    }
}
