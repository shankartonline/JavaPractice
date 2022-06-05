package Manual.scribble;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "111116";
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) == str.charAt(str.length()-1-i)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
