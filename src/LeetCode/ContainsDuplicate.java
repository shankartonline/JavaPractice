package LeetCode;


import java.util.Set;

/*
Contains Duplicate

Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true


Example 2:

Input: nums = [1, 2, 3, 4]

Output: false



Recommended Time & Space Complexity

You should aim for a solution with O(n) time and O(n) space, where n is the size of the input array.

Hint 1

A brute force solution would be to check every element against every other element in the array. This would be an O(n^2) solution. Can you think of a better way?

Hint 2

Is there a way to check if an element is a duplicate without comparing it to every other element? Maybe there's a data structure that is useful here.

Hint 3

We can use a hash data structure like a hash set or hash map to store elements we've already seen. This will allow us to check if an element is a duplicate in constant time.

 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println(containsDuplicate(nums1)); // Output: true
        System.out.println(containsDuplicate(nums2)); // Output: false
    }

    private static boolean containsDuplicate(int[] nums) {
        System.out.println(nums.length);
        Set<Integer> newSet = new java.util.HashSet<>();
        for(Integer num : nums){
            if(newSet.contains(num)){
                return true;
            }
            newSet.add(num);
        }

        return false;
    }

}
