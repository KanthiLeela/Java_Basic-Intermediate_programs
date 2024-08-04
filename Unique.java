/*Problem statement
You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].

Now, in the given array/list, 'M' numbers are present twice and one number is present only once.

You need to find and return that number which is unique in the array/list.

 Note:
Unique element is always present in the array/list according to the given condition. */

import java.util.Scanner;

public class Unique {
     public static int findUnique(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num;
        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int t = scanner.nextInt();
        
        // Process each test case
        for (int testCase = 0; testCase < t; testCase++) {
            // Read number of elements in the array
            int n = scanner.nextInt();
            
            // Declare the array to hold n elements
            int[] arr = new int[n];
            
            // Read the elements of the array
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            // Find and print the unique element
            System.out.println(findUnique(arr));
        }
        
        scanner.close();
    }
}
