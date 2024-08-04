  import java.util.*;
  public static int Smallest_Element(int[] arr) {
    int min = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
        min = Math.min(min, arr[i]);
    }
    
    return min;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt();
    
    int[] arr = new int[N];
    
    for (int i = 0; i < N; i++) {
        arr[i] = scanner.nextInt();
    }
    
    System.out.println(Smallest_Element(arr));
    
    scanner.close();
}