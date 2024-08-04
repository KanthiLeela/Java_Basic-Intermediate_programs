/*Problem statement
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.

Note :
Duplicate number is always present in the given array/list. */
import java.util.Scanner;
public class Duplicate {
    public static int duplicateNumber(int[] arr) {
        int n = arr.length;
        int xorResult = 0;

        // XOR all the elements in the array
        for (int num : arr) {
            xorResult ^= num;
        }

        // XOR with all numbers from 0 to N-2
        for (int i = 0; i <= n - 2; i++) {
            xorResult ^= i;
        }

        // The result is the duplicate number
        return xorResult;
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
            
            // Find and print the duplicate number
            System.out.println(duplicateNumber(arr));
        }
        
        scanner.close();
    }
}
