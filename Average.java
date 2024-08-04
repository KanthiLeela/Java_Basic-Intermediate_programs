/*Problem statement
Given three integers, a, b and c. Create a program that calculates their average and prints the result.

Instructions:
1. Declare an integer variable named sum and calculate the sum of the three integers a, b, and c by adding them together.
2. Declare an int variable named average and calculate the average by dividing the sum by 3 (the number of integers).
Detailed explanation ( Input/output format, Notes, Images )
Sample input 1:
1
2
3
Sample output 1:
2
 Explanation :
avg = (sum of elements ) / no of elements   
avg = (a+b+c)/3 =( 1+2+3)/3 = 6/3 = 2 
Hence the output will be 2.  

public class Solution
{
    public static void main(String[] args) {
        
        int a  = 10 ;
        int b  = 20 ;
        int c  = 30 ;
        int sum = a+b+c;
        int average = sum/3;
*/
public class Average
{
    public static void main(String[] args) {
        
        int a  = 10 ;
        int b  = 20 ;
        int c  = 30 ;
        int sum = a+b+c;
        int average = sum/3;
        // write your code logic and print the result ..
        System.out.println(average);
        

        
		
    }
}
