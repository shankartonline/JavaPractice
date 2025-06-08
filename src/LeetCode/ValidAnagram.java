package LeetCode;

import java.util.HashMap;
import java.util.Map;

/*
Valid Anagram

Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true

Example 2:

Input: s = "jar", t = "jam"

Output: false

Constraints:

    s and t consist of lowercase English letters.



Recommended Time & Space Complexity

You should aim for a solution with O(n + m) time and O(1) space, where n is the length of the string s and m is the length of the string t.

Hint 1

A brute force solution would be to sort the given strings and check for their equality. This would be an O(nlogn + mlogm) solution. Though this solution is acceptable, can you think of a better way without sorting the given strings?

Hint 2

By the definition of the anagram, we can rearrange the characters. Does the order of characters matter in both the strings? Then what matters?

Hint 3

We can just consider maintaining the frequency of each character. We can do this by having two separate hash tables for the two strings. Then, we can check whether the frequency of each character in string s is equal to that in string t and vice versa.

 */
public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "racecarq";
        String s2 = "carrace";
        System.out.println("the final value is"+isAnagram(s1,s2));
    }

    private static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] s1Char = s1.toCharArray();
        char[] s2char = s2.toCharArray();
        Map<Character,Integer> s1Map = new HashMap<>();
        Map<Character,Integer> s2Map = new HashMap<>();
        for(char s : s1Char){

            s1Map.put(s, s1Map.getOrDefault(s, 0) + 1);

        }
        for(char s : s1Char){

            s2Map.put(s, s2Map.getOrDefault(s, 0) + 1);

        }

        for(Map.Entry<Character, Integer> entry : s1Map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            if(!s2Map.containsKey(key) || s2Map.get(key) != value) {
                return false;
            }
        }

        return true;
    }
}


/*
public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "racecarq";
        String s2 = "carrace";
        System.out.println("the final value is " + isAnagram(s1, s2));
    }

    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charCounts = new int[26];  // O(1) space complexity

        // Count characters in s1
        for (char c : s1.toCharArray()) {
            charCounts[c - 'a']++;
        }

        // Subtract counts using s2
        for (char c : s2.toCharArray()) {
            int index = c - 'a';
            charCounts[index]--;
            // Early exit if count becomes negative
            if (charCounts[index] < 0) {
                return false;
            }
        }

        return true;
    }
}

 */