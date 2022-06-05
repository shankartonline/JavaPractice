package Manual;

import java.util.HashMap;
import java.util.Map;

public class CharacterCheck {
    public static void main(String[] args) {
        char[] c = {'a','b','c'};
        System.out.println(c.length);
        String l = "jaya";
        System.out.println(l.length());

        //romanToInt("MCMXCIV");

        intToRoman(87);



    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0; i--) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result-=map.get(s.charAt(i));
            }
            else {
                result+=map.get(s.charAt(i));
            }
        }
        System.out.println("Roman Number "+result);
        return result;
    }


    public static String intToRoman(int num) {
        int[] intCode = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] code = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < intCode.length; i++){
            while(num >= intCode[i]){
                sb.append(code[i]);
                num-=intCode[i];
            }
        }
        System.out.println("ROMAN to number "+sb.toString());
        return sb.toString();
    }
}

