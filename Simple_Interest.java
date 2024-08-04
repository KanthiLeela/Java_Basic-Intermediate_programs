//Simple Interest

/*Problem statement
Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.

Note: Print the answer as integer value.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
2000
2.2
4
Sample Output 1:
176
Explanation:
principal=2000,rate=2.2 and time=4.
Simple interest = (Principal*rate*time) /100
Hence answer is (2000*2.2*4)/100 = 176 */

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String args[]) {
		
		// Write code here
		 Scanner sc = new Scanner(System.in);
		 int principal_amount = sc.nextInt();
		 double rate_of_interest = sc.nextDouble();
		 double time_period = sc.nextDouble();
		 double result=(principal_amount * rate_of_interest *time_period)/100;
		 System.out.println((int)result);

		
	}
    
}
