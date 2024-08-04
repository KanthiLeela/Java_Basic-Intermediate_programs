/*Problem statement
You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list. */
import java.util.Scanner;
public class Second_Largest {
     public static int secondLargestElement(int[] arr, int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        
        // Check if there was no valid second largest element
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest element.");
        }
        
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int t = scanner.nextInt();
        
        // Process each test case
        for (int testCase = 0; testCase < t; testCase++) {
            // Read the size of the array
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            // Read elements of the array
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            // Find and print the second largest element
            try {
                System.out.println(secondLargestElement(arr, n));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        
        scanner.close();
    }
}
