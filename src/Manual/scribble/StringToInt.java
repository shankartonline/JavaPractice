package Manual.scribble;

public class StringToInt {
    public static void main(String[] args) {
        String s = "123";
        System.out.println("char value at "+s.charAt(0));
        int sum = 0;
        for (int i=0;i<s.length();i++){
            sum = sum * 10 + ((int)s.charAt(i) - 48);
        }
        System.out.println("sum is "+sum);

        System.out.println("reverse string is "+reverseWords("ice"));
    }

    public static String reverseWords(String str) {

        String finalStr = "";
        String tempStr = "";

        for (int i = str.length()-1; i >=0; i--) {
            char c = str.charAt(i);




                tempStr = tempStr + c;
            System.out.println("temstr is "+tempStr);

        }

        //finalStr = tempStr + finalStr;

        return tempStr;
    }
}
