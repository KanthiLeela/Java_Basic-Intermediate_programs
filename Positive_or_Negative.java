/*You are given an integer n. If the number is less than
 zero then the print ‘Negative’ otherwise the print ‘Positive’. */

import java.util.Scanner;

public class Positive_or_Negative {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Positive");
		}
		 
	}
    
}
