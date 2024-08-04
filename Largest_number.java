/*Problem statement
Write a program that takes three integers as input and prints the largest of the three numbers.

 */
import java.util.Scanner;
public class Largest_number 
{
public static void main(String[] args)
{
     // write your code here

     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     if(a > b && a > c){
       System.out.println(a);
     }
     else if(b > a && b>c){
       System.out.println(b);
     }

     else
     {
       System.out.println(c);
     }
   }
}
