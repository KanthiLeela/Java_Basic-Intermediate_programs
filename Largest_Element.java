/*
 * Problem statement
Given an array ‘arr’ of size ‘n’ find the largest element in the array.



Example:

Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]

Output: 5

Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
 */

import java.util.Scanner;

public class Largest_Element {
     static int largestElement(int[] arr, int n) {
        int max = arr[0];
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println(largestElement(arr, n));
        
        scanner.close();
    }
    
}
