package lambda;

/*
https://www.youtube.com/watch?v=5co5Gvp_-S0

 */

public class NonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(countChar("jayashanjkar"));
    }

    public static char countChar(String s){
        int char_count[] = new int[26];
        for(char c : s.toCharArray()) {
            char_count[c - 'a']++;
        }

        for(char d : s.toCharArray()){
            if(char_count[d - 'a'] == 1) return d;
        }
        return '-';
    }
}
