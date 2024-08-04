/*Given a number, print " Multiple of 5" if the number is a multiple of 5, otherwise print "Not a Multiple of 5"

for N = 5
"Multiple of 5"  */

import java.util.*;
public class Multiple
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if(num % 5 ==0){
			System.out.println("Multiple of 5");
		}
		else{
			System.out.println("Not a Multiple of 5");
		}
		 
	}
} {
    
}
