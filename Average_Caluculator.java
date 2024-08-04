//Average Calculator

/*
 * Problem statement
Your goal is to create a program called Average Calculator that takes three integer inputs, calculates their average, and displays the result.

Detailed explanation ( Input/output format, Notes, Images )
Sample input 1:
1
2
3
Sample output 1:
2
 Explanation :
We have a= 1,b= 2 and c =3  
avg = (sum of elements ) / no of elements   
avg = (1+2+3)/3 =  6/3 = 2 
 */

import java.util.Scanner;

public class Average_Caluculator {
    public static void main(String[] args) {
        //  take input 
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg = (a+b+c)/3;
        
		// write your logic ...
        System.out.println(avg);
		
    }
    
}
