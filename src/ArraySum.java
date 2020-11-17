import java.util.Scanner;
/*
Given an array of integers, find the sum of its elements.

For example, if the array , , so return .

Function Description

Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.

simpleArraySum has the following parameter(s):

ar: an array of integers
Input Format

The first line contains an integer, , denoting the size of the array.
The second line contains  space-separated integers representing the array's elements.

Constraints


Output Format

Print the sum of the array's elements as a single integer.

Sample Input

6
1 2 3 4 10 11
Sample Output

31
 */
public class ArraySum {

    public static void main(String[] args) {
        //System.out.println("THis is sample program for Finding the Array Size");
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        //System.out.print("Enter first number- ");
        int a= sc.nextInt();
        //System.out.println("input integer value is "+a);
        int[] size = new int[a];
        for(int i=0;i<a;i++){
            size[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<size.length;i++){
            sum = sum +size[i];
        }
        System.out.println(sum);
    }
}
