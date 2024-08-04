/*Problem statement
You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.

You don't need to print or return anything, just change in the input array itself */
import java.util.Scanner;

public class Swap_Alternate {
     public static void swapAlternate(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            swapAlternate(arr);
            
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
}
